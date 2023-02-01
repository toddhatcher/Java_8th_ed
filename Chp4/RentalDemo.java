// SammysRentalPrice.java
import java.util.Scanner;

public class RentalDemo
{
	public static void main(String[] args)
	{
		/* Chp3
		// Declare rental object.
		Rental firstRental = new Rental();
		// Call method that prompts user for rental time in minutes and returns value.
		int rentalMinutes = rentalTime();
		// Call method that prompts user for a contract number.
		String contractNumber = contractNumber();
		// Set object fields with the provided user input.
		firstRental.setHoursAndMinutes(rentalMinutes);
		firstRental.setContractNumber(contractNumber);
		// Call method that displays motto
		SammysRentalPriceWithMethods.displayMotto();
		// Send rental object to method that displays hours/minutes/price.
		computeAndDisplay(firstRental);
		*/
		
		// Invoke 1st object to show default values.
		Rental firstRental = new Rental();
		// Aks for user input values.
		int rentalMinutes = rentalTime();
		String contractNumber = contractNumber();
		// Invoke 2nd object with user values.
		Rental secondRental = new Rental(contractNumber, rentalMinutes);
		// Display both objects values.
		computeAndDisplay(firstRental);
		computeAndDisplay(secondRental);
	}
	
	public static int rentalTime()
	{
		Scanner keyboard = new Scanner(System.in);
		int rentalMinutes = 0; 
		
		System.out.println("Please enter the rental time in minutes: ");
		rentalMinutes = keyboard.nextInt();
		return rentalMinutes;
	}
	
	public static String contractNumber()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the contract number: ");
		String contractNum = keyboard.nextLine();
		return contractNum;
	}
	
	public static void displayMotto()
	{
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun. S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	
	public static void computeAndDisplay(Rental r)
	{
		System.out.println("The contract number is: " + r.getContractNumber());
		System.out.println("The rental time was for " + r.getHoursOfRent() + " hours and " + r.getMinutesOverHour() + " minutes.");
		System.out.println("The hourly rate is: $" + r.HOURLY_RATE + " for a total rental price of $" + r.getPriceOfRental());
	}
}