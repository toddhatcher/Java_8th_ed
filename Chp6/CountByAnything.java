
import java.util.Scanner;

public class CountByAnything
{
    public static void main(String[] args)
    {
        int userValue = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an integer number to count by: ");
        userValue = keyboard.nextInt();

        // Count by any value to 300
        for(int x = userValue; x <= 300; x += userValue)
        {
            System.out.print(" " + x + " ");
            if(x % 20 == 0)
            {
                System.out.println("");
            }
        }
    }
}