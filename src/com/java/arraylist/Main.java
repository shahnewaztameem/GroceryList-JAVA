package com.java.arraylist;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice from the menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    System.out.println("Bye Bye!!");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to grocery list.");
        System.out.println("\t 3 - To modify an item to grocery list.");
        System.out.println("\t 4 - To remove an item to grocery list.");
        System.out.println("\t 5 - To search for an item to grocery list.");
        System.out.println("\t 6 - To quit the application.");
    }

    // add item to grocery list
    public static void addItem() {
        System.out.print("Please enter the name of grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // modify grocery list
    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String itemNumber = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    // remove from grocery list
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNumber = scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    // search from grocery list
    public static void searchItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }
    }
}
