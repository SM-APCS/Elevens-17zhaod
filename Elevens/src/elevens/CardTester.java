package elevens;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	  Card one = new Card("7", "Spades", 1);
	  Card two = new Card("6", "Diamonds", 2);
	  Card three = new Card("6", "Diamonds", 2);
	  
	  System.out.println("Two matches one?" + two.matches(one));
	  System.out.println("Two matches three?" + two.matches(three));
	  System.out.println("One matches three?" + one.matches(three));
	  
	  
	  System.out.println("Suit of Card One: " + one.suit());
	  System.out.println("Rank of Card One: " + one.rank());
	  System.out.println("Point Value of Card One: " + one.pointValue());
	  System.out.println("Card one: " + one.toString());
	  
	  System.out.println("Suit of Card Two: " + two.suit());
    System.out.println("Rank of Card Two: " + two.rank());
    System.out.println("Point Value of Card Two: " + two.pointValue());
    System.out.println("Card two: " + two.toString());
    
    System.out.println("Suit of Card Three: " + three.suit());
    System.out.println("Rank of Card Three: " + three.rank());
    System.out.println("Point Value of Card Three: " + three.pointValue());
    System.out.println("Card three: " + three.toString());
	}
}
