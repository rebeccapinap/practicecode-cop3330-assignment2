package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Libraries
import java.util.*;
import java.util.TreeMap;

public class SortingRecord
{
    public static void main( String[] args )
    {
        String [] lastName = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String lastAndFirst = "";
        Map<String, employee> employees = new HashMap<>();

        // Creates list of maps
        employees.put(lastName[0], new employee("John", lastName[0], "Manager", "2016-12-31"));
        employees.put(lastName[1], new employee("Tou", lastName[1], "Software Engineer", "2016-10-05"));
        employees.put(lastName[2], new employee("Michaela", lastName[2], "District Manager", "2015-12-19"));
        employees.put(lastName[3], new employee("Jake", lastName[3], "Programmer", ""));
        employees.put(lastName[4], new employee("Jacquelyn", lastName[4], "DBA", ""));
        employees.put(lastName[5], new employee("Sally", lastName[5], "Web Developer", "2015-12-18"));

        // Creates tree map to sort
        Map<String, employee> employeesSorted = new TreeMap<>(employees);

        // Output
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for (Map.Entry<String, employee> entry : employeesSorted.entrySet()) {
            lastAndFirst = entry.getValue().getFirstName() + " " + entry.getKey();
            System.out.printf("%-20s| %-18s| %-20s\n", lastAndFirst, entry.getValue().getPosition(), entry.getValue().getSeparationDate());
        }
    }
}

class employee
{
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public employee()
    {
        this.firstName = "";
        this.lastName = "";
        this.position = "";
        this.separationDate = "";
    }

    public employee(String firstName, String lastName, String position, String separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getPosition()
    {
        return position;
    }

    public String getSeparationDate()
    {
        return separationDate;
    }
}
