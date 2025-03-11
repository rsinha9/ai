package com.test.ai.controller;

import com.test.ai.model.HealthModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/v1/health")
    public ResponseEntity<HealthModel> getHealth() {
        HealthModel health = new HealthModel();
        health.setStatus("UP");
        return new ResponseEntity<>(health, HttpStatus.OK);
    }
}
