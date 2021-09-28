package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

public class MultiplicationTable
{
    public static void main( String[] args )
    {
        int [][] table = new int[12][12];
        int i, j;

        // Calls function to create table
        table = createTable();

        // Output (prints out table)
        for (i = 0; i < 12; i++)
        {
            for (j = 0; j < 12; j++) {
                System.out.printf("%6d", table[i][j]);
            }
            System.out.println();
        }
    }

    static int [][] createTable()
    {
        int [][] table = new int[12][12];
        int i, j;

        // Creates multiplication table
        for (i = 0; i < 12; i++)
            for (j = 0; j < 12; j++)
                table[i][j] = (i + 1) * (j + 1);

        return table;
    }
}
