package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class PayOffCredit
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double months;

        // Asks for user input
        System.out.print("What is your balance? ");
        double balance = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = input.nextDouble() / 100.0;

        System.out.print("What is the monthly payment you can make? ");
        double monthlyPay = input.nextDouble();

        // Calculates months by accessing a method in class PaymentCalculator
        months = Math.ceil(PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, monthlyPay));

        // Output
        System.out.printf("It will take you %.0f months to pay off this card.", months);
    }
}

class PaymentCalculator
{
    static public double calculateMonthsUntilPaidOff (double balance, double APR, double monthlyPay)
    {
        double i = APR / 365.0;

        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        // Calculates months
        double months = - (1/30.0) * Math.log(1 + balance / monthlyPay * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i);

        return months;
    }
}