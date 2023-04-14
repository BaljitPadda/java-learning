package com.baljit.examples.classes;

public class Main {

    public static void main(String[] args) {
        var dogObject1 = new Dog("Billy", "Heston School");
        dogObject1.message();

        var aircraft1 = new Aircraft("Fighter Pilot", "4567");
        aircraft1.message();

        var myCar = new Vehicle(100);


        Item item = new Item();
        System.out.println(Item.instanceCount);
        item.fetchItem();
    }
}
