
// Inbetween.java
import java.util.Scanner;

public class Inbetween
{
    public static void main(String[] args)
    {   
        int userInt1 = 0;
        int userInt2 = 0;
        Scanner keyboard = new Scanner(System.in);

        // Ask user for two integers
        System.out.println("This program prints the integers inbetween two " +
             "specified integers.");
        System.out.println("Please enter the first integer: ");
        userInt1 = keyboard.nextInt();
        System.out.println("Please enter the second integer: ");
        userInt2 = keyboard.nextInt();

        // Be sure program works regardless of which user number is larger.
        if(userInt2 < userInt1)
        {
            int tempInt = userInt1;
            userInt1 = userInt2;
            userInt2 = tempInt;
        }

        // Display error if no intergers between the two user integers
        if(userInt1 == userInt2)
        {
            // Error
            System.out.println("Error: There are no integers between " + userInt1 + " and " + userInt2);
        }
        else
        {
            // Display each integer between the two user provided integers.
            for(int i = userInt1; i < userInt2; ++i)
            {
                System.out.println(" " + i + " ");
            }
        }
    }
}