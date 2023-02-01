// Event.java

public class Event
{
	public final static int PRICE_PER_GUEST = 35;
	public final static int LARGE_EVENT = 50;
	
	private String eventNumber;
	private int	numberOfGuests;
	private int price;
	
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
	
	public void setEventNumber(String e)
	{
		eventNumber = e;
	}
	
	public void setGuests(int g)
	{
		numberOfGuests = g;
		// Calculate price
		price = numberOfGuests * PRICE_PER_GUEST;
	}
	
	public String getEventNumber()
	{
		return eventNumber;
	}
	
	public int getNumberOfGuests()
	{
		return numberOfGuests;
	}
	
	public int getPrice()
	{
		return price;
	}
}