package com.company.Homework6;

public class ToDoItem {
    private String description;
    private PriorityEnum priority;
    private boolean completed;

    public ToDoItem(String description, PriorityEnum priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
            return String.format("Description: %s, Priority: %s, Completed: %s", this.description, this.priority, this.completed ? "Yes" : "No");
        }
    }