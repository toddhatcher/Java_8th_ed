
// RetirementGoal2.java
// 10/29/2019

import java.util.Scanner;

public class RetirementGoal2
{
    public static void main(String[] args)
    {
        double userYears = 0;
        double userAmount = 0;
        double yearlyBase = 0;
        double yearlyTotal = 0;
        double annualInterest = 0;
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
        
        // Set the first yearly base with the user enterered amount
        yearlyBase = userAmount;

        // Assume 4% annual interest
        // Display the amount the user will have at retirement.
        for(int i = 1; i <= userYears; ++i)
        {
            // Calc annual interest
            annualInterest = yearlyBase * .04;

            if(i ==1)
            {
                // If year 1, don't add userAmount again to the calculation.
                yearlyTotal = yearlyBase + annualInterest;
            }
            else
            {
                // Calc yearly total. Base + interest + users amount for each new year.
                yearlyTotal = yearlyBase + annualInterest + userAmount;
            }
            
            System.out.println("At the end of year " + i 
                + " the annual interest is: $" + annualInterest 
                + " and the toal amount you will save is: $" + yearlyTotal);

            // Set the yearlyBase for next year, to this years total. 
            yearlyBase = yearlyTotal;
        }
    }
}