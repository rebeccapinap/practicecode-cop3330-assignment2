package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class PasswordStrength
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int pwStrength = 0;

        // Asks for user input
        System.out.print("Enter your desired password and I'll tell you if it is strong enough: ");
        String string1 = input.nextLine();

        // Function that checks if password is strong
        pwStrength = passwordValidator(string1);

        // Output
        if (pwStrength == 1)
        {
            System.out.print("The password '" + string1 + "' is a very weak password.");
        }
        else if (pwStrength == 2)
        {
            System.out.print("The password '" + string1 + "' is a weak password.");
        }
        else if (pwStrength == 3)
        {
            System.out.print("The password '" + string1 + "' is a strong password.");
        }
        else if (pwStrength == 4)
        {
            System.out.print("The password '" + string1 + "' is a very strong password.");
        }

    }

    static int passwordValidator (String str1)
    {
        int str1Len = str1.length();
        int i;
        int numLetter = 0;
        int numNumber = 0;
        int numSpecial = 0;

        char[] char1 = str1.toCharArray();

        // Checks if password is weak or very weak
        for ( i = 0; i < str1Len; i++)
        {
            if (Character.isDigit(char1[i]))
                numNumber++;
            if (Character.isLetter(char1[i]))
                numLetter++;
            if (!Character.isDigit(char1[i]) && !Character.isLetter(char1[i]))
                if (!Character.isWhitespace(char1[i]))
                numSpecial++;
        }

        // Checks if password is strong or very strong
        if (str1Len < 8)
        {
            if (numNumber == str1Len)
                return 1;
            if (numLetter == str1Len)
                return 2;
        }

        if (str1Len >= 8)
        {
            if (numNumber >= 1 && numLetter >= 1)
            {
                if (numSpecial >= 1)
                    return 4;

                return 3;
            }
        }
        return 1;
    }
}
