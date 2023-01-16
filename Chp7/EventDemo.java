// Chp7
// 10/04/2020
// TH

/* Goals:	
*/

import java.util.Scanner;

public class EventDemo
{
	public static void main(String[] args)
	{

		// Loop prompt for number of guests. Between 5-100
		
			// Ask for first event number and guests fields.		
			String eventNumber = promptForEventNumber();
			String phoneNumber = promptForPhoneNumber();
			int numberOfGuests = promptForGuests();

				// Use the input to invoke the first event object.
				Event firstEvent = new Event(eventNumber, phoneNumber, numberOfGuests);

			// Ask for second event number and guests
			
			eventNumber = promptForEventNumber();
			phoneNumber = promptForPhoneNumber();
			numberOfGuests = promptForGuests();

				// Use the input to invoke the second event object.
				Event secondEvent = new Event(eventNumber, phoneNumber, numberOfGuests);

			// Ask for a third event number and guests
			eventNumber = promptForEventNumber();
			phoneNumber = promptForPhoneNumber();
			numberOfGuests = promptForGuests();

				// Use the input to invoke the third event object.
				Event thirdEvent = new Event(eventNumber, phoneNumber, numberOfGuests);

		// Display details of both event objects.
		computePrice(firstEvent);
		computePrice(secondEvent);
		computePrice(thirdEvent);

		// For one event, create a loop that displays "Please come to my event" for each guest.
		for(int i = thirdEvent.getNumberOfGuests(); i > 0; i--)
		{
			System.out.println("Please come to my event.");
		}

		// Display which event is larger than the others
		eventIsBigger(firstEvent, secondEvent);
		eventIsBigger(firstEvent, thirdEvent);
		eventIsBigger(secondEvent, thirdEvent);
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
		System.out.println("\nThe contacts phone number is: " + e.getContactPhone());
		System.out.println("The number of guests is: " + e.getNumberOfGuests());
		System.out.println("Large event pricing is " + e.isLargeEvent());
		System.out.println("The price per guest is: $" + e.getPricePerGuest());
		System.out.println("The total price for this event is: $" + e.getEventPrice());
		
	}

	public static Event eventIsBigger(Event e1, Event e2)
	{
		if(e1.getNumberOfGuests() > e2.getNumberOfGuests())
		{
			// Event 1 is larger
			System.out.println("\n\nThe first events number is: " + e1.getEventNumber());
			System.out.println("The first event has " + e1.getNumberOfGuests() + " guests.");
			System.out.println("The second events number is: " + e2.getEventNumber());
			System.out.println("The second event has " + e2.getNumberOfGuests());
			System.out.println("The larger events number is: " + e1.getEventNumber());
			System.out.println("The larger event has " + e1.getNumberOfGuests() + " guests.");
			return e1;
		}
		else if(e1.getNumberOfGuests() < e2.getNumberOfGuests())
		{
			// Event 2 is larger
			System.out.println("\n\nThe first events number is: " + e1.getEventNumber());
			System.out.println("The first event has " + e1.getNumberOfGuests() + " guests.");
			System.out.println("The second events number is: " + e2.getEventNumber());
			System.out.println("The second event has " + e2.getNumberOfGuests());
			System.out.println("The larger events number is: " + e2.getEventNumber());
			System.out.println("The larger event has " + e2.getNumberOfGuests() + " guests.");
			return e2;
		}
		else if(e1.getNumberOfGuests() == e2.getNumberOfGuests())
		{
			// Both events are the same size. 
			// Return Event 1 by defaut.
			System.out.println("\n\nThe first events number is: " + e1.getEventNumber());
			System.out.println("The first event has " + e1.getNumberOfGuests() + " guests.");
			System.out.println("The second events number is: " + e2.getEventNumber());
			System.out.println("The second event has " + e2.getNumberOfGuests());
			System.out.println("The larger events number is: " + e1.getEventNumber());
			System.out.println("The larger event has " + e1.getNumberOfGuests() + " guests.");
			return e1;
		}
		else
		{
			// Error - return event 2 when in error.
			System.out.println("Error in evaluating events.");
			return e2;
		}
	}
}