package elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	  
	  String[] rank1 = {"Jack", "Queen", "King"};
	  String[] suit1 = {"Hearts", "Spades", "Diamonds"};
	  int[] value1 = {11, 12, 13};
	  Deck deck1 = new Deck(rank1, suit1, value1);
	  System.out.println("Deck size: " + deck1.size());
    System.out.println("Deck not empty: " + !deck1.isEmpty());
    System.out.println("Deck dealt card is: " + deck1.deal());
	  
	  String[] rank2 = {"10", "Queen", "King"};
	  String[] suit2 = {"Clubs", "Spades", "Diamonds"};
	  int[] value2 = {10, 12, 13};
	  Deck deck2 = new Deck(rank2, suit2, value2);
    System.out.println("Deck size: " + deck2.size());
	  System.out.println("Deck not empty: " + !deck2.isEmpty());
    System.out.println("Deck dealt card is: " + deck2.deal());
	      
	  String[] rank3 = {"1", "3", "Queen"};
	  String[] suit3 = {"Diamonds", "Spades", "Hearts"};
	  int[] value3 = {1, 3, 12};
	  Deck deck3 = new Deck(rank3, suit3, value3);
    System.out.println("Deck size: " + deck3.size());
    System.out.println("Deck not empty: " + !deck3.isEmpty());
	  System.out.println("Deck dealt card is: " + deck3.deal());
	}
}
