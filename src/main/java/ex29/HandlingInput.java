package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class HandlingInput
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String returnRate = "";
        int shouldLoop = 1;
        int digitLoop;
        double yearsAmt;

        while (shouldLoop == 1)
        {
            System.out.print("What is the rate of return? ");
            returnRate = input.nextLine();

            // Exits loop if not changed by inputting invalid inputs
            shouldLoop = 0;

            if (returnRate.equals("0"))
            {
                System.out.print("Sorry. That's not a valid input.\n");
                shouldLoop = 1;
            }

            // Flag that checks if input is valid (is a number)
            digitLoop = isDigit(returnRate);

            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input.\n");
                shouldLoop = 1;
            }
        }

        int returnRateInt = Integer.parseInt(returnRate);

        // Calculates years it takes to double initial investment
        // years = 72 / r
        yearsAmt = Math.ceil(72.0 / returnRateInt);

        // Output
        System.out.printf("It will take %.0f years to double your initial investment.", yearsAmt);
    }

    static int isDigit (String str1)
    {
        int str1Len = str1.length();
        int i;

        if (str1Len == 0)
            return 0;

        char[] char1 = str1.toCharArray();

        // Checks if each character put in is a digit
        for (i = 0; i < str1Len; i++)
            if (!Character.isDigit(char1[i]))
                return 0;

        return 1;
    }
}
