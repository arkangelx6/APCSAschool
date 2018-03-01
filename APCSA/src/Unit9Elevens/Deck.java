package Unit9Elevens;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
			//cards[i] = {rank[i], suits[i], values[i]};
		int counter = 0;
		cards = new Card[ranks.length*suits.length];
			for(int i = 0; i< suits.length; i++){
				
				for(int j = 0; j< ranks.length; j++){
					Card a = new Card(ranks[j], suits[i], values[j]);
					cards[counter] = a;
					//System.out.println(cards[counter]);
					//System.out.println(counter);
					counter++;
					
					
				}
			}
		size = cards.length;
		//System.out.println(size);
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		
		return cards.length;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		Card holder;
		Random rand = new Random();
		for(int i = 0; i < cards.length; i++){
			int n = rand.nextInt(cards.length);
			//System.out.println(n);
			holder = cards[n];
			cards[n] = cards[i];
			cards[i] = holder;
		}
		size = cards.length;
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		
		if(isEmpty()){
			return null;
		}
		else{
			size--;
			
		return cards[size];
		}
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";


		//Unit 9 - modify to work with Arrays
		/*
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		*/

		rtn = rtn + "\n";
		return rtn;
	}
}
