// SammysRentalPrice.java
import java.util.Scanner;

public class SammysRentalPriceWithMethods
{
	public static void main(String[] args)
	{
		// Call method that prompts user for rental time in minutes and returns value.
		int rentalMinutes = rentalTime();
		// Call method that displays motto
		displayMotto();
		// Send number of minutes to method that computes hours/minutes/price.
		computeAndDisplay(rentalMinutes);
	}
	
	public static int rentalTime()
	{
		Scanner keyboard = new Scanner(System.in);
		int rentalMinutes = 0; 
		
		System.out.println("Please enter the rental time in minutes: ");
		rentalMinutes = keyboard.nextInt();
		return rentalMinutes;
	}
	
	public static void displayMotto()
	{
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	
	public static void computeAndDisplay(int minutes)
	{
		// compute hours, minutes, total price
		int hoursOfRent = minutes / 60;
		int minutesOfRent = minutes % 60;
		int totalPrice = hoursOfRent * 40 + minutesOfRent;
		
		// display hours, minutes, total price
		System.out.println("The total retal time was " + hoursOfRent + " hours and " + minutesOfRent + " minutes.");
		System.out.println("The total price for the rental is: $" + totalPrice);
	}
}