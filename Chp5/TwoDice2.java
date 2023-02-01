
// TwoDice.java

public class TwoDice2
{
	public static void main(String[] args)
	{
		// Declare two dice objects
		Die dice1 = new Die();
        Die dice2 = new Die();
		
		// Display their values.
		System.out.println("\nDice 1 value is: " + dice1.getRollValue());
        System.out.println("Dice 2 value is: " + dice2.getRollValue() + "\n");
        
        // Check if two dice are the same or if one is greater.
        if(dice1.getRollValue() == dice2.getRollValue())
        {
            // Dice have the same value.
            System.out.println("Both dice have the same value.\n");
        }
        else if(dice1.getRollValue() > dice2.getRollValue())
        {
            // Dice 1 is greater
            System.out.println("Dice 1 is greater than Dice 2.\n");
        }
        else
        {
            // Dice 2 is greater
            System.out.println("Dice 2 is greater than Dice 1.\n");
        }
	}
}