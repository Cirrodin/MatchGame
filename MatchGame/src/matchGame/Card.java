package matchGame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Card
{
	private Suit cardSuite; //In case we ever need
	private Color cardColor;
	private int value; //In case we ever need
	
	//instead of using Color[] with set values, i have it generating random RGB values as it goes and adding it to the array
	private static ArrayList<Color> colorArray = new ArrayList<Color>();


	public Card(Color cardColor)
	{
		super();
		this.cardColor = cardColor;
	}

	public Card(Color cardColor, int value)
	{
		super();
		this.cardColor = cardColor;
		this.value = value;
	}

	public Suit getCardSuite()
	{
		return cardSuite;
	}

	public Color getCardColor()
	{
		return cardColor;
	}

	public int getValue()
	{
		return value;
	}
	
	public static Color getColorArray(int i)
	{
		return colorArray.get(i);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(cardColor);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(cardColor, other.cardColor);
	}

	@Override
	public String toString()
	{
		return "Card [cardColor=" + cardColor + "]";
	}

	public enum Suit
	{
		HEARTS, SPADES, CLUBS, DIAMONDS;
	}
	
	
	
	/**
	 * adds random RGB value to the colorArray arraylist everytime it is called
	 */
	public static void populateColor() 
	{
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color cardColor = new Color(r,g,b);
		colorArray.add(cardColor);
		
	}
}
