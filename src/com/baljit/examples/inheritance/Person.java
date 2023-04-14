package com.baljit.examples.inheritance;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

     public void nameAndAgeMessage() {
         System.out.println("Hi " + this.name + " you are " + this.age);
     }
}
