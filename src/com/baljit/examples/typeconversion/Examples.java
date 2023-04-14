package com.baljit.examples.typeconversion;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Examples {


    public void someNotes() {
        greetUser("Baljit", "Padda");
        greetUser("Tom", "Beadman");
        bakeCake("Cherry");
    }

    public static void greetUser(String firstName, String secondName) {
        System.out.println("Hello " + firstName + " " + secondName);
    }

    public static void bakeCake(String typeOfCake) {
        System.out.println("Here is your " + typeOfCake + " cake!");
    }

    public void arrays() {

        byte age = 30;

        Date now = new Date();
        now.getTime();
        System.out.println(now);

        String message = "Hi People.";
        System.out.println(message.length());
        System.out.println(message.startsWith("F"));


        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;

        System.out.println(Arrays.toString(numbers));

        int[] digits = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(digits));
    }


    public void typeConversion() {
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

        boolean z = false;
        String message1 = Boolean.toString(z) + " answer";
        System.out.println(message1);

        //Formatting numbers using the NumberFormat class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(14000000);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.5);
        System.out.println(result2);
    }

    public void multiDimensionalArray() {
        int[][] randomNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Arrays.deepToString(randomNumbers));
    }
}
