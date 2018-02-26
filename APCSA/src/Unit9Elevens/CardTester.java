package Unit9Elevens;

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
		Card c = new Card("Ace", "Clubs", 1);
		Card c1 = new Card("Three", "Clubs", 3);
		Card c2 = new Card("Nine", "Clubs", 9);
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
