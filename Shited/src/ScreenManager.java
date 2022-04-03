import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ScreenManager extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public static int Width = 840, Height = 840;
	
	int x = 30;
	int y = 30;
	
	public ScreenManager() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.fillRect(100, 530, 125, 280);
		
//		g.fillRect(20, 490, 120, 280);
//		g.fillRect(150, 490, 120, 280);
//		g.fillRect(280, 490, 120, 280);
//		g.fillRect(410, 490, 120, 280);
//		g.fillRect(540, 490, 120, 280);
//		g.fillRect(670, 490, 120, 280);
		for(Drawable draw: GamePlay.objectsDraw) {
			draw.Draw(g);
		}
//		g.fillRect(20, 280, 780, 250);
	}
}
