package com.test.ai.controller;

import com.test.ai.model.TodoItemModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    /**
     * Handles HTTP GET requests to the "/todos" endpoint.
     *
     * <p>This method returns an empty list, serving as a placeholder for future implementations that may provide actual todo items.</p>
     *
     * @return an empty list of todos
     */
    @GetMapping("/todos")
    public List<TodoItemModel> getTodos() {
        return new ArrayList<>();
    }
}
