package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.Scanner;

public class ValidatingInput
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Asks for user input
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        String ZIP = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        // Output by accessing method validateInput
        System.out.print(validateInput(firstName, lastName, ZIP, employeeID));
    }

    static String validateInput (String firstName, String lastName, String ZIP, String employeeID)
    {
        int validFirstName, validLastName, validZIP, validEmployeeID;
        StringBuilder output = new StringBuilder();

        // Calls functions to check if each input is valid
        validFirstName = validateName(firstName);
        validLastName = validateName(lastName);
        validZIP = validateZIP(ZIP);
        validEmployeeID = validateEmployeeID(employeeID);

        // Output
        // If 1 or 2 there is an error, if 0 there are no errors
        if (validFirstName == 1)
        {
            output.append("The first name must be at least 2 characters long.\n");
            output.append("The first name must be filled in.\n");
        }

        if (validFirstName == 2)
            output.append("The first name must be at least 2 characters long.\n");

        if (validLastName == 1)
        {
            output.append("The last name must be at least 2 characters long.\n");
            output.append("The last name must be filled in.\n");
        }

        if (validLastName == 2)
            output.append("The last name must be at least 2 characters long.\n");

        if (validEmployeeID == 1)
            output.append("The employee ID must be in the format of AA-1234.\n");

        if (validZIP == 1)
            output.append("The zipcode must be a 5 digit number.\n");

        if (validFirstName == 0 && validLastName == 0 && validZIP == 0 && validEmployeeID == 0)
            output.append("There were no errors found.\n");

        return output.toString();
    }

    static int validateName (String name)
    {
        int nameLen = name.length();

        if (nameLen == 0)
            return 1;

        if (nameLen <= 1)
            return 2;

        return 0;
    }

    static int validateZIP (String ZIP)
    {
        int ZIPLen = ZIP.length();
        int i;
        int numDigit = 0;

        if (ZIPLen != 5)
            return 1;

        char[] char1 = ZIP.toCharArray();

        for (i = 0; i < ZIPLen; i++)
        {
            if (Character.isDigit(char1[i]))
                numDigit++;
        }

        if (numDigit != 5)
            return 1;

        return 0;
    }

    static int validateEmployeeID (String employeeID)
    {
        int employeeLen = employeeID.length();
        int i;
        int numCorrect = 0;

        if (employeeLen != 7)
            return 1;

        char[] char1 = employeeID.toCharArray();

        if (Character.isLetter(char1[0]))
            numCorrect++;

        if (Character.isLetter(char1[1]))
            numCorrect++;

        if (char1[2] == '-')
            numCorrect++;

        for (i = 3; i <= 6; i++)
        {
            if (Character.isDigit(char1[i]))
                numCorrect++;
        }

        if (numCorrect == 7)
            return 0;

        return 1;
    }
}
