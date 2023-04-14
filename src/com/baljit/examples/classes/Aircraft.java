package com.baljit.examples.classes;

public class Aircraft {
    String type = "";
    String modelNumber = "";

        public Aircraft(String type, String modelNumber) {
            this.type = type;
            this.modelNumber = modelNumber;
        }

        public void message() {
            System.out.println("This aircraft is a: " + type + " , modelNumber is: " + modelNumber + " .");


    }

}
