//CarlysEventPriceWithMethods.java

import java.util.Scanner;

public class EventDemo
{
	public static void main(String[] args)
	{
		/* Chp3.
		// Declare event object.
		Event firstEvent = new Event();
		// Call method prompting for number of guests.
		int numberOfGuests = promptForGuests();	
		// Call method prompting for event number.
		String eventNumber = promptForEventNumber();
		// Use returned values to set fields in the event object.
		firstEvent.setGuests(numberOfGuests);
		firstEvent.setEventNumber(eventNumber);
		// Call method that displays company motto.
		CarlysEventPriceWithMethods.displayMotto();
		// Call method that computes price. Return total.
		computePrice(firstEvent);
		*/
			
			
			
		// Delcare an Event Object.
		// Use default contsructor.
		Event firstEvent = new Event();
		// Ask for event number and guests fields.
		int numberOfGuests = promptForGuests();	
		String eventNumber = promptForEventNumber();
		// Use the input to invoke a 2nd Event Object.
		Event secondEvent = new Event(eventNumber, numberOfGuests);
		
		// Display details of both event objects.
		computePrice(firstEvent);
		computePrice(secondEvent);
	}
	
	public static int promptForGuests()
	{
		int numberOfGuests;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number of guests: ");
		numberOfGuests = keyboard.nextInt();
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
	
	public static void displayMotto()
	{
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");
	}
	
	public static void computePrice(Event e)
	{
		System.out.println("The event number is: " + e.getEventNumber());
		System.out.println("The number of guests is: " + e.getNumberOfGuests());
		System.out.println("The price per guest is: $" + e.PRICE_PER_GUEST);
		System.out.println("The total price for this event is: $" + e.getPrice());
		if (e.getNumberOfGuests() > 50)
		{
			System.out.println("This is a large event. ");
		}
	}
}