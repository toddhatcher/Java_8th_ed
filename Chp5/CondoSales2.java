// Write an application for the Summerdale Condo Sales office; the program determines
// the price of a condominium. Ask the user to choose 1 for park view, 2 for
// golf course view, or 3 for lake view. The output is the name of the chosen view as
// well as the price of the condo. Park view condos are $150,000, condos with golf
// course views are $170,000, and condos with lake views are $210,000. If the user
// enters an invalid code, set the price to 0. Save the file as CondoSales.java.

// Add a prompt to the CondoSales application to ask the user to specify a (1) garage
// or a (2) parking space, but only if the view selection is valid. Add $5,000 to the
// price of any condo with a garage. If the parking value is invalid, display an
// appropriate message and assume that the price is for a condo with no garage.
// Save the file as CondoSales2.java.

// Todd Hatcher
// 6/23/2019

import java.util.Scanner;

public class CondoSales2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userChoice = 0;
        int garageChoice = 0;
        double price = 0.00;

        // Ask user for input:  1, 2, or 3. 
        System.out.println("Welcome to the Summerdale Condo Sales program.");
        System.out.println("Please enter 1 to select the Park view Condo.");
        System.out.println("Please enter 2 to select the Golf Course view Condo.");
        System.out.println("Please enter 3 to select the Lake view Condo.");
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

        if(price != 0.00)
        {
            System.out.println("Would you like a one or two space garage along with your condo? ");
            System.out.println("Pleae enter 0 or 1 or 2");
            garageChoice = keyboard.nextInt();
            if(garageChoice == 1 || garageChoice == 2)
            {
                 price = price + 5000.00;
                 System.out.printf("The price of your new condo and a garage is $%.2f%n", price );
            }
            else
                System.out.printf("You didn't select a garage so the total is still $%.2f%n", price);
        }
    }
}