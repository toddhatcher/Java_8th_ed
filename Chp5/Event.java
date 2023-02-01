// Event.java



public class Event
{
	public final static int LOW_PPRICE_PER_GUEST = 32;
	public final static int HIGH_PRICE_PER_GUEST = 35;
	public final static int LARGE_EVENT = 50;
	
	private String eventNumber;
	private int	numberOfGuests;
	private int eventPrice;
	private int pricePerGuest;
	
	public Event()
	{
		// Passes A000 and 0 to the 2 param constructor.
		this("A000", 0);
	}
	
	public Event(String eventNum, int numGuests)
	{
		// Accepts event number and guests.
		// Pass values to setEventNumber and setGuests methods.
		this.setEventNumber(eventNum);
		this.setGuests(numGuests);
	}

	public boolean isLargeEvent()
	{
		// returns true if numGuest >= 50
		// otherwise return false
		if(this.numberOfGuests >= 50)
		{
			return true;
		}
		else if(this.numberOfGuests < 50)
		{
			return false;
		}
		else
		{
			// Error on numberOfGuests
			System.out.println("Error with number of guests. Cannot determine event size.");
			return false;
		}

	}
	
	public void setEventNumber(String e)
	{
		eventNumber = e;
	}
	
	public void setGuests(int g)
	{
		numberOfGuests = g;

		if(isLargeEvent() == true)
		{
			// If Over 50 guests, use LOW_PRICE_PER_GUEST
			pricePerGuest = LOW_PPRICE_PER_GUEST;
		}
		else if(isLargeEvent() == false)
		{
			// Small event < 50 uses HIGH_PRICE_PER_GUEST
			pricePerGuest = HIGH_PRICE_PER_GUEST;
		}
		
		// Calculate event price
		eventPrice = numberOfGuests * pricePerGuest;
	}
	
	public String getEventNumber()
	{
		return eventNumber;
	}
	
	public int getNumberOfGuests()
	{
		return numberOfGuests;
	}
	
	public int getEventPrice()
	{
		return eventPrice;
	}

	public int getPricePerGuest()
	{
		return pricePerGuest;
	}
}