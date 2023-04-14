package com.baljit.examples.scope;

public class ScopeTester {

    int number = 20;
    public void test() {
        int number = 10;
        doubleTheNumber(number);

        System.out.println(this.number);
        System.out.println(number);
    }

    void doubleTheNumber(int number) {
        this.number = number * 2;
    }


}
