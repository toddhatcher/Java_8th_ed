// Write an application that asks a user to enter three integers. Display them in
// ascending and descending order. Save the file as AscendingAndDescending.java.

// Todd Hatcher
// 6/23/2019

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userInt1 = 0;
        int userInt2 = 0;
        int userInt3 = 0;
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        // Ask the user to enter three integers
        System.out.println("Please enter the first of three integers: ");
        userInt1 = keyboard.nextInt();
        System.out.println("Very Good, now please enter the second of three integers: ");
        userInt2 = keyboard.nextInt();
        System.out.println("Ok, just one more now. Please enter the third and final integer: ");
        userInt3 = keyboard.nextInt();

        // Sort the three integers by greatest to smallest.

        // Check if userInt1 is greatest then check 2nd greatest.
        if(userInt1 > userInt2 && userInt1 > userInt3)
            {
                pos1 = userInt1; // userInt1 is greatest so set to position 1.
                if(userInt2 > userInt3)
                {
                    // userInt2 was found to be larger than userInt3 so userInt2 is 2nd greatest.
                    pos2 = userInt2;
                    // therefore userInt3 goes into last position.
                    pos3 = userInt3;
                }
                else
                    // userInt2 was found to be smaller than userInt3 so userInt3 is 2nd greatest.
                    pos2 = userInt3;
                    // therefore userInt2 goes into last position.
                    pos3 = userInt2;
            }
            // Check if userInt2 is greatest then check 2nd greatest.
        else if(userInt2 > userInt1 && userInt2 > userInt3)
            {
                pos1 = userInt2; // userInt2 is greatest so set to position 1.
                if(userInt1 > userInt3)
                {
                    pos2 = userInt1;
                    pos3 = userInt3;
                } 
                else
                {
                    pos2 = userInt3;
                    pos3 = userInt1;
                }
            }
            // Check if userInt3 is greatest then check 2nd greatest.
        else if(userInt3 > userInt1 && userInt3 > userInt2)
            {
                pos1 = userInt3; // userInt3 is greatest so set to position 1.
                if(userInt1 > userInt2)
                {
                    pos2 = userInt1;
                    pos3 = userInt2;
                }
                else
                {
                    pos2 = userInt2;
                    pos3 = userInt1;
                }
            }
            // Check if all three numbers are the same. 
        else if(userInt1 == userInt2 && userInt1 == userInt3)
        {
            System.out.println("All three numbers are the same.");
            pos1 = userInt1;
            pos2 = userInt2;
            pos3 = userInt3;
        }
            // If the decision tree had made it this far then we know that
            // Two of the numbers are the same, but greater than one of the other numbers. 
            // Otherwise one of the tests for greatest value above would have triggered and we wouldn't be here.
        else if(userInt1 == userInt2)
        {
            
            pos1 = userInt1;
            pos2 = userInt2;
            pos3 = userInt3; 
        } 
        else if(userInt1 == userInt3)
        {
            pos1 = userInt1;
            pos2 = userInt3;
            pos3 = userInt2;
        }
        // userInt2 has to be equal to userInt3 at this point
        // since both are greater than userInt1, the answers are obvious
        else 
        {
            pos1 = userInt2;
            pos2 = userInt3;
            pos3 = userInt1;
        }
        
        // Display the integers with lowest value first and highest value last
        System.out.println("The numbers in ascending order are: " + pos3 + " " + pos2 + " " + pos1);

         // Display the integers with the highest value first and the lowest value last
        System.out.println("The numbers in descending order are: " + pos1 + " " + pos2 + " " + pos3);



    }
}