package com.company.Homework6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoItems toDoItems = new ToDoItems();
        List<ToDoItem> todoList = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream("ToDoItems");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            todoList = (ArrayList)objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (Exception ex) {

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please name your To-Do list: ");
        String toDoListName = scanner.nextLine();
        System.out.println("What do you wish to do? ");
        System.out.println("1. Add To-Do Items");
        System.out.println("2. Mark Task as completed");
        System.out.println("3. Display all To-Do Items");
        System.out.println("4. Display uncompleted To-Do Items");
        System.out.println("5. Display completed To-Do Items");
        int todo = scanner.nextInt();
        switch (todo) {
            case 1:
                int id = 1;
                if (todoList.size() > 0) {
                    id = todoList.get(todoList.size() - 1).getId() + 1;
                }
                while (true) {
                    System.out.println("Adding item #" + id + " to list 'Mans daramo lietu saraksts'");
                    System.out.print("Enter Title:");
                    String title = scanner.next();
                    System.out.print("Enter priority: ");
                    PriorityEnum priority = PriorityEnum.valueOf(scanner.next());
                    id++;

                    System.out.print("Press anything to continue or q to stop adding items...");
                    String action = scanner.next();
                    if (action.equalsIgnoreCase("q")) {
                        break;
                    }
                }
            case 2:
                System.out.println("Enter To-Do item number: ");
                int itemNumber = scanner.nextInt();
                System.out.println("Enter true if task is completed - false if not: ");
                boolean taskCompleted = scanner.nextBoolean();
                toDoItems.markCompletion(itemNumber, taskCompleted);
                break;
            case 3:
               break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}