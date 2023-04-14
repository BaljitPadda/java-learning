package com.baljit.examples.gui;
import javax.swing.JOptionPane;

/**
 * Testing GUI
 */
public class ShoppingList { // This is my ShoppingList Class.
    String name; // This is a field or an attribute.
    String typeOfList; // This is a field or an attribute.
    String list; // This is a field or an attribute.

    public ShoppingList(String name, String typeOfList) { // This is my ShoppingList constructor.
        this.name = name;
        this.typeOfList = typeOfList;
        this.list = "";
    }

    public void getListItems() { // This is a method in my ShoppingList class.
        System.out.println(name + "'s " + typeOfList + " list");
        String listItems = JOptionPane.showInputDialog("Write an item to add to your list ");
        if (listItems.isBlank()) {
            JOptionPane.showMessageDialog(null,"Please type something.");
        }
        this.list += listItems;

        String addMore = JOptionPane.showInputDialog("Add item? Yes or No?");
        while (addMore.toLowerCase().matches("yes")) {
            String moreListItems = JOptionPane.showInputDialog("Add another item.");
            this.list += ", " + moreListItems;
            System.out.println(this.list);
            addMore = JOptionPane.showInputDialog("Do you want to add another item?");
                if (addMore.toLowerCase().matches("no")) {
                    this.list += "." ;
                    JOptionPane.showMessageDialog(null, "Okay. Here is your list: " + this.list, name + "'s " + typeOfList + " List", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
        }

    }



    public void message() {
            System.out.print(name + " 's List:" + list);
        }


}
