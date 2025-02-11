/*
 * Copyright 2018 Roger Jaffe
 * All rights reserved
 */

package act03;
    import java.util.Random;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.  See the code in 
   * Tester.java for an example of how the interleaving works.
	 * @param values is an array of integers simulating cards to be shuffled.
   * @return the shuffled array
	 */
	public static int[] perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3*** */
                 int n = values.length;
                int k = 0;
                int m = 0;
                int[] shuffled = new int[n];
                if (n % 2 == 1){
                    m = (n/2);
                } else m = ((n/2) - 1);
                for (int j = 0; j <=m; j++){
                    shuffled[k] = values[j];
                    k = k + 2;
                }
                k = 1;
                for (int j = m+1; j <= (n-1); j++){
                    shuffled[k] = values[j];
                    k = k + 2;
                }
                return shuffled;
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
   * @return the shuffled array
	 */

	public static int[] selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
            int n = values.length;
                int k = n-1;
                int temp = 0;
                Random rand = new Random();
                int r = rand.nextInt(k);
                for (; k <= 1; k++){
                    temp = values[k];
                    values[k] = values[r];
                    values[r] = temp;
                }
                return values;


	}
}
