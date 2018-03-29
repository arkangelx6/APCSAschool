package Unit9Elevens;





import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board{

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	/**
	 * The cards on this board.
	 */
	private Card[] cards;

	/**
	 * The deck of cards being used to play the current game.
	 */
	private Deck deck;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
		/*cards = new Card[BOARD_SIZE];
		deck = new Deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();*/
		System.out.println("Kevin Cheng");
		System.out.println("Period 4");
		System.out.println("3/28/18");
		System.out.println("Computer 15");
	}

	
	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		if(selectedCards.size() == 3) {
			//System.out.println(containsPairSum11(selectedCards));
			if(containsPairSum11(selectedCards)) {
				
				return true;
			}
			else {
				return false;
			}
		}
		else if(selectedCards.size() == 2) {
			if(containsDoubleFace(selectedCards)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < super.size(); i++) {
			list.add(i);
		}
		//System.out.println(list);
		for(int j = 0; j < super.size(); j++) {
			if(containsPairSum11(list)) {
				return true;
			}
			if(containsDoubleFace(list)) {
				return true;
			}
		}
		
			return false;
		
		
	}


	

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		//System.out.println(super.cardAt(selectedCards.get(0)).pointValue());
		//System.out.println(super.cardAt(selectedCards.get(1)).pointValue());
		//System.out.println(super.cardAt(selectedCards.get(2)).pointValue());
		if(super.cardAt(selectedCards.get(0)).pointValue() + super.cardAt(selectedCards.get(1)).pointValue() + super.cardAt(selectedCards.get(2)).pointValue() == 11) {
			return true;
		}
		if(super.deckSize() < 1) {
		}
		else {
		
		for(int i = 0; i < selectedCards.size(); i++) {
			for(int j = 0; j < selectedCards.size(); j++) {
				for(int k = 0; k < selectedCards.size(); k++){
					//if(super.cardAt(selectedCards.get(i)).pointValue() != 0 && super.cardAt(selectedCards.get(j)).pointValue() != 0 && super.cardAt(selectedCards.get(k)).pointValue()!= 0 ){
						if(i != j && j != k && k != i){
				if(super.cardAt(selectedCards.get(i)).pointValue() + super.cardAt(selectedCards.get(j)).pointValue() + super.cardAt(selectedCards.get(k)).pointValue() == 11) {
					
					System.out.println(j + " " + i + " " + k);
					return true;
					
				}
				
			}
					}
				}
			}
			
		}
		//}
		return false;
		
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsDoubleFace(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		int jackCounter = 0;
		int queenCounter = 0; 
		int kingCounter = 0;
		
		
		for(int i = 0; i < selectedCards.size(); i++) {
			
		if(super.cardAt(selectedCards.get(i)).rank().equals("jack")) {
			jackCounter++;
			
			
		}
		if(super.cardAt(selectedCards.get(i)).rank().equals("queen")) {
			queenCounter++;
			
		}
		if(super.cardAt(selectedCards.get(i)).rank().equals("king")) {
			kingCounter++;
			
		}
		}
		
		if(jackCounter >= 2 || queenCounter >= 2 || kingCounter >= 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

