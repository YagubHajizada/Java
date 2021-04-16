package com.company.Homework6;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {
    private String title;
    private List<ToDoItem> toDoItems = new ArrayList<>();

    public int getSize() {
        return this.toDoItems.size();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public ToDoItems() {
    }

    public ToDoItems(String title, List<ToDoItem> toDoItems) {
        this.title = title;
        this.toDoItems = toDoItems;
    }

    public void addItem(ToDoItem item) {
        toDoItems.add(item);
    }

    public void displayItems() {
        for (ToDoItem item : toDoItems) {
            System.out.println(item.toString());
        }
    }

    public void displayCompletedItems() {
        for (ToDoItem item : toDoItems) {
            if (item.isCompleted()) {
                System.out.println(item.toString());
            }
        }

    }

    public void displayUncompletedItems() {
        for (ToDoItem item : toDoItems) {
            if (!item.isCompleted()) {
                System.out.println(item);
            }
        }

    }

    public void markCompletion(int toDoItemNum,boolean bool) {
        this.toDoItems.get(toDoItemNum-1).markCompletion(bool);
    }
}