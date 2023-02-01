// TestFitnessTracker
import java.time.*;

public class TestFitnessTracker
{
	public static void main(String[] args)
	{
		FitnessTracker fit1 = new FitnessTracker();
		
		System.out.println("The fitness activity was: " + fit1.getFitnessActivity());
		System.out.println("The time spent was: " + fit1.getMinutesSpent() + " minutes.");
		System.out.println("The date was: " + fit1.getDateOfActivity());
		
		// Create variables to hold test values for 2nd fitness object.
		String currentActivity = "Swimming";
		int currentTimeSpent = 50;
		LocalDate currentDate = LocalDate.now();
		
		// Create new fitness object using the test values
		FitnessTracker fit2 = new FitnessTracker(currentActivity, currentTimeSpent, currentDate);
		
		// Use the get methods of the new fitness object to display the values to the screen.
		System.out.println("\nThe 2nd fitness activity was: " + fit2.getFitnessActivity());
		System.out.println("The 2nd time spent was: " + fit2.getMinutesSpent() + " minutes.");
		System.out.println("The 2nd date was: " + fit2.getDateOfActivity());
	}
}