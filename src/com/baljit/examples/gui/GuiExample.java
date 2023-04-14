package com.baljit.examples.gui;

import javax.swing.*;

public class GuiExample {

    public static void main(String[] args) {
    //Building a GUI. Dialogue/pop-up boxes.

        String first_number = JOptionPane.showInputDialog("Type first number: ");
        int number1 = Integer.parseInt(first_number);

        String second_number = JOptionPane.showInputDialog("Type second number: ");
        int number2 = Integer.parseInt(second_number);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum of these numbers is " + sum, "Answer", JOptionPane.PLAIN_MESSAGE);
    }
}
