package com.baljit.examples.arraylist;

import java.util.*;

public class Test {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
