// Write an application that prompts a user for a month, day, and year. Display a
// message that specifies whether the entered date is (1) not this year, (2) in an earlier
// month this year, (3) in a later month this year, or (4) this month. Save the file as
// PastPresentFuture.java

import java.util.Scanner;
import java.time.*;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userMonth = 0;
        int userDay = 0;
        int userYear = 0;
        int todaysDateMonth = 0;
        int todaysDateDay = 0;
        int todaysDateYear = 0;


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

        // Extract the month, day, and year from todaysDate.
        todaysDateMonth = todaysDate.getMonthValue();
        todaysDateDay = todaysDate.getDayOfMonth();
        todaysDateYear = todaysDate.getYear();

        // Display a message depending on if date isn't this year.
        if(userDate.getYear() != todaysDate.getYear())
        {
            System.out.println("The users year is not the same as this current year.");
        }
        // Display a message depending on if the date is in an earlier month this year.
        else if(userMonth < todaysDateMonth)
        {
            System.out.println("The users month was earlier this year.");
        }
        // Display a message depending on if the date is in a later month this year.
        else if(userMonth > todaysDateMonth)
        {
            System.out.println("The users month is later this year.");
        }
        // Display a message depending on if the date is in this current month.
        else if(userDate.getMonthValue() == todaysDate.getMonthValue())
        {
            System.out.println("Ther users month is the same as this month.");
        }
        
    }
}