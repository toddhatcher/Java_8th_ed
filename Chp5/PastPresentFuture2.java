// Write an application that prompts a user for a month, day, and year. Display a
// message that specifies whether the entered date is (1) not this year, (2) in an earlier
// month this year, (3) in a later month this year, or (4) this month. Save the file as
// PastPresentFuture.java

// b. Use the Web to learn how to use the LocalDate Boolean methods isBefore(),
// isAfter(), and equals(). Use your knowledge to write a program that prompts a
// user for a month, day, and year, and then displays a message specifying whether
// the entered day is in the past, the current date, or in the future. Save the file as
// PastPresentFuture2.java.

// Todd Hatcher
// 7/1/2019

import java.util.Scanner;
import java.time.*;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userMonth = 0;
        int userDay = 0;
        int userYear = 0;

        // Ask user for a month, day, and year.
        System.out.println("Please enter a month.");
        userMonth = keyboard.nextInt();
        System.out.println("Please enter a day.");
        userDay = keyboard.nextInt();
        System.out.println("Please enter a year");
        userYear = keyboard.nextInt();

        // Create date object using user input.
        LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);

        // Create a second date object of today, for comparing the userDate object against.
        LocalDate todaysDate = LocalDate.now();

        // Check if date is before todays date.
        if (userDate.isBefore(todaysDate))
        {
            System.out.println("The date you entered is in the past.");
        }
        // Check if date is after todays date.
        else if(userDate.isAfter(todaysDate))
        {
            System.out.println("The date you entered is in the future.");
        }
        // Check if date is equal to todays date.
        else if(userDate.equals(todaysDate))
        {
            System.out.println("The date you entered is todays date.");
        }
        else
        {
            System.out.println("error");
        }
    }
}