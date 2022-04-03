import java.awt.Color;

public class CardView {
	private Card card;
	private Color color;
	private int width, height;
	private int posX, posY;
	private int boundX, boundY;
	
	public CardView(Card card, Color color, int width, int height, int posX, int posY) 
	{
		this.setCard(card); this.setColor(color); this.setWidth(width); this.setHeight(height); this.setPosX(posX); this.setPosY(posY);
		setBoundings();
	}
	
	public boolean isPicked(int mouseX, int mouseY)
	{
		if((posX < mouseX && mouseX < boundX) && (posY < mouseY && mouseY < boundY))
		{
			return true;
		}
		return false;
	}
	
	private void setBoundings()
	{
		boundX = this.posX + this.width;
		boundY = this.posY + this.height;
	}
	


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
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

}
