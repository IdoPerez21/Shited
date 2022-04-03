import java.util.ArrayList;

public class Deck {
	protected ArrayList<Card> cards;
	protected int deckAmount;
	public Deck(int deckAmount)
	{
		cards = new ArrayList<>();
	}
	public Card getCard()
	{
		Card myCard = cards.get(0);
		cards.remove(0);
		return myCard;
	}
	
	public void createShuffledDeck()
	{
		
	}
}
