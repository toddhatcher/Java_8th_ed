//Carlys EventPrice

import java.util.Scanner;

public class CarlysEventPrice
{
	public static void main(String[] args)
	{
		
		int guests;
		final double PRICE_PER_GUEST = 35.00;
		double totalPrice;
		Scanner keyboard = new Scanner(System.in);
	
		// prompt user for number of guests
		System.out.print("Enter the number of guests: ");
		guests = keyboard.nextInt();
		// Compute total price as guests * $35
		totalPrice = guests * PRICE_PER_GUEST;
	
		// Display motto
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");

		// Display number of guests
		System.out.println("The total number of guests is: " + guests);
		// Display price per guest.
		System.out.println("The price for each guest is: $" + PRICE_PER_GUEST);
		// Dsiplay total price.
		System.out.println("The total cost for " + guests + " guests comes to: $" + totalPrice);
	
		// Display a message if more than 50 peeople.
		if (guests > 50)
		{
			System.out.println("This is a large group.");
		}
		else
		{
			System.out.println("This is not a large group.");
		}
	}
}