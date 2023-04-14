package com.baljit.examples.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static double remainingBalance(int principal, int numberOfPayments, int numberOfPaymentsAlreadyMade, float monthlyInterestRate) {
        double remainingBalanceStep1 = Math.pow((1 + monthlyInterestRate), numberOfPayments);
        double remainingBalanceStep2 = Math.pow((1 + monthlyInterestRate), numberOfPaymentsAlreadyMade);
        double remainingBalance = principal * (remainingBalanceStep1 - remainingBalanceStep2) / (remainingBalanceStep1 - 1);
        return remainingBalance;
    }

    public static void main(String[] args) {

        System.out.println("Principal: ");

        Scanner user_input = new Scanner(System.in);

        int principal = Integer.parseInt(user_input.next());

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String msg = "You want to borrow " + currency.format(principal);
        System.out.println(msg);


        System.out.println("Annual interest rate: ");

        Scanner user_input2 = new Scanner(System.in);

        float annualInterestRate = Float.parseFloat(user_input2.next().trim());
        float monthlyInterestRate = (annualInterestRate/100)/12;
        System.out.println("(Monthly interest rate is therefore " + monthlyInterestRate + ")");


        System.out.println("Period (years): ");

        Scanner user_input3 = new Scanner(System.in);

        int years = Integer.parseInt(user_input3.next());
        int numberOfPayments = years * 12;

        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Total number of payments to make = " + numberOfPayments);


        double firstStep = Math.pow( ( 1 + monthlyInterestRate), (numberOfPayments) );
        double secondStep = firstStep - 1;

        double mortgageRepayments = (principal * ((monthlyInterestRate * firstStep)/secondStep));

        System.out.println("Monthly repayments: £ " + Math.round(mortgageRepayments));

        String finalMessage = currency.format(mortgageRepayments);
        System.out.println("If you borrow " + principal + ", your monthly repayments will be " + finalMessage + " per month for " + years + " years.");

        System.out.println("Payment Schedule");
        System.out.println("________________");

        double totalRepaymentsWithInterest = mortgageRepayments * numberOfPayments;

        System.out.println("The sum of your total repayments including interest is: " + currency.format(totalRepaymentsWithInterest));

        /*double remainingBalanceStep1 = Math.pow((1 + monthlyInterestRate), numberOfPayments);
        double remainingBalanceStep2 = Math.pow((1 + monthlyInterestRate), numberOfPayments--);
        double remainingBalance = principal * (remainingBalanceStep1 - remainingBalanceStep2) / (remainingBalanceStep1 - 1); */

        for (double i = totalRepaymentsWithInterest; i > 0; i = i - mortgageRepayments) {
            System.out.println(currency.format(i));

        }

        for (int i = 1; i <= numberOfPayments; i++) {
            System.out.println(remainingBalance(principal, numberOfPayments, i, monthlyInterestRate));
        }
    }


    private void ternaryOperatorExample(){
        System.out.println("What is your salary? ");

        Scanner userInput4 = new Scanner(System.in);

        int income = Integer.parseInt(userInput4.next());
        String classTravel = income > 100_000 ? "First" : "Economy";
        System.out.println("You belong in " + classTravel);
    }

}
