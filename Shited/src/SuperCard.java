import java.awt.Graphics;
import java.util.ArrayList;

public class SuperCard extends Card{
	public static final int CARD_VALUE = 10;
	public SuperCard(int cardShape) 
	{
		this.setCardValue(CARD_VALUE); this.setCardShape(cardShape);
	}
	
	public SuperCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(Graphics g) {
		super.Draw(g);
	}
	
	@Override
	public void createQuartets(ArrayList<Card> playerDeck) {
		for(int shape = 0; shape < 3; shape ++)
		{
			playerDeck.add(new SuperCard(shape));
		}
	}
	
	
	@Override
	public Card getInstance() {
		return new SuperCard();
	}
}
