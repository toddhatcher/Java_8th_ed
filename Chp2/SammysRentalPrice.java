// SammysRentalPrice.java
import java.util.Scanner;

public class SammysRentalPrice
{
	public static void main(String[] args)
	{
		int minutesOfRent = 0;
		int hoursOfRent = 0;
		int totalMinutes = 0;
		int totalPrice = 0;
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt user for number of minutes for rental
		System.out.print("Please enter the number of minutes the rental took place: ");
		totalMinutes =  keyboard.nextInt();
		// Compute rental cost as $40 an hour + $1 each minute. 
		hoursOfRent = totalMinutes / 60;
		minutesOfRent = totalMinutes % 60;
		
		totalPrice = hoursOfRent * 40 + minutesOfRent;
	
		// Display Motto
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		// Display hours, minutes
		System.out.println("You rented equipment from Sammy's for " + hoursOfRent + " Hours and " + minutesOfRent + " minutes.");
		// Display total price
		System.out.println("The total price is $" + totalPrice);
	}
}