package com.baljit.examples.classes;

public class Dog {
    String name; // This is an attribute or a field.
    String owner; // This is an attribute or a field.

    public Dog(String name, String owner) { // This is a constructor. It matches the class name.
        this.name = name;
        this.owner = owner;
    }

    public void message() {
        System.out.println(this.name + "'s owner is " + this.owner + ".");
    }

    public static void main(String[] args) {
        var billy = new Dog("Billy", "Tom");
        billy.message();


    }


}






