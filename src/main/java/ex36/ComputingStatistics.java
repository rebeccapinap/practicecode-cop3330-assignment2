package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int keepGoing = 0;
        int digitLoop = 1;
        String addNum;
        double average, std;
        int max, min;
        int numInt;
        int numInList = 0;

        List<Integer> numList = new ArrayList<Integer>();

        while (keepGoing == 0)
        {
            // Exits unless changed by user input "done" or invalid input
            keepGoing = 1;

            System.out.print("Enter a number: ");
            addNum = input.nextLine();

            if (addNum.equals("done"))
                break;

            // checks if input is valid
            digitLoop = isDigit(addNum);


            if (digitLoop == 0)
            {
                System.out.print("Sorry. That's not a valid input.\n");
                keepGoing = 0;
            }

            // If input is valid adds number inputted to the list
            if (digitLoop == 1)
            {
                numInt = Integer.parseInt(addNum);
                numList.add(numInt);
                numInList++;
                keepGoing = 0;
            }
        }

        System.out.print("Numbers: ");

        for(Integer val : numList)
            System.out.print(val + ", ");

        System.out.println();

        // Calculates each by accessing method for each
        average = average(numInList, numList);
        max = max(numInList, numList);
        min = min(numInList, numList);
        std = std(numInList, numList);

        // Output
        System.out.printf( "The average is %.1f\n" +
                "The minimum is %d\n" +
                "The maximum is %d\n" +
                "The standard deviation is %.2f", average, min, max, std);
    }

    static int isDigit (String str1)
    {
        int str1Len = str1.length();
        int i;

        if (str1Len == 0)
            return 0;

        // Checks if each character put in is a digit
        char[] char1 = str1.toCharArray();

        for (i = 0; i < str1Len; i++)
            if (!Character.isDigit(char1[i]))
                return 0;

        return 1;
    }

    static double average (int numInList, List<Integer> numList)
    {
        double average;
        int i;
        int sum = 0;

        // Calculates average
        for (i = 0; i < numInList; i++)
        {
            sum += numList.get(i);
        }

        average = (double)(sum / numInList);

        return average;
    }

    static int max (int numInList, List<Integer> numList)
    {
        int max = numList.get(0);
        int i;

        // Checks for max
        for (i = 1; i < numInList; i++)
            if (numList.get(i) > max)
                max = numList.get(i);

        return max;
    }

    static int min (int numInList, List<Integer> numList)
    {
        int min = numList.get(0);
        int i;

        // Checks for min
        for (i = 1; i < numInList; i++)
            if (numList.get(i) < min)
                min = numList.get(i);

        return min;
    }

    static double std (int numInList, List<Integer> numList)
    {
        double std;
        double average;
        double sumNumerator = 0;
        int i;

        // Calculates standard deviation by calling function for average (mean) and continuing further calculations
        average = average(numInList, numList);

        for (i = 0; i < numInList; i++)
        {
            sumNumerator += Math.pow((numList.get(i) - average), 2);
        }

        std = Math.sqrt(sumNumerator / (numInList));

        return std;
    }

}
