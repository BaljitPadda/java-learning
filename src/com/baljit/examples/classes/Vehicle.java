package com.baljit.examples.classes;

/**
 * Testing constructor overloading
 */
public class Vehicle {

    public Vehicle() {
        this(120);
    }

    public Vehicle(double maxSpeed) {
        this(10, maxSpeed);
    }

    /**
     * @see
     * @param currentSpeed
     * @param maxSpeed
     */
    public Vehicle(double currentSpeed, double maxSpeed) {
        System.out.println("Travelling " + currentSpeed + " of maximum " + maxSpeed);
    }

    public static void main(String[] args) {


        boolean found = true;

    }

}
