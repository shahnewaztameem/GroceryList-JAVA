package com.java.arraylist;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //add item
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // print all the items from grocerylist
    public void printGroceryList() {
        if(groceryList.size()  <= 0) {
            System.out.println("You have no items in your grocecy list");
        } else {
            for(int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >=0 ) {
            modifyGroceryItem(position, newItem);
        }
    }

    // modify grocery item
    private void modifyGroceryItem(int index, String item) {
        groceryList.set(index, item);
        System.out.println("Grocery item " + (index+1) + " has been updated");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >=0 ) {
            removeGroceryItem(position);
        }
    }

    // remove grocery item
    private void removeGroceryItem(int index) {
        groceryList.remove(index);
    }

    // find item
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
