// Iterate through a string

public class MyString
{
    public static void main(String[] args)
    {
        String myString1 = "My First String";

        for (int i = 0; i < myString1.length(); i++)
        {
            System.out.println(myString1.substring(i, i + 1));
        }
    }
}
