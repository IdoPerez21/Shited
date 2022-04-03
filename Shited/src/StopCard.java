import java.awt.Graphics;
import java.util.ArrayList;

public class StopCard extends Card{
	
	public static final int CARD_VALUE = 8;
	
	public StopCard(int cardShape) 
	{
		this.setCardValue(CARD_VALUE); this.setCardShape(cardShape);
	}
	
	public StopCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(Graphics g) {
		super.Draw(g);
	}
	
	@Override
	public Card getInstance() {
		return new StopCard();
	}
	
	@Override
	public void createQuartets(ArrayList<Card> playerDeck) {
		for(int shape = 0; shape < 3; shape ++)
		{
			playerDeck.add(new StopCard(shape));
		}
	}
	
}
