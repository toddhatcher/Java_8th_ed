// War.java
// TH 7/31/2019

import java.util.*;

public class War
{
	public static void main(String[] args)
	{
		// Variables
        final int CARDS_IN_SUIT = 13;
        
        // Create two card objects, both using default constructor values.
		Card firstCard = new Card();
		Card secondCard = new Card();
		
		// Generate random number for first card value 
		int firstRand = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		// Generate another random number for second card value.
        int secondRand = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		
		// Send random numbers to cards
		firstCard.setCardValue(firstRand);
		secondCard.setCardValue(secondRand);
        
        // Generate random number for card suit.
        int numGen1 = ((int)(Math.random() * 100) % 4);
        int numGen2 = ((int)(Math.random() * 100) % 4);
        

        // Test Lines.  (Remove later.)
        System.out.println("numGen1 is " + numGen1);
        System.out.println("numGen2 is " + numGen2);

       // Send generated numbers to retrieve suit.
       firstCard.setSuit(numberToSuit(numGen1));
       secondCard.setSuit(numberToSuit(numGen2));
       
       // Check if cards are the same. Change suit on card 2 if Yes.
       if(firstCard.getCardValue() == secondCard.getCardValue() && firstCard.getSuit() == secondCard.getSuit())
       {
            System.out.println("Test Line: Cards were the same but should now be switched.");   
            
            // Generate a third number for a tie breaker to change suit.
            int numGen3 = ((int)(Math.random() * 100) % 4); 
            // Cards are the same. Change card 2's suit value.
            secondCard.setSuit(numberToSuit(numGen3));
       }

       // Display first cards value and suit
		System.out.print("The players card is: ");
		System.out.print(firstCard.getCardValue());
		System.out.print(" of " + firstCard.getSuit() + "\n");

		// Display second cards value and suit
		System.out.print("The computers card is: ");
		System.out.print(secondCard.getCardValue());
		System.out.print(" of " + secondCard.getSuit() + "\n");

       // Determine winner and output results.
       if(firstCard.getCardValue() > secondCard.getCardValue())
       {
           System.out.println("The players card is the winner!");
       }
       else if(firstCard.getCardValue() < secondCard.getCardValue())
       {
           System.out.println("The computers card is the winner!");
       }
       else if(firstCard.getCardValue() == secondCard.getCardValue())
       {
           System.out.println("Tie. Both cards have the same value.");
       }
       else 
       {
            // Error
            System.out.println("Error in comparing card values.");
       }
		
    }
    
    // Accepts an integer and sets a suit based off of the interger value.
    public static char numberToSuit(int randomN)
    {
        char suit = 'y';

         if(randomN == 0)
        {
            suit = 'd';
        }
        else if(randomN == 1)
        {
            suit = 'h';
        }
        else if(randomN == 2)
        {
            suit = 's';
        }
        else if(randomN == 3)
        {
            suit = 'c';
        }
        else
        {
            suit = 'z';
            System.out.println("Error with card suit number.");
        }
        return suit;
    }

    // Could make a display function that accepts a card type as input
    // then calls each cards getValue and getSuit function.
}