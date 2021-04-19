package com.company.Homework6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoItems toDoItems = new ToDoItems();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please name your To-Do list: ");
        String toDoListName = scanner.nextLine();
        toDoItems.setTitle(toDoListName);
        while (true) {
            System.out.println("What do you wish to do? ");
            System.out.println("1. Add To-Do Items");
            System.out.println("2. Mark Task as completed");
            System.out.println("3. Display all To-Do Items");
            System.out.println("4. Display uncompleted To-Do Items");
            System.out.println("5. Display completed To-Do Items");
            String todo = scanner.nextLine();
            if (todo.toUpperCase().equals("q")) {
                break;
            }
            switch (todo) {
                case "1":
                    while (true) {
                        System.out.printf("Adding item #%d to list '%s'\n", toDoItems.getSize() + 1, toDoItems.getTitle());
                        System.out.print("Enter Title:");
                        String description = scanner.nextLine();
                        System.out.print("Enter priority: ");
                        PriorityEnum priority = PriorityEnum.valueOf(scanner.nextLine().toUpperCase());
                        ToDoItem item = new ToDoItem(description, priority);
                        item.setDescription(description);
                        item.setPriority(priority);
                        toDoItems.addItem(item);
                        System.out.print("Press enter to continue or 'q' to stop adding items...");
                        String action = scanner.nextLine();
                        if (action.equalsIgnoreCase("q")) {
                            break;
                        }
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.print("Enter To-Do item number: ");
                        int itemNumber = scanner.nextInt();
                        System.out.print("Enter true if task is completed - false if not: ");
                        boolean taskCompleted = scanner.nextBoolean();
                        toDoItems.markCompletion(itemNumber, taskCompleted);
                        scanner.nextLine();
                        System.out.print("Press enter to continue or 'q' to stop marking items...");
                        String action = scanner.nextLine();
                        if (action.equalsIgnoreCase("q")) {
                            break;
                        }
                    }
                case "3":
                    toDoItems.displayItems();
                    break;
                case "4":
                    toDoItems.displayUncompletedItems();
                    break;
                case "5":
                    toDoItems.displayCompletedItems();
                    break;
                default:
                    System.out.println("Try again !!!");
            }
        }
    }
}