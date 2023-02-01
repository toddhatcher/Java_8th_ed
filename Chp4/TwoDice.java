
// TwoDice.java

public class TwoDice
{
	public static void main(String[] args)
	{
		// Declare two dice objects
		Die dice1 = new Die();
		Die dice2 = new Die();
		
		// Display their values.
		System.out.println("Dice 1 value is: " + dice1.getRollValue());
		System.out.println("Dice 2 value is: " + dice2.getRollValue());
	}
}