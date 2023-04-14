package com.baljit.examples.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        //Fizz Buzz Game

        System.out.print("Type a number: ");

        Scanner user_input = new Scanner(System.in);
        int number = Integer.parseInt(user_input.next());

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else System.out.println("Your number is not divisible by 5 or by 3.");


        for (byte i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }
}
