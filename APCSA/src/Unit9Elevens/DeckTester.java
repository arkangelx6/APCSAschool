package Unit9Elevens;

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
		//String[] ranks = {"jack", "queen", "king"};
		String[] ranks = {"ace", "2", "3", "4", "5", "6" ," 7", "8", "9", "10", "jack", "queen", "king"};
		//String[] suits = {"blue", "red"};
		String[] suits = {"clubs", "hearts", "diamonds", "spades"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		d.shuffle();
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		d.shuffle();
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		
	}
}
