import java.awt.Graphics;

public class SpecialCard extends Card{
	private boolean isActivated;
	
	public SpecialCard(int value, int shape)
	{
		cardValue = value; cardShape = shape;
		setActivated(false);
	}
	
	@Override
	public void Draw(Graphics g) 
	{
		specialCardType(g);
	}
	
	public void specialCardType(Graphics g)
	{
		switch (cardValue) {
		case 2: paintCard2(g); break;
		case 3: paintCard3(g); break;
		case 10: paintCard10(g); break;
		case 7: paintCard7(g); break;
		case 8: paintCard8(g); break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + cardValue);
		}
	}

	private void paintCard8(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	private void paintCard7(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	private void paintCard10(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	private void paintCard3(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	private void paintCard2(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
}
