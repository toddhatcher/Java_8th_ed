// Write a program for Horizon Phones, a provider of cellular phone service. Prompt a
// user for maximum monthly values for talk minutes used, text messages sent, and
// gigabytes of data used, and then recommend the best plan for the customer’s needs. A
// customer who needs fewer than 500 minutes of talk and no text or data should accept
// // Plan A at $49 per month. A customer who needs fewer than 500 minutes of talk
// and any text messages should accept Plan B at $55 per month. A customer who needs
// 500 or more minutes of talk and no data should accept either Plan C for up to 100
// text messages at $61 per month or Plan D for 100 text messages or more at $70 per
// month. A customer who needs any data should accept Plan E for up to 2 gigabytes at
// $79 or Plan F for 2 gigabytes or more at $87. Save the file as CellPhoneService.java.

// Todd Hatcher
// 6/23/2019

import java.util.Scanner;

 public class CellPhoneService
 {
    public final static double PLAN_A_COST = 49.00;
    public final static double PLAN_B_COST = 55.00;
    public final static double PLAN_C_COST = 61.00;
    public final static double PLAN_D_COST = 70.00;
    public final static double PLAN_E_COST = 79.00;
    public final static double PLAN_F_COST = 87.00;


    public static void main(String[] args)
     {
        int userMonthlyMinutes = 0;
        int userMonthlyTextsSent = 0;
        double userMonthlyDataGB = 0.00;
        Scanner keyboard = new Scanner(System.in);

        // Welcome
        System.out.println("Welcome to Horizon Cellular Phone Service.");

        // Prompt user for maximum monthly talk minutes used
        System.out.println("Please enter the number of minutes of talking phone service that you use or need each month: ");
        userMonthlyMinutes = keyboard.nextInt();

        // Prompt user for number of messages sent
        System.out.println("Please enter the number of text messages that you will use or need each month: ");
        userMonthlyTextsSent = keyboard.nextInt();

        // Prompt user for gigabytes of data used
        System.out.println("Please enter the amount of cellular data that you use or need each month.");
        System.out.println("Enter the amount in gigabytes: ");
        userMonthlyDataGB = keyboard.nextDouble();

        // Recommend the best plan for the customers needs.
            // Plan A = 49.00 mo/ = Less than 500 talk minutes, 0 text, 0 data.
            // Plan B = 55.00 mo/ = Less than 500 talk minutes, unlimited text, 0 data.
            // Plan C = 61.00 mo/ = More than 500 talk minutes,  100 text, 0 data,
            // Plan D = 70.00 mo/ = More than 500 talk minutes, ulimited text, 0 data.
            // Plan E = 79.00 mo/ = 2gb data
            // Plan F = 87.00 mo/ = unlimited data
        if(userMonthlyMinutes < 500 && userMonthlyTextsSent == 0 && userMonthlyDataGB == 0.00)
        {
            // Plan A will work for this customer.
            System.out.println("Less than 500 monthly talk minutes. No text. No data.");
            System.out.println("Plan A will work for this customer.");
        }
        else if(userMonthlyMinutes < 500 && userMonthlyTextsSent > 0 && userMonthlyDataGB == 0.00)
        {
            // Plan B will work for this customer.
            System.out.println("Less than 500 monthly talk minutes. Unlimited text. No data.");
            System.out.println("Plan B will work for this customer.");
        }
        else if(userMonthlyMinutes >= 500 && userMonthlyTextsSent <= 100 && userMonthlyDataGB == 0.00)
        {
            // Plan C will work for this customer.
            System.out.println("Unlimited monthly talk minutes. 100 texts per month. No data.");
            System.out.println("Plan C will work for this customer.");
        }
        else if(userMonthlyMinutes >= 500 && userMonthlyTextsSent > 100 && userMonthlyDataGB == 0.00)
        {
            // Plan D will work for this customer.
            System.out.println("Unlimited monthly talk minutes. Unlimited texts. No data.");
            System.out.println("Plan D will work for this customer.");
        }
        else if(userMonthlyMinutes > 0 && userMonthlyTextsSent > 0 && userMonthlyDataGB <= 2.00)
        {
            // Plan E will work for this customer.
            System.out.println("Unlimited monthly talk minutes. Unlimited texts. 2.0gb or less of monthly data.");
            System.out.println("Plan E will work for this customer.");
        }
        else if(userMonthlyMinutes > 0 && userMonthlyTextsSent > 0 && userMonthlyDataGB > 2.00)
        {
            // Plan F will work for this customer
            System.out.println("Unlimited monthly talk minutes. Unlimited texts. Unlimited data.");
            System.out.println("Plan F will work for this customer.");
        }
        else
        {
            // No plans work?
            System.out.println("No plans worked for the given input. Try again.");
        }
     }
 }
