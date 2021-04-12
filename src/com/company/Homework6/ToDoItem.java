package com.company.Homework6;

public class ToDoItem {
    private int id;
    private String description;
    private PriorityEnum priority;
    private boolean completed;

    public ToDoItem(int id, String description, PriorityEnum priority, boolean completed) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public PriorityEnum getPriority() {
        return this.priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public void markCompletion(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public String toString() {
        return String.format("Description: %s, Priority: %s, Completed: %s",
                this.description, this.priority, this.completed);
    }
}