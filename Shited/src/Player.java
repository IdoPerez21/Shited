import java.awt.Graphics;
import java.util.ArrayList;

public class Player extends Drawable{
	private final int Hidden_Cards_Amount = 3;
	private final int First_Round_Hand_Cards = 6;
	
	private final int Cards_Padding = 10;
	private int tableCardsWidth, tableCardsHeight;
//	int screenDivWidth = ScreenManager.Width / First_Round_Hand_Cards;
//	int screenDivHeight = ScreenManager.Height / First_Round_Hand_Cards;
	
	
	private String playerName;
	private int playerId;
	private ArrayList<Card> playerHandDeck;
	Card[] tableDeck; //pos: 0-2 hidden cards, 3-5 visible cards

	
	public Player(String name, int id)
	{
		playerId = id; playerName = name;
		playerHandDeck = new ArrayList<Card>();
		tableDeck = new Card[Hidden_Cards_Amount * 2];
		setPlayerPaintSize();
	}
	
	//sets the player boundaries for painting the cards
	public void setPlayerPaintSize()
	{
		width = ScreenManager.Width - 4 * Cards_Padding;
		height = 250; // hard value!!!
		posX = (ScreenManager.Width - width)/2;
		posY = ScreenManager.Height - height - Cards_Padding;
		setBoundings();
	}
	
	@Override
	public void Draw(Graphics g)
	{
		for(Card card: playerHandDeck)
		{
			card.Draw(g);
		}
		
		for(int i = 0; i < tableDeck.length; i ++)
		{
			if(tableDeck[i] != null)
			{
				tableDeck[i].Draw(g);
			}
		}
	}
	
	public void setHandCardsPos()
	{	
//		width = screenDivWidth - Cards_Padding * 2;
//		height = ScreenManager.Height / 2 + screenDivHeight;
		int startPointX = posX;
		int cardHeight = height;
		int cardWidth = (width - playerHandDeck.size() * Cards_Padding) / playerHandDeck.size();
		
		for(Card card: playerHandDeck) {
//			card.posX = startPointX;
//			
//			System.out.println("startPoint = " + startPointX);
//			startPointX += width + Cards_Padding;
//			
//			card.posY = height;
//			card.height = cardHeight;
//			card.width = width;
//			card.posX = startPointX;
////			System.out.println("startPoint = " + startPointX);
//			card.posY = posY;
//			card.height = cardHeight;
//			card.width = cardWidth;
			setCardPaintValues(card, startPointX, posY, cardWidth, cardHeight);
			startPointX += cardWidth + Cards_Padding;
		}
	}
	
	public void isCardPicked(int mouseX, int mouseY)
	{
		
	}
	
	public void setTableCardsPos()
	{
		tableCardsWidth = width / 3;
		tableCardsHeight = height / 2;
		int startPointX = (width - tableCardsWidth) / 2;
		int cardHeight = tableCardsHeight;
		int cardWidth = (tableCardsWidth - Hidden_Cards_Amount * Cards_Padding) / Hidden_Cards_Amount;
		int pointY = posY - 2 * Cards_Padding - cardHeight;
		System.out.println("PointY :" + pointY);
		
		for(int i = 0; i < tableDeck.length; i ++)
		{
			if(tableDeck[i] != null)
			{
				//System.out.println(tableDeck[i]);
				setCardPaintValues(tableDeck[i], startPointX, pointY, cardWidth, cardHeight);
				startPointX += cardWidth + Cards_Padding;
			}
		}
	}
	
	public void setCardPaintValues(Card card, int cardPosX, int cardPosY, int cardWidth, int cardHeight)
	{
		card.posX = cardPosX;
		card.posY = cardPosY;
		card.height = cardHeight;
		card.width = cardWidth;
		card.setBoundings();
//		System.out.println("startPoint = " + posX);
//		System.out.println("posY = " + card.posY);
//		System.out.println("posX = " + card.posX);
//		System.out.println("startPoint = " + startPointX);
//		System.out.println("Width = " + card.width);
//		System.out.println("Height = " + card.height);
	}
	
	public void getAllCards(MainDeck mainDeck)
	{
		for(int i = 0; i < Hidden_Cards_Amount; i++) {
			Card card = mainDeck.getCard();
			HiddenCard hiddenCard = new HiddenCard(card);
			tableDeck[i] = hiddenCard;
			//System.out.println(tableDeck[i]);
		}
		
		for(int i = 0; i < First_Round_Hand_Cards; i++) {
			playerHandDeck.add(mainDeck.getCard());
		}
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public ArrayList<Card> getPlayerHandDeck() {
		return playerHandDeck;
	}

	public void setPlayerHandDeck(ArrayList<Card> playerHandDeck) {
		this.playerHandDeck = playerHandDeck;
	}
}
