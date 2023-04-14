package com.baljit.examples.toybox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyBox toybox = new ToyBox();
        System.out.println(toybox.contents);


        System.out.println("____________________________");


        ToyBox toybox2 = new ToyBox("chicken strips");


        "monkey".toLowerCase();

        System.out.println(toybox2.contents);

        Integer x = 5;
        Integer y = x;
         x = 2;
        System.out.println(y);

        int result = "Baljit".compareTo("Bobby");
        System.out.println(result);



        int[] numbers = {1, 2, 1, 3, 4, 2};
        int i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i++]);
            if(numbers[i] == 2)
                continue;

        }

        Scanner in = new Scanner(System.in);
        int j,k;
        j=in.nextInt();
        k=in.nextInt();

        while(j < k) {
            System.out.print(++j + " ");
        }





    }
}
