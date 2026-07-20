package com.fleetmanagement.demo.ai;

import com.fleetmanagement.demo.model.Dashboard;
import com.fleetmanagement.demo.service.dashboardservice;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class AIService {
    @Autowired
    private  ChatClient chatClient;

    @Autowired
    private dashboardservice dashser;




    public String ask(){

        Dashboard dashmessage= dashser.getdashboard();
        String message= """  
                Customers : %d
                Shipments : %d
                Delivered : %d
                AssignedDrivers : %d
                TotalDrivers: %d
                In transit Drivers :%d
                Warehouse utilization :%.2f%%
                Generate a professional summary.""".formatted(
                dashmessage.getTotalCustomers(),
                dashmessage.getCreatedShipments(),
                dashmessage.getDeliveredShipments(),
                dashmessage.getAssignedDrivers(),
                dashmessage.getTotalDrivers(),
                dashmessage.getInTransitShipments(),
                dashmessage.getWarepercentutilization()



        );


        return chatClient.prompt().system("""
          You are an AI Fleet Operations Report Generator for a logistics company.
                
                  Your task is to generate a detailed operational report based only on the fleet statistics provided by the user.
                
                  Report Structure:
                
                  1. Executive Summary
                  - Briefly summarize today's fleet performance.
                
                  2. Shipment Analysis
                  - Analyze shipment creation, deliveries, and shipments in transit.
                  - Highlight any observations.
                
                  3. Resource Utilization
                  - Evaluate driver availability and vehicle utilization.
                  - Mention if resources appear sufficient or constrained.
                
                  4. Warehouse Analysis
                  - Analyze warehouse utilization.
                  - Mention potential capacity concerns if utilization is high.
                
                  5. Operational Insights
                  - Identify trends, strengths, or possible bottlenecks.
                  - Base every insight only on the supplied data.
                
                  6. Recommendations
                  - Provide practical recommendations for improving fleet operations.
                  - If the data indicates healthy performance, mention that no immediate action is required.
                
                  Rules:
                  - Never invent values.
                  - Never assume missing information.
                  - Base conclusions only on the provided statistics.
                  - Use clear professional English.
                  - Format the report with headings and bullet points where appropriate.
        """).user(message).call().content();
    }

}
