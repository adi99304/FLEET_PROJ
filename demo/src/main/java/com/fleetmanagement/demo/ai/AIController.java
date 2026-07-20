package com.fleetmanagement.demo.ai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5173/")
public class AIController {
    @Autowired
    private AIService aiser;

    @GetMapping("/ask")
    public String askaic(){
        return aiser.ask();
    }
}
