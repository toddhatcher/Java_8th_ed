// 10/20/2019
// TriangleWithLoops.java
// Don't use more than 3 output statements

public class TriangleWithLoops
{
    public static void main(String[] args)
    {   
        // Counter to increase number of T's printed each row.
        int counter = 1;
        
        // For 7 rows
        for(int i = 7; i >= 0; --i)
        {   
            // For each number of rows, print spaces.
            for(int x = i; x > 0; --x)
            {
                System.out.print(" ");
            }
            // For each value of counter, print a T
            for(int y = counter; y > 0; --y)
            {
                System.out.print("T");
            }
            // Increase value of counter by 2 each row, so more T's are added.
            counter += 2;
            // At the end of each row make a blank return to start the next row.
            System.out.println();
        }
    }
}