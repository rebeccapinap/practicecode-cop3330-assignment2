package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class FilteringValues
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int[] evenNum;

        // Asks for user input
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numList = input.nextLine();

        // Gets string calculated in method filterEvenNumbers
        evenNum = filterEvenNumbers(numList);

        // Output
        System.out.print("The even numbers are ");

        for (int num: evenNum)
            if (num != -1)
                System.out.print(num + " ");

        System.out.print(".");
    }

    public static int[] filterEvenNumbers(String numList)
    {
        int i, j;
        String evenNum = "";
        // Takes out spaces
        String[] filterStr = numList.split(" ");
        int strLen = filterStr.length;

        int num;
        int[] array = new int[strLen];
        int[] evenArray = new int[array.length];

        // Initializes array
        for (i = 0; i < evenArray.length; i++)
        {
            evenArray[i] = -1;
        }

        // Changes values from string to integer array
        for (i = 0; i < array.length; i++)
        {
            num = Integer.parseInt(filterStr[i]);
            array[i] = num;
        }

        i = 0;

        // Only puts even number in new array
        for (j = 0; j < strLen; j++)
        {
            if (array[j] % 2 == 0)
            {
                evenArray[i] = array[j];
                i++;
            }
        }

        return evenArray;
    }
}
