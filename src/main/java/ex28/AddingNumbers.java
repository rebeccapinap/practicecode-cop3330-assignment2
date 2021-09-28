package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class AddingNumbers
{
    public static void main( String[] args )
    {
        // Calculates sum by accessing function
        int sum = sumCalc();

        // Output
        System.out.printf("The total is %d.", sum);
    }

    static int sumCalc ()
    {
        Scanner input = new Scanner(System.in);
        int i;
        int num = 0;
        int sum= 0;

        // Adds 5 numbers with user input
        for (i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            sum += num;
        }

        return sum;
    }
}
