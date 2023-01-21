
// RetirementGoal.java
// 10/22/2019

import java.util.Scanner;

public class RetirementGoal
{
    public static void main(String[] args)
    {
        double userYears = 0;
        double userAmount = 0;
        double yearlyTotal = 0;
        Scanner keyboard = new Scanner(System.in);

        // If Zero or negative, prompt user to enter until valid entries are made
        while(userAmount <= 0 || userYears <= 0)
        {
             // Prompt user for number of years until retirement 
            System.out.println("Please enter the number of years until retirement: ");
            userYears = keyboard.nextDouble();

            // Prompt user for amount of money saved annually.
            System.out.println("Please enter the amount of dollars you can save each year. ");
            userAmount = keyboard.nextDouble();
        }

        // Assume no interest is made

        // Display the amount the user will have at retirement.
        for(int i = 1; i <= userYears; ++i)
        {
            yearlyTotal += userAmount;
            System.out.println("For year " + i + " the toal amount you will save is: $" 
                + yearlyTotal);
        }
    }
}