//CarlysEventPriceWithMethods.java

import java.util.Scanner;

public class CarlysEventPriceWithMethods
{
	public static void main(String[] args)
	{
		// Call method prompting for number of guests.
		int numberOfGuests = promptForGuests();
		// Call method that displays company motto.
		displayMotto();
		// Call method that computes price. Return total.
		computePrice(numberOfGuests);
	}
	
	public static int promptForGuests()
	{
		int numberOfGuests;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number of guests: ");
		numberOfGuests = keyboard.nextInt();
		return numberOfGuests;
	}
	
	public static void displayMotto()
	{
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");
	}
	
	public static void computePrice(int g)
	{
		int totalPrice = g * 35;
		System.out.println("The price for this event is: $" + totalPrice);
		if (g > 50)
		{
			System.out.println("This is a large event. ");
		}
	}
}