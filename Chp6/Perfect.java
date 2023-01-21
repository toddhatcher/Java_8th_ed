
// Perfect.java
import java.util.Scanner;

public class Perfect
{
    public static void main(String[] args)
    {
        int sum = 0;
        
        // Test Output
        System.out.println("Perfect.java is running.");

        // Display every perfect number from 1 to 1000.
        for(int i = 1; i < 34000000; ++i)
        {
            // For each number, check for numbers that divide evenly into it. 
            // if i mod x == 0
            //System.out.println(" i is " + i +" ");
            for(int x = 1; x < i; ++x)
            {
                if(i % x == 0)
                {
                    sum = sum + x;
                }
                //System.out.println(" Sum is " + sum + " ");
            }
            if(sum == i)
            {
                // Then i is a perfect number.
                System.out.println("" + i + " is a perfect number.");
            }
            // Reset sum after each number is evaluated.
            sum = 0;
        }
        // A perfect number is one that equals the sum of all the numbers that divide evenly into it.
        System.out.println("Perfect.java is complete.");
    }
}