package com.java.arraylist;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //add item
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // print all the items from grocerylist
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocecy list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // modify grocery item
    public void modifyGroceryItem(int index, String item) {
        groceryList.set(index, item);
        System.out.println("Grocery item " + (index+1) + " has been updated");
    }

    // remove grocery item
    public void removeGroceryItem(int index) {
        String item = groceryList.get(index);
        groceryList.remove(item);
    }

    // find item
    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
