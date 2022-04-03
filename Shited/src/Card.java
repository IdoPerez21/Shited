import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Card extends Drawable {
	protected int cardValue;
	protected int cardShape;
	private boolean hiddenCard;
//	private boolean specialCard;
	
	public void createQuartets(ArrayList<Card> playerDeck)
	{
		for(int shape = 0; shape < 3; shape ++)
		{
			playerDeck.add(new Card(cardValue, shape));
		}
	}
	
	public Card(int cardValue, int cardShape) 
	{
		this.setCardValue(cardValue); this.setCardShape(cardShape);
	}
	
	public Card()
	{
		setCardValue(0);
		setCardShape(-1);
//		specialCard = false;
	}
	
	public Card(int shape) {
		setCardShape(shape);
	}

	public void setCardRealtiveWidth(int widthLimit)
	{
		width = widthLimit; 
	}
	
	@Override
	public void Draw(Graphics g)
	{
			g.setColor(Color.white);
			g.fillRect(posX, posY, width, height);
			g.setColor(Color.black);
			g.drawString(String.valueOf(cardValue), posX + 20, posY + 20); // hard code warnin
	}
	
	public boolean isPicked(int mouseX, int mouseY)
	{
		if((posX < mouseX && mouseX < boundX) && (posY < mouseY && mouseY < boundY))
		{
			return true;
		}
		return false;
	}
	
	public Card getInstance()
	{
		return new Card();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public int getCardShape() {
		return cardShape;
	}

	public void setCardShape(int cardShape) {
		this.cardShape = cardShape;
	}

	public boolean isHiddenCard() {
		return hiddenCard;
	}

	public void setHiddenCard(boolean hiddenCard) {
		this.hiddenCard = hiddenCard;
	}
	
}
