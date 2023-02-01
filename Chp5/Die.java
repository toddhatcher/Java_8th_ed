
// Die.java

public class Die
{
	public static final int HIGHEST_DIE_VALUE = 6;
	public static final int LOWEST_DIE_VALUE = 1;
	
	private int rollValue; // 1-6
	
	public Die()
	{
		// Randomly assigns number to rollValue
		int randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
		LOWEST_DIE_VALUE);
		rollValue = randomValue;
	}
	
	public int getRollValue()
	{
		return rollValue;
	}
}