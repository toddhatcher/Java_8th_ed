
// FitnessTracker
import java.time.*;

public class FitnessTracker
{
	private String fitnessActivity;
	private int	minutesSpent;
	LocalDate date1; // Date Object
	
	
	public FitnessTracker()
	{
		// Default Constructor
		// "Running", Minutes = 0, Date = Jan 1. 2019
		fitnessActivity = "running";
		minutesSpent = 0;
		date1 = LocalDate.of(2019, Month.JANUARY, 1);
	}
	
	public FitnessTracker(String activity, int minutes, LocalDate date)
	{
		fitnessActivity = activity;
		minutesSpent = minutes;
		date1 = date;
	}
	
	// Get Methods for each field.
	public String getFitnessActivity()
	{
		return fitnessActivity;
	}
	
	public int getMinutesSpent()
	{
		return minutesSpent;
	}
	
	public LocalDate getDateOfActivity()
	{
		return date1;
	}
	
}

