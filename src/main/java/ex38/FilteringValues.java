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
        String evenNum;

        // Asks for user input
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String numList = input.nextLine();

        // Gets string calculated in method filterEvenNumbers
        evenNum = filterEvenNumbers(numList);

        // Output
        System.out.println("The even numbers are " + evenNum);
    }

    public static String filterEvenNumbers(String numList)
    {
        int i;
        String evenNum = "";
        // Takes out spaces
        String[] filterStr = numList.split(" ");
        int strLen = filterStr.length();

        for (i = 0; i < strLen; i++)
        {
            evenNum += filterStr[i];
        }

        return evenNum;
    }
}
