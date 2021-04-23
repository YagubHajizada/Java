package com.company.Homework6;

import java.util.Scanner;

    public class Main {

        static void printDescription() {
            System.out.println("1. Add To - Do items");
            System.out.println("2. Mark task as completed");
            System.out.println("3. Display all To - Do items");
            System.out.println("4. Display uncompleted items");
            System.out.println("5. Display completed items");
            System.out.println("6. Remove item by index");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please name your To - Do list:");
            String title = sc.nextLine();
            ToDoItems itemList = new ToDoItems(title);
            int itemIndex = 1;
            while (true) {
                System.out.println("What do you wish to do?");
                printDescription();
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("q")) {
                    break;
                }
                if (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > 6) {
                    do {
                        System.out.println("Enter correct menu index:");
                        choice = sc.next();
                    } while (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > 6);
                }
                switch (choice) {
                    case "1":
                        while (true) {
                            System.out.println("Adding item #" + itemIndex + " to list: " + title);
                            System.out.print("Enter description: ");
                            String description = sc.next().concat(sc.nextLine());
                            System.out.print("Enter priority(HIGH/MEDIUM/LOW): ");
                            Priority priority = Priority.valueOf(sc.next().toUpperCase());
                            ToDoItem item = new ToDoItem(description, priority);
                            itemList.addItem(item);
                            System.out.println("Press anything to continue or 'q' to stop.");
                            sc.nextLine();
                            if (sc.nextLine().equalsIgnoreCase("q")) {
                                break;
                            }
                            itemIndex++;
                        }
                        itemIndex++;
                        break;
                    case "2":
                        do {
                            System.out.print("Enter To-Do item index:");
                            int indexToComplete = sc.nextInt();
                            if (indexToComplete <= 0 || indexToComplete >= itemList.toDoItemsSize() + 1) {
                                do {
                                    System.out.println("Enter correct index:");
                                    indexToComplete = sc.nextInt();
                                } while (indexToComplete <= 0 || indexToComplete >= itemList.toDoItemsSize() + 1);
                            }
                            itemList.markCompletion(indexToComplete, true);
                            System.out.println("Press anything to continue or 'q' to stop.");
                            sc.nextLine();
                        } while (!sc.nextLine().equalsIgnoreCase("q"));
                        break;
                    case "3":
                        itemList.displayItems();
                        break;
                    case "4":
                        itemList.displayUncompletedItems();
                        break;
                    case "5":
                        itemList.displayCompletedItems();
                        break;
                    case "6":
                        do {
                            System.out.print("Enter item index to remove:");
                            int remove = sc.nextInt();
                            if (remove <= 0 || remove >= itemList.toDoItemsSize() + 1) {
                                do {
                                    System.out.println("Enter correct To - Do item index: ");
                                    remove = sc.nextInt();
                                } while (remove <= 0 || remove >= itemList.toDoItemsSize() + 1);
                            }
                            itemList.removeItem(remove);
                            itemIndex--;
                            System.out.println("Press anything to continue or 'q' to stop.");
                            sc.nextLine();
                        } while (!sc.nextLine().equalsIgnoreCase("q"));
                        break;
                }
            }
            sc.close();
        }
    }