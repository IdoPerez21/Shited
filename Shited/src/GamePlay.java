import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GamePlay extends JFrame{
	private static final long serialVersionUID = 1L;
	public static ArrayList<Drawable> objectsDraw;
	int playersAmount;
	
	private ScreenManager screenManager = new ScreenManager();
	MainDeck mainDeck;
	Player player = new Player("ido", 0);

	public GamePlay() 
	{
		openWindow();
		objectsDraw = new ArrayList<Drawable>();
		firstRound();
		objectsDraw.add(player);
	}
	
	public void Loop()
	{
		
	}
	
	public void firstRound()
	{
		mainDeck = new MainDeck(1);
		mainDeck.createMainDeck();
		player.getAllCards(mainDeck);
		//player.getPlayerHandDeck().add(mainDeck.getCard());
		player.setHandCardsPos();
		player.setTableCardsPos();
	}
	
	private void openWindow()
	{
		setSize(ScreenManager.Width, ScreenManager.Height);
		setTitle("Shited");
		add(screenManager);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
