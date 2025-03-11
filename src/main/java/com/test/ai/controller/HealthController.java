package com.test.ai.controller;

import com.test.ai.model.HealthModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public HealthModel getHealth() {
        HealthModel healthModel = new HealthModel();
        healthModel.setStatus("UP");
        return healthModel;
    }
}
