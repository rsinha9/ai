package com.test.ai.controller;

import com.test.ai.model.TodoItemModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    @GetMapping("/api/v1/todos")
    public List<TodoItemModel> getTodos() {
        return new ArrayList<>();
    }
}
