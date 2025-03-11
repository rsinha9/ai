package com.test.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    @GetMapping("/todos")
    public List<?> getTodos() {
        return new ArrayList<>();
    }
}
