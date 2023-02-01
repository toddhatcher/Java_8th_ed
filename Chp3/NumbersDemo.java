//NumbersDemo

public class NumbersDemo
{
	public static void main(String[] args)
	{
		int num1 = 1;
		int num2 = 2;
	
		displayTwiceTheNumber(num1);
		displayTwiceTheNumber(num2);
	
		displayNumberPlusFive(num1);
		displayNumberPlusFive(num2);
	
		displayNumberSquared(num1);
		displayNumberSquared(num2);
	}

	public static void displayTwiceTheNumber(int number)
	{
		System.out.println("Twice of " + number + " is: " + number * 2);
	}

	public static void displayNumberPlusFive(int number)
	{
		System.out.println("The number " + number + " plus 5 is: " + (number + 5));
	}


	public static void displayNumberSquared(int number)
	{
		System.out.println("The number " + number + " squared is: " + number * number);
	}
}

