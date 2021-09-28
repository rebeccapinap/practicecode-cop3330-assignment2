package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int anagram = 0;

        // Asks for user input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine().toLowerCase();

        // Function that checks if strings are anagrams
        anagram = isAnagram(string1, string2);

        // Output
        if (anagram == 1)
        {
            System.out.print("\"" + string1 + "\" and \"" + string2 + "\" are anagrams. ");
        }
        else
        {
            System.out.print("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams. ");
        }

    }

    static int isAnagram (String str1, String str2)
    {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int i;

        // Checks if length of two strings is equal
        if (str1Len != str2Len)
            return 0;

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        // Sorts strings to compare and see if anagrams
        Arrays.sort(char1);
        Arrays.sort(char2);

        for (i = 0; i < str1Len; i++)
            if (char1[i] != char2[i])
                return 0;

        return 1;
    }
}
