// Write an application that asks a user to enter three integers. Display them in
// ascending and descending order. Save the file as AscendingAndDescending.java.

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

        // Sort the three integers into ascending order
        if(userInt1 > userInt2 && userInt1 > userInt3)
            {
              System.out.println("userInt1 is greater than userInt2 and UserInt3");  
              pos1 = userInt1; // 1 v 2 & 3
            }
        else if(userInt1 > userInt2)
            {
                System.out.println("userInt1 is greater than userInt2 but not greater than userInt3");
                pos1 = userInt3;
                pos2 = userInt1; // 1 V 2
                pos3 = userInt2;
            }
        else if(userInt1 > userInt3)
            {
                System.out.println("userInt1 is greater than userInt3 but not greater than userInt2");
                pos1 = userInt2; // 1 V 3
                pos2 = userInt1; 
                pos3 = userInt3;
            }
        else if(userInt2 > userInt3)
            {
                System.out.println("userInt2 is greater than userInt3 and UserInt1");
                pos1 = userInt2; // 2 V 3
                pos2 = userInt3;
                pos3 = userInt1; // We already know userInt1 isn't greater than either userInt2 or userInt3 from prior checks
            }
        else 
            {
                System.out.println("userInt3 is greater than userInt2 and UserInt1");
                pos1 = userInt3; // 3 V 2
                pos2 = userInt2;
                pos3 = userInt1; // We already know userInt1 isn't greater than either userInt2 or userInt3 from prior checks
            }

        // Display the integers with lowest value first and highest value last
        System.out.println("The numbers in ascending order are: " + pos3 + " " + pos2 + " " + pos1);

         // Display the integers with the highest value first and the lowest value last
        System.out.println("The numbers in descending order are: " + pos1 + " " + pos2 + " " + pos3);



    }
} 