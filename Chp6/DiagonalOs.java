
// DiagonalOs.java

public class DiagonalOs
{
    public static void main(String[] args)
    {
        // Create pattern of Os
        // Loop 1 - 10, each time printing an O but increasing the indent spacing by 1.
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("O");
            // Add an extra space before the O each round.
            for(int x = 1; x <= i; ++x)
            {
                System.out.print(" ");
            }
        }
    }
}