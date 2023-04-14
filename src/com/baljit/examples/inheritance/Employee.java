package com.baljit.examples.inheritance;

public class Employee extends Person {
    private String employeeID;
    private int band;

    public Employee(String name, int age, String employeeID, int band) {
        super(name, age);
        this.employeeID = employeeID;
        this.band = band;
    }

    public void employeeDetails() {
        System.out.println(this.employeeID + this.band);
    }

}
