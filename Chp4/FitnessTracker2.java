
// FitnessTracker
import java.time.*;

public class FitnessTracker2
{
	private String fitnessActivity;
	private int	minutesSpent;
	LocalDate date1; // Date Object
	
	// Test variables
	static String fitActivity = "running";
	static int minutesActive = 0;
	static LocalDate dateNow = LocalDate.of(2019, Month.JANUARY, 1);
	
	public FitnessTracker2()
	{
		this(fitActivity, minutesActive, dateNow);
	}
	
	public FitnessTracker2(String activity, int minutes, LocalDate date)
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

