// Card.java
// TH 1/31/2019

public class Card
{
	private char s;
	private int cardValue;
	
	public Card()
	{
		s = 'x';
		cardValue = 0;
	}
	
	public void setSuit(char c)
	{
		s = c;
	}
	
	public void setCardValue(int v)
	{
			cardValue = v;
	}
	
	public char getSuit()
	{
		return s;
	}
	
	public int getCardValue()
	{
		return cardValue;
	}
}