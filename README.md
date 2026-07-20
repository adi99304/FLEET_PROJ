<div align="center">

# 🚚 NexisFleet

### AI-Powered Fleet Management & Logistics Platform

<img src="https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk">
<img src="https://img.shields.io/badge/Spring_Boot-3.5-green?style=for-the-badge&logo=springboot">
<img src="https://img.shields.io/badge/React-Frontend-61DAFB?style=for-the-badge&logo=react">
<img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql">
<img src="https://img.shields.io/badge/Spring_AI-Ollama-purple?style=for-the-badge">
<img src="https://img.shields.io/badge/REST-API-orange?style=for-the-badge">
<img src="https://img.shields.io/badge/Hibernate-JPA-brown?style=for-the-badge">

---

### Intelligent Logistics • Fleet Automation • AI Assisted Operations

*A modern Fleet Management System built using Spring Boot, React, MySQL and Spring AI.*

</div>

---

# 📖 Overview

NexisFleet is an enterprise-style Fleet Management Platform developed to automate logistics operations, optimize shipment management, and provide AI-assisted operational insights.

Unlike traditional CRUD-based fleet systems, NexisFleet introduces intelligent decision-making by combining logistics algorithms with Large Language Models (LLMs) through Spring AI and Ollama.

The platform allows organizations to efficiently manage:

- 📦 Shipments
- 🚚 Vehicles
- 👨‍✈️ Drivers
- 🏭 Warehouses
- 👥 Customers

while providing AI-generated operational summaries and intelligent fleet recommendations.

---

# 🎯 Project Goals

The objective of NexisFleet is to build an extensible logistics platform capable of handling real-world fleet operations while demonstrating enterprise backend development practices.

The project focuses on:

- Clean Spring Boot architecture
- Scalable REST APIs
- Database normalization
- Intelligent shipment allocation
- Warehouse capacity management
- AI-assisted analytics
- Modular backend design
- Modern React frontend

---

# ✨ Key Features

## 📦 Shipment Management

- Create shipments
- Update shipment status
- Automatic tracking number generation
- Warehouse allocation
- Vehicle assignment
- Estimated delivery tracking
- Customer linkage
- Shipment history

---

## 🚚 Vehicle Management

- Vehicle registration
- Capacity management
- Availability tracking
- Driver assignment
- Maintenance status
- Vehicle utilization

---

## 👨‍✈️ Driver Management

- Driver registration
- Driver availability
- Vehicle assignment
- Driver status tracking
- Operational availability monitoring

---

## 🏭 Warehouse Management

- Warehouse creation
- Capacity monitoring
- Remaining storage calculation
- Automatic warehouse allocation
- City-based warehouse lookup

---

## 👥 Customer Management

- Customer registration
- Shipment history
- Address management
- Contact management

---

## 🤖 AI Fleet Assistant

Powered by:

- Spring AI
- Ollama
- Qwen

Capabilities include:

- Fleet Report Generation
- Dashboard Summaries
- Operational Insights
- Shipment Analysis
- Fleet Recommendations
- Natural Language Queries

---

# 🚀 Why NexisFleet?

Traditional fleet systems only store information.

NexisFleet helps users **understand** their logistics operations using Artificial Intelligence.

Examples:

✔ Generate operational reports

✔ Explain fleet performance

✔ Summarize dashboard statistics

✔ Provide logistics recommendations

✔ Answer natural language questions

---

# 🛠 Technology Stack

| Category | Technologies |
|-----------|-------------|
| Backend | Spring Boot 3 |
| Language | Java 21 |
| Frontend | React |
| Database | MySQL |
| ORM | Hibernate / Spring Data JPA |
| AI | Spring AI |
| LLM | Ollama (Qwen) |
| Build Tool | Maven |
| API Testing | Postman / Swagger |
| Version Control | Git |
| IDE | IntelliJ IDEA |
| Frontend Build | Vite |

---

# 🏗 System Architecture

```

                +-----------------------+
                |     React Frontend    |
                +-----------+-----------+
                            |
                            |
                   REST API Calls
                            |
                            ▼
                +-----------------------+
                |    Spring Boot API    |
                +-----------+-----------+
                            |
      ------------------------------------------------
      |          |           |         |             |
      ▼          ▼           ▼         ▼             ▼

 Customer   Shipment    Vehicle   Warehouse     Driver

      \          |           |         |         /
       \         |           |         |        /
        \--------+-----------+---------+-------/
                           |
                           ▼
                    MySQL Database

                           |
                           ▼
                     Spring AI Layer
                           |
                           ▼
                     Ollama (Qwen)

```

---

# 🌟 Core Capabilities

✔ Enterprise-style REST APIs

✔ AI Integration

✔ Intelligent Warehouse Allocation

✔ Vehicle Assignment

✔ Driver Management

✔ Shipment Tracking

✔ Capacity Monitoring

✔ Dashboard Analytics

✔ Modular Backend

✔ Production-style Architecture

---

# 📌 Current Modules

- ✅ Customer Module
- ✅ Warehouse Module
- ✅ Vehicle Module
- ✅ Driver Module
- ✅ Shipment Module
- ✅ Dashboard Module
- ✅ AI Report Generator

---

# 📈 Future Modules

- Route Optimization
- Live GPS Tracking
- Driver Analytics
- Predictive Maintenance
- Fleet Scheduling
- Kafka Integration
- JWT Authentication
- Redis Cache
- Docker Deployment
- Kubernetes
- CI/CD Pipeline
- Multi-company Support

---

> "Modern Logistics Powered by Artificial Intelligence."
