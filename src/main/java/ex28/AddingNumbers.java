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
        Scanner input = new Scanner(System.in);
        int i;
        int num = 0;
        int[] array = new int[5];

        for (i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            array[i] = num;
        }

        // Calculates sum by accessing function
        int sum = sumCalc(array);

        // Output
        System.out.printf("The total is %d.", sum);
    }

    static int sumCalc (int[] array)
    {
        int sum= 0;
        int i;
        int arrayLen = array.length;

        // Adds 5 numbers
        for (i = 0; i < arrayLen; i++)
        {
            sum += array[i];
        }

        return sum;
    }
}
