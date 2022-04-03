import java.awt.Color;
import java.awt.Graphics;

public class Drawable {
	Graphics g;
	public int posX, posY, width, height, boundX, boundY;
	public Color color;
	public int padding;
	
	public void Draw(Graphics g) {}
	
	public void setBoundings()
	{
		boundX = this.posX + this.width;
		boundY = this.posY + this.height;
	}
	
	public boolean isInBoundaries(int x, int y)
	{
		if(posX < x && x < boundX && posY < y &&  y < boundY)
			return true;
		
		return false;
	}
}
