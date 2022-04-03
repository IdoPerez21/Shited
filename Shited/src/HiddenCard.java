import java.awt.Color;
import java.awt.Graphics;

public class HiddenCard extends Card{
	Color color;
	
	public HiddenCard(Card card)
	{
		color = Color.red;
		cardValue = card.getCardValue();
		cardShape = card.getCardShape();
	}
	@Override
	public void Draw(Graphics g) {
		g.setColor(color);
		g.fillRect(posX, posY, width, height);
	}
}
