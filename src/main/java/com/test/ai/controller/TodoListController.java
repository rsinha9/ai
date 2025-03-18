package com.test.ai.controller;

import com.test.ai.model.TodoListModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    @GetMapping("/todo-list")
    public List<TodoListModel> getTodoLists() {
        return new ArrayList<>();
    }
}
