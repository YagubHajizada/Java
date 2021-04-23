package com.company.Homework6;

public class ToDoItem {
    private String description;
    private Priority priority;
    private boolean completed;


    public ToDoItem(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Priority getPriority() {
        return this.priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public void markCompletion(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    @Override
    public String toString() {
        return String.format("Description: %s, Priority: %s,",
                this.description, this.priority);
    }
}