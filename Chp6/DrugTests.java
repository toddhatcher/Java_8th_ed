
// DrugTests.java
import java.util.Random;

public class DrugTests
{
    public static void main(String[] args)
    {
        final int WEEKS_PER_YEAR = 52;
        final int MAX_EMPLOYEE_NUMBER = 30;

        // Employee numbers 1-30
        int employeeNumber = 0;

        System.out.println("The employee numbers to be tested are: ");

        // For 52 weeks, pick a random employee number.
        for(int i = 0; i < WEEKS_PER_YEAR; ++i)
        {
           // employeeNumber = 1 + (int)(Math.random() * 30);
        
            for(int j = 0; j < 4; ++j)
            {
                employeeNumber = 1 + (int)(Math.random() * 30);
                System.out.print(" " + employeeNumber + " ");
            }
            System.out.println();
        }

        // Display the employee number to be tested.

        // Display 4 employee numbers on a line.

    }
}