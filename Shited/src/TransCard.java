import java.awt.Graphics;
import java.util.ArrayList;

public class TransCard extends Card{
	
	public static final int CARD_VALUE = 3;
	
	public TransCard(int cardShape) 
	{
		this.setCardValue(CARD_VALUE); this.setCardShape(cardShape);
	}
	
	public TransCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(Graphics g) {
		super.Draw(g);
	}
	
	@Override
	public Card getInstance() {
		return new TransCard();
	}
	
	@Override
	public void createQuartets(ArrayList<Card> playerDeck) {
		for(int shape = 0; shape < 3; shape ++)
		{
			playerDeck.add(new TransCard(shape));
		}
	}

}
