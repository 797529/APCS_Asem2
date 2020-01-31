/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Jack", "Clubs", 13);
		Card b = new Card("Queen", "Hearts", 13);
		Card c = new Card("King", "Diamonds", 13);
		Card d = new Card("Ace", "Spades", 1);
		
		System.out.println(a.toString());
		b.toString();
		c.toString();
		d.toString();
	}
}
