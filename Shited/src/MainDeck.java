import java.util.ArrayList;
import java.util.Random;

public class MainDeck{
	 public static ArrayList<Card> cards = new ArrayList<>();
	 static int deckSize;
	 public static final int Deck_Cards = 54;
	 int playersAmount;
	 private Random rnd = new Random();
	 
	 public MainDeck(int players)
	 {
		 playersAmount = players;
	 }
	 
	 public void createMainDeck()
	 {
		 Card[] superInstance = new Card[10];
//		 fillSuperInstance(superInstance);
		 int fourCounter = 0;
		 int numCounter = 2;
		 if(playersAmount > 4)
		 {
			 deckSize = Deck_Cards * 2;
		 }
		 else {
			 deckSize = Deck_Cards;
		 }
		 for(int i = 0; i < 15; i++) {
			 cards.add(new Card(numCounter, fourCounter));
		 }
		 
		 
	 }
	 
//	 private void fillSuperInstance(Card[] a)
//	 {
//		 a[ZeroCard.CARD_VALUE] = new ZeroCard();
//		 a[SuperCard.CARD_VALUE] = new SuperCard();
//		 a[StopCard.CARD_VALUE] = new StopCard();
//		 a[TransCard.CARD_VALUE] = new TransCard();
//		 a[LessCard.CARD_VALUE] = new LessCard();
//	 }
	 
	 public Card getCard() {
		 System.out.println(cards.size());
		 int random = rnd.nextInt(cards.size());
		 //System.out.println(random);
		 Card card = cards.get(random);
		 //System.out.println(card);
		 cards.remove(card);
		 return card;
	 }
}
