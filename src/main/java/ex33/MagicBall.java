package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class MagicBall
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Asks for user input
        System.out.print("What's your question?\n> ");
        String question = input.nextLine();

        System.out.println();

        // Prints string returned from method randomResponse
        System.out.print(randomResponse());
    }

    static String randomResponse()
    {
        String[] response = {"Yes.", "No.", "Maybe.", "Ask again later."};

        int randomNumber = ((int) (Math.random() * 4));

        // Returns random string
        return response[randomNumber];
    }
}
