package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class PasswordGenerator
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Asks for user input
        System.out.print("What's the minimum length? ");
        int pwLength = input.nextInt();

        System.out.print("How many special characters? ");
        int specialChar = input.nextInt();

        System.out.print("How many numbers? ");
        int numAmt = input.nextInt();

        String password;

        // Gets password by calling method pwCreation
        password = pwCreation(pwLength, specialChar, numAmt);

        // Output
        System.out.println("Your password is " + password);
    }

    static String pwCreation (int pwLength, int specialChar, int numAmt)
    {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] special = {"!", "$", "#", "%", "&", "*", "-", "@", "+", "=", "?", "<", ">", "~", "/", "_"};
        String[] password = new String[pwLength];
        int i;
        int letterAmt = (pwLength - (specialChar + numAmt));
        int randomNumber;
        int randomIndexToSwap;
        String temp;
        String finalPw = "";

        // Chooses random special characters and inserts into password
        for (i = 0; i < specialChar; i++)
        {
            randomNumber = (int) (Math.random() * 16);
            password [i] = special[randomNumber];
        }

        // Chooses random numbers and inserts into password
        for (i = specialChar; i < specialChar + numAmt; i++)
        {
            randomNumber = (int) (Math.random() * 10);
            password [i] = numbers[randomNumber];
        }

        // Chooses random letters and inserts into password
        for (i = specialChar + numAmt; i < specialChar + numAmt + letterAmt; i++)
        {
            randomNumber = (int) (Math.random() * 26);
            password [i] = letters[randomNumber];
        }

        // Randomizes password
        for (i = 0; i < pwLength; i++) {
            randomIndexToSwap = (int) (Math.random() * pwLength);
            temp = password[randomIndexToSwap];
            password[randomIndexToSwap] = password[i];
            password[i] = temp;
        }

        for (i = 0; i < pwLength; i++)
        {
            finalPw += password[i];
        }

        return finalPw;
    }
}
