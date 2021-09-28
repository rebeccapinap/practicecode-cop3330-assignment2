package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickWinner
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int keepGoing = 0;
        String addName;
        String winnerName;
        int nameAmt = 0;

        List<String> nameList = new ArrayList<String>();

        // Asks for user input until user does not input anything
        while (keepGoing == 0)
        {
            keepGoing = 1;

            System.out.print("Enter a name: ");
            addName = input.nextLine();

            if (!addName.equals(""))
            {
                nameList.add(addName);
                nameAmt++;
                keepGoing = 0;
            }
        }

        // Gets name from method winner
        winnerName = winner(nameAmt, nameList);

        // Output
        System.out.println("The winner is... " + winnerName + ".");
    }

    static String winner(int nameAmt, List<String> nameList)
    {
         String winnerName;
         int randomNumber = ((int) (Math.random() * nameAmt));

         // Calculates random name to be winner and returns it
         winnerName = nameList.get(randomNumber);

         return winnerName;
    }
}
