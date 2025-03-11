package com.test.ai.controller;

import com.test.ai.model.HealthModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    /**
     * Retrieves the current health status of the application.
     *
     * This method handles HTTP GET requests to the "/health" endpoint and returns a HealthModel
     * instance with its status set to "UP".
     *
     * @return a HealthModel instance indicating that the application is up
     */
    @GetMapping("/health")
    public HealthModel getHealth() {
        HealthModel healthModel = new HealthModel();
        healthModel.setStatus("UP");
        return healthModel;
    }
}
