package Unit9Elevens;

import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for(int j = 0; j< (values.length+1)/2; j++){
			shuffled[k] = values[j];
			k = k +2;
			//System.out.println(k);
		}
		k = 1;
		for(int l = (values.length+1)/2; l< values.length; l++){
			shuffled[k] = values[l];;
			k = k +2;
			//System.out.println(k);
		}
		for(int o = 0; o < values.length; o++){
			values[o] = shuffled[o];
			
			}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int holder = 0;
		Random rand = new Random();
		for(int i = 0; i < values.length; i++){
			int n = rand.nextInt(values.length);
			System.out.println(n);
			holder = values[n];
			values[n] = values[i];
			values[i] = holder;
			
			/*if(shuffled[i] == 0){
			shuffled[i] = values[n];
			shuffled[n] = values[i];
			}*/
		}
		
	/*	for(int o = 0; o < values.length; o++){
		//values[o] = shuffled[o];
		
		}*/
		
	}
	public static String flip(){
		
	Random rand = new Random();
	int n = rand.nextInt(2);
		String heads = "heads";
		String tails = "tails";
	if(n == 0 || n ==1){
		return heads;
	}
	else{
		return tails;
	}
		
		
		
		
	}
	
}
