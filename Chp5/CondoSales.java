// Write an application for the Summerdale Condo Sales office; the program determines
// the price of a condominium. Ask the user to choose 1 for park view, 2 for
// golf course view, or 3 for lake view. The output is the name of the chosen view as
// well as the price of the condo. Park view condos are $150,000, condos with golf
// course views are $170,000, and condos with lake views are $210,000. If the user
// enters an invalid code, set the price to 0. Save the file as CondoSales.java.

// Todd Hatcher
// 6/23/2019

import java.util.Scanner;

public class CondoSales
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userChoice = 0;
        double price = 0.00;

        // Ask user for input:  1, 2, or 3. 
        System.out.println("Please enter a 1 or 2 or 3");
        userChoice = keyboard.nextInt();

        // Make a choice based on the users number
        if(userChoice == 1)
        {
           price = 150000.00;
            System.out.printf("Park View $%.2f%n", price);

        }
        else if(userChoice == 2)
        {
            price = 170000.00;
            System.out.printf("Golf Course View $%.2f%n", price);

        }
        else if(userChoice == 3)
        {
            price = 210000.00;
            System.out.printf("Lake View $%.2f%n", price);
        }
        else
        {
            price = 0.00;
            System.out.println("Please enter either 1 or 2 or 3 for your selection");
        }
    }
}