import java.awt.Graphics;
import java.util.ArrayList;

public class LessCard extends Card{
	
	public static final int CARD_VALUE = 7;
	
	public LessCard(int cardShape) 
	{
		this.setCardValue(CARD_VALUE); this.setCardShape(cardShape);
	}
	
	public LessCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(Graphics g) {
		super.Draw(g);
	}
	
	@Override
	public Card getInstance() {
		return new LessCard();
	}
	
	@Override
	public void createQuartets(ArrayList<Card> playerDeck) {
		for(int shape = 0; shape < 3; shape ++)
		{
			playerDeck.add(new LessCard(shape));
		}
	}

}
