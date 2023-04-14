package com.baljit.examples.classes;

public class Item {
    public static int instanceCount;

    public Item() {
        ++instanceCount;
    }

    public void fetchItem() {
        throwItem();
        throw new RuntimeException();
    }

    public void throwItem() {
        System.out.println("throwing");

    }
}
