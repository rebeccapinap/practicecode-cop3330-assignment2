package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.*;

public class EmployeeList
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int employeeIndex;

        System.out.print("There are 5 employees:\n" +
                "John Smith\n" +
                "Jackie Jackson\n" +
                "Chris Jones\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin\n\n");

        // Sets up initial list
        List<String> employeeList = new ArrayList<String>();

        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        // Asks for user input
        System.out.print("Enter an employee name to remove: ");
        String remove = input.nextLine();

        System.out.println();

        // Gets index that should be deleted from method employeeTraverse
        employeeIndex = employeeTraverse(remove, employeeList);

        employeeList.remove(employeeIndex);

        // Output
        System.out.print("There are 4 employees: \n");

        for(String val : employeeList)
            System.out.print(val + "\n");
    }

    static int employeeTraverse(String remove, List<String> employeeList)
    {
        int employeeIndex = -1;

        // Sees where employee name is and saves index
        if (employeeList.contains(remove))
            employeeIndex = employeeList.indexOf(remove);

        return employeeIndex;
    }
}
