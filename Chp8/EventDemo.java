// Chp8
// 09/21/2022
// TH

/* Goals:	Modify the EventDemo class so that instead of creating three single Event
objects, it uses an array of three Event objects. Get data for each of the objects,
and then display all the details for each object
*/

import java.util.Scanner;

public class EventDemo
{
	public static void main(String[] args)
	{
		final int NUM_EVENTS = 3;	
		// Create array of event objects. 
		Event[] events = new Event[NUM_EVENTS];
		// Get data for each of the objects
		for (int i = 0; i < events.length; i++)
		{
			events[i] = new Event();
			String eventNumber = promptForEventNumber();
			events[i].setEventNumber(eventNumber);
			int eventType = promptForEventType();
			events[i].setEventType(eventType);
			String phoneNumber = promptForPhoneNumber();
			events[i].setContactPhone(phoneNumber);
			int numberOfGuests = promptForGuests();
			events[i].setGuests(numberOfGuests);
		}
		// Display all the data for each of the objects.
		for (int j = 0; j < events.length; j++)
		{
			computePrice(events[j]);
		}
	}
	
	public static int promptForGuests()
	{
		final int MIN_GUESTS = 5;
		final int MAX_GUESTS = 100;
		Scanner keyboard = new Scanner(System.in);
		int desiredGuests, numberOfGuests = 0;

		System.out.println("Please enter the number of guests between 5 and 100: ");
			desiredGuests = keyboard.nextInt();

		while(desiredGuests < MIN_GUESTS || desiredGuests > MAX_GUESTS)
		{
			System.out.println("Invalid number of guests. Please enter the number of guests between 5 and 100: ");
			desiredGuests = keyboard.nextInt();
		}

		// Now that the amount of desired guests falls within Carlys range, assign the value to numberOfGuests.
		numberOfGuests = desiredGuests;

		// Method returns the determined number of guests.
		return numberOfGuests;
	}
	
	public static String promptForEventNumber()
	{
		String eNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the event number: ");
		eNumber = keyboard.nextLine();
		return eNumber;
	}

	public static int promptForEventType() {
		int eType;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 0 for Wedding, 1 for Baptisim, " + 
			"2 for Birthday, 3 for Corporate, or 4 for Other.");
		System.out.println("\nEnter event type: ");
		eType = keyboard.nextInt();
		return eType;
	}

	public static String promptForPhoneNumber()
	{
		String pNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the contact's phone number: ");
		pNumber = keyboard.nextLine();
		return pNumber;
	}
	
	public static void displayMotto()
	{
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");
	}
	
	public static void computePrice(Event e)
	{
		System.out.println("\nThe event number is: " + e.getEventNumber());
		System.out.println("The event type is " + e.getEventType());
		System.out.println("The event type string is " + e.getEventTypeAsString());
		System.out.println("\nThe contacts phone number is: " + e.getContactPhone());
		System.out.println("The number of guests is: " + e.getNumberOfGuests());
		System.out.println("Large event pricing is " + e.isLargeEvent());
		System.out.println("The price per guest is: $" + e.getPricePerGuest());
		System.out.println("The total price for this event is: $" + e.getEventPrice());
		
	}

}