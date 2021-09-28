package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class KarvonenHeart
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Asks for user input
        System.out.print("What is your age? ");
        double age = input.nextDouble();

        System.out.print("What is your resting heart rate? ");
        double pulse = input.nextDouble();

        // Prints table using function
        printTable(age, pulse);
    }

    static void printTable(double age, double pulse)
    {
        int i, j;
        double targetHeartRate;

        System.out.println("Intesity   | Rate");
        System.out.println("-----------|--------");

        // Prints table and calculates target heart rate for each percentage
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        for (i = 55; i <= 95; i += 5)
        {
            targetHeartRate = (((220 - age) - pulse) * i / 100.0) + pulse;
            System.out.printf("%d%%        | %.0f bpm", i, targetHeartRate);
            System.out.println();
        }
    }
}
