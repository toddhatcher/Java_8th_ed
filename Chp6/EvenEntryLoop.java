
// EvenEntryLoop.java
import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;

       boolean keepGoing = true;
       while(keepGoing)
       {
           // Ask user to enter an even number or 999 to stop.
            System.out.println("Please enter an even numer or 999 to stop.");
            userInput = keyboard.nextInt();

            if(userInput == 999)
            {
                // Exit
                keepGoing = false;
            }
            else if(userInput % 2 != 0)
            {
                // Odd
                // If odd number, display error
                System.out.println("Error: You entered an odd number. Try again.");
                // Then ask for another input.
                keepGoing = true;
            }
            else
            {
                // Even
                // If even number, display "Good job!"
                System.out.println("You entered an even number. Good job!");
                // Then ask for another input.
                keepGoing = true;
            }
       } 
    }
}