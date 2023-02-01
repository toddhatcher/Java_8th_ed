// Card.java
// TH 7/31/2019

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
		if(v >= 1 && v <= 13)
		{
			cardValue = v;
		}
		else
		{
			cardValue = 1;
		}
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