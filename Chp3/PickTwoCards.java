// PickTwoCards.java
// TH 1/31/2019

public class PickTwoCards
{
	public static void main(String[] args)
	{
		// Variables
		final int CARDS_IN_SUIT = 13;
		Card firstCard = new Card();
		Card secondCard = new Card();
		
		// Generate random number. 
		int firstRand = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		// Generate another random number.
		int secondRand = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		
		// Send random numbers to cards
		firstCard.setCardValue(firstRand);
		firstCard.setSuit('h');
		
		secondCard.setCardValue(secondRand);
		secondCard.setSuit('c');
		
		
		// Display first random number
		System.out.print("First Card: ");
		System.out.print(firstCard.getCardValue());
		System.out.print(" of " + firstCard.getSuit() + "\n");

		// Display another random number
		System.out.print("Second Card: ");
		System.out.print(secondCard.getCardValue());
		System.out.print(" of " + secondCard.getSuit() + "\n");
		
		
	}
}