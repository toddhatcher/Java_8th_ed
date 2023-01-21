
// Factorials.java

public class Factorials
{
    public static void main (String[] args)
    {
        long factorial = 1;
        
        // Display the factorial for every integer value from 1-10.

        for(int x = 1; x <= 10; ++x)
        {
            System.out.print("Factorials of " + x + " are: ");
            for(int y = x; y >= 1; --y)
            {
                factorial *= y;
                System.out.print(y + " * ");
            }
            System.out.println(" equals " + factorial);
            // Reset factorial to 1 before each new set of factorials is calculated.
            // Otherwise the factorial number keeps increasing.
            factorial = 1;
        }
    }
}
