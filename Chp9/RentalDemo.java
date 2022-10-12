// SammysRentalPrice.java
// Chp8

import java.util.Scanner;

public class RentalDemo
{
	public static void main(String[] args)
	{
        // Chp 8
		// Make array of 3 rental objects.
		final int NUM_RENTALS = 3;
		Rental[] rentals = new Rental[NUM_RENTALS];

		// Get data for each of the rental objects
		for (int i = 0; i < 3; i++) {
			rentals[i] = new Rental();
			String rentalConNum = contractNumber();
			rentals[i].setContractNumber(rentalConNum);
			int rentalEquipType = rentalType();
			System.out.println("\nrentalEquipType pre set is: " + rentalEquipType);
			rentals[i].setEquipmentType(rentalEquipType);
			String rentalPhoneNum = contactPhoneNumber();
			rentals[i].setContactPhoneNumber(rentalPhoneNum);
			int rentalMinutes = rentalTime();
			rentals[i].setHoursAndMinutes(rentalMinutes);
		}

		// Display details for each of the rental objects
		for (int j = 0; j < rentals.length; j++) {
			computeAndDisplay(rentals[j]);
		}
	}
	
	// Continuously prompt for a rental time between 60 and 7200 minutes.
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
		String inputContractNumber = keyboard.nextLine();
		return inputContractNumber;
	}

	public static int rentalType() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 0 for Jet Ski, 1 for Pontoon Boat, " + 
			"2 for Rowboat, 3 for Canoe, 4 for Kayak, 5 for Beach Chair, 6 for Umbrella, and 7 for Other");
		System.out.println("Please enter the rental type: ");
		int inputRentalType = keyboard.nextInt();
		return inputRentalType;
	}

	public static String contactPhoneNumber() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the renters phone number:");
		String contactPhoneNumber = keyboard.nextLine();
		return contactPhoneNumber;
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
		System.out.println("\nThe rental type is: " + r.getEquipmentType() + 
			" for " + r.getEquipmentTypeAsString());
		System.out.println("\nThe renters phone number is:" + r.getContactPhoneNumber());
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