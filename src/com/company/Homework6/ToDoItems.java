package com.company.Homework6;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {

    private String title;
    private List<ToDoItem> toDoItems = new ArrayList<>();


    public ToDoItems(String title) {
        this.title = title;
    }

    public void addItem(ToDoItem item) {
        this.toDoItems.add(item);
    }

    public void displayItems() {
        for (ToDoItem item : toDoItems) {
            System.out.print(item + " Completed: No\n");
        }
    }

    public void displayCompletedItems() {
        for (ToDoItem item : toDoItems) {
            if (item.getCompleted()) {
                System.out.print(item + "Completed: Yes\n");
            }
        }
    }

    public void displayUncompletedItems() {
        for (ToDoItem item : toDoItems) {
            if (!item.getCompleted()) {
                System.out.print(item + "Completed: No\n");
            }
        }
    }

    public void markCompletion(int number, boolean isCompleted) {
        this.toDoItems.get(number - 1).markCompletion(isCompleted);
    }

    public void removeItem(int remove) {
        toDoItems.remove(remove - 1);
    }

    public int toDoItemsSize() {
        return toDoItems.size();
    }
}
