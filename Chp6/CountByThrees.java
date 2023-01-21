
public class CountByThrees
{
    public static void main(String[] args)
    {
        // Count by 3 from 3 to 300
        for(int x = 3; x <= 300; x += 3)
        {
            System.out.print(" " + x + " ");
            if(x % 10 == 0)
            {
                System.out.println("");
            }
        }
    }
}