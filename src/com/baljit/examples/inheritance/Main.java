package com.baljit.examples.inheritance;

public class Main {

    public static void main(String[] args) {

        var person1 = new Person("Baljit", 29);
        person1.nameAndAgeMessage();

        var person2 = new Person("Tom", 33);
        person2.nameAndAgeMessage();

        var employee1 = new Employee("Baljit", 29, "12345", 3);
        employee1.employeeDetails();


    }
}
