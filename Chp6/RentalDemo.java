// SammysRentalPrice.java
// Chp6

import java.util.Scanner;

public class RentalDemo
{
	public static void main(String[] args)
	{
        // Chp5 Start
        // Ask for user first rental input values.  
		int rentalMinutes = rentalTime();
        String contractNumber = contractNumber();
        
		    // Invoke 1st object with user provided values
		    Rental firstRental = new Rental(contractNumber, rentalMinutes);
		
		// Ask user for 2nd rental input values
		rentalMinutes = rentalTime();
        contractNumber = contractNumber();
        
		    // Invoke 2nd object with user values.
		    Rental secondRental = new Rental(contractNumber, rentalMinutes);
		
		// Ask user for 3rd rental input values
		rentalMinutes = rentalTime();
        contractNumber = contractNumber();
        
		    // Invoke 3rd object with user values.
		    Rental thirdRental = new Rental(contractNumber, rentalMinutes);
		
		// Display both objects values.
		computeAndDisplay(firstRental);
		computeAndDisplay(secondRental);
		computeAndDisplay(thirdRental);

		// For one rental, create a loop that displays 
		// "Coupon good for 10 percent off next rental" for each guest.
		for(int i = thirdRental.getHoursOfRent(); i > 0; i--)
		{
			System.out.println("Coupon good for 10 percent off next rental");
		}

		// Which rental is longer
		whichRentalIsLonger(firstRental, secondRental);
		whichRentalIsLonger(firstRental, thirdRental);
		whichRentalIsLonger(secondRental, thirdRental);

	}
	
	// Continouously prompt for a rental time between 60 and 7200 minutes.
	public static int rentalTime()
	{
		final int MIN_TIME = 60;
		final int MAX_TIME = 7200;
		Scanner keyboard = new Scanner(System.in);
		int rentalMinutes, desiredRentalMinutes = 0; 
		
		System.out.println("Please enter the rental time in minutes: ");
		desiredRentalMinutes = keyboard.nextInt();

		while(desiredRentalMinutes < MIN_TIME || desiredRentalMinutes > MAX_TIME)
		{
			System.out.println("Invalid time requsted. Please enter a value between 60 and 7200 minutes.");
			desiredRentalMinutes = keyboard.nextInt();
		}

		// Now that desiredRentalMinutes falls within the acceptable time range, confirm as actual rental minutes.
		rentalMinutes = desiredRentalMinutes;

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
		System.out.println("\nThe contract number is: " + r.getContractNumber());
		System.out.println("The rental time was for " + r.getHoursOfRent() + " hours and " + 
			r.getMinutesOverHour() + " minutes.");
		System.out.println("The hourly rate is: $" + Rental.HOURLY_RATE + 
			" for a total rental price of $" + r.getPriceOfRental());
	}

	// Method that accepts two rental objects and returns the one with
	// the longer rental time. If same time, return first rental.
	public static Rental whichRentalIsLonger(Rental r1, Rental r2)
	{
		if(r1.getTotalMinutes() > r2.getTotalMinutes())
		{
			// Rental 1's total minutes of rental was longer than Rental 2's
			System.out.println("\n\nThe first rentals contract number is: " + r1.getContractNumber());
			System.out.println("The first rentals total rental time is: " + r1.getTotalMinutes() + 
				" minutes.");
			System.out.println("The second rentals contract number is: " + r2.getContractNumber());
			System.out.println("The second rentals total rental time is: " + r2.getTotalMinutes());
			System.out.println("\nThe rental with the longest rental time is contract number: " + 
				r1.getContractNumber());
			return r1;
		}
		else if(r1.getTotalMinutes() < r2.getTotalMinutes())
		{
			// Rental 2's total minutes of rental was longer than Rental 1's
			System.out.println("\n\nThe first rentals contract number is: " + r1.getContractNumber());
			System.out.println("The first rentals total rental time is: " + r1.getTotalMinutes() + 
				" minutes.");
			System.out.println("The second rentals contract number is: " + r2.getContractNumber());
			System.out.println("The second rentals total rental time is: " + r2.getTotalMinutes());
			System.out.println("\nThe rental with the longest rental time is contract number: " + 
				r2.getContractNumber());
			return r2;
		}
		else if(r1.getTotalMinutes() == r2.getTotalMinutes())
		{
			// Rental 1's total minutes is equal to rental 2's
			System.out.println("\n\nThe first rentals contract number is: " + r1.getContractNumber());
			System.out.println("The first rentals total rental time is: " + r1.getTotalMinutes() + 
				" minutes.");
			System.out.println("The second rentals contract number is: " + r2.getContractNumber());
			System.out.println("The second rentals total rental time is: " + r2.getTotalMinutes());
			System.out.println("\nThe rental with the longest rental time is contract number: " + 
				r1.getContractNumber());
			return r1;
		}
		else
		{
			// Error - return rental 2 when in error.
			System.out.println("Error in evaluating the longer of the two rentals.");
			return r2;
		}
	}
}