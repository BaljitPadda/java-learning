package com.baljit.examples.toybox;

public class ToyBox  {

    String contents;

    public ToyBox() {
        this("barbie, kens");


        System.out.println("in no argument constructor");
    }

    public ToyBox(String x) {
        System.out.println("provided string");
        this.contents = x;
    }


}
