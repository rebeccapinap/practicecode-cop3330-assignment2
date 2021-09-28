package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class GuessNumber
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int keepGoing = 0;
        int digitLoop;
        String difficulty;
        String playAgain;

        System.out.println("Let's play Guess the Number!");

        while (keepGoing == 0)
        {
            // Asks for user input
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty = input.nextLine();

            // Exits loop if not changed by inputting invalid inputs or request to keep playing
            keepGoing = 1;

            // Checks if input is valid
            digitLoop = isDigit(difficulty);

            // Output
            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input.\n");
                keepGoing = 0;
            }

            if (digitLoop == 1)
            {
                // Directs to methods for different difficulties
                if (difficulty.equals("1"))
                    difficulty1();
                if (difficulty.equals("2"))
                    difficulty2();
                if (difficulty.equals("3"))
                    difficulty3();

                System.out.print("Do you wish to play again (Y/N)? ");
                playAgain = input.nextLine().toLowerCase();

                if (playAgain.equals("y"))
                    keepGoing = 0;
            }
        }


    }

    static void difficulty1()
    {
        Scanner input = new Scanner(System.in);
        String guess;
        int numGuesses = 0;
        double randomNumber;
        int randomNumberInt;
        int guessInt;
        int flag = 0;
        int digitLoop;

        System.out.print("I have my number. What's your guess? ");
        randomNumber = (1 + (Math.random() * 10));
        randomNumberInt = (int) randomNumber;

        while (flag == 0)
        {
            flag = 1;
            guess = input.nextLine();
            numGuesses++;

            // Checks if input is valid
            digitLoop = isDigit(guess);

            // Output
            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input. Guess again: ");
                flag = 0;
            }

            if (digitLoop == 1)
            {
                guessInt = Integer.parseInt(guess);

                if (guessInt > randomNumberInt) {
                    System.out.print("Too high. Guess again: ");
                    flag = 0;
                }

                if (guessInt < randomNumberInt) {
                    System.out.print("Too low. Guess again: ");
                    flag = 0;
                }
            }
        }

        System.out.printf("You got it in %d guesses! \n", numGuesses);
    }

    static void difficulty2()
    {
        Scanner input = new Scanner(System.in);
        String guess;
        int numGuesses = 0;
        double randomNumber;
        int randomNumberInt;
        int guessInt;
        int flag = 0;
        int digitLoop;

        System.out.print("I have my number. What's your guess? ");
        randomNumber = (1 + (Math.random() * 100));
        randomNumberInt = (int) randomNumber;

        while (flag == 0)
        {
            flag = 1;
            guess = input.nextLine();
            numGuesses++;

            // Checks if input is valid
            digitLoop = isDigit(guess);

            // Output
            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input. Guess again: ");
                flag = 0;
            }

            if (digitLoop == 1)
            {
                guessInt = Integer.parseInt(guess);

                if (guessInt > randomNumberInt) {
                    System.out.print("Too high. Guess again: ");
                    flag = 0;
                }

                if (guessInt < randomNumberInt) {
                    System.out.print("Too low. Guess again: ");
                    flag = 0;
                }
            }
        }

        System.out.printf("You got it in %d guesses! \n", numGuesses);
    }

    static void difficulty3()
    {
        Scanner input = new Scanner(System.in);
        String guess;
        int numGuesses = 0;
        double randomNumber;
        int randomNumberInt;
        int guessInt;
        int flag = 0;
        int digitLoop;

        System.out.print("I have my number. What's your guess? ");
        randomNumber = (1 + (Math.random() * 1000));
        randomNumberInt = (int) randomNumber;

        while (flag == 0)
        {
            flag = 1;
            guess = input.nextLine();
            numGuesses++;

            // Checks if input is valid
            digitLoop = isDigit(guess);

            // Output
            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input. Guess again: ");
                flag = 0;
            }

            if (digitLoop == 1)
            {
                guessInt = Integer.parseInt(guess);

                if (guessInt > randomNumberInt) {
                    System.out.print("Too high. Guess again: ");
                    flag = 0;
                }

                if (guessInt < randomNumberInt) {
                    System.out.print("Too low. Guess again: ");
                    flag = 0;
                }
            }
        }

        System.out.printf("You got it in %d guesses! \n", numGuesses);
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
