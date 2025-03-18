package com.test.ai.model;

import java.util.List;

public class TodoListModel {
    private long id;
    private String name;
    private List<TodoItemModel> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoItemModel> getItems() {
        return items;
    }

    public void setItems(List<TodoItemModel> items) {
        this.items = items;
    }
}
