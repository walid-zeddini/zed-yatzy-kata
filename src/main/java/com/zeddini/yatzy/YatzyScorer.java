package com.zeddini.yatzy;

public class YatzyScorer {

    // Method to score for Chance
	/**
	 * scoreChance
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreChance(int[] dice) {
	    int sum = 0;
	    for (int die : dice) {
	        sum += die;
	    }
	    return sum;
	}


    // Method to score for Yatzy

	/**
	 * scoreYatzy
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreYatzy(int[] dice) {
	    int firstValue = dice[0];
	    for (int die : dice) {
	        if (die != firstValue) {
	            return 0;
	        }
	    }
	    return 50;
	}


	// Methods for Ones, Twos, Threes, Fours, Fives, Sixes
	/**
	 * scoreSingles
	 * 
	 * @param dice
	 * @param number
	 * @return
	 */
	public static int scoreSingles(int[] dice, int number) {
	    int sum = 0;
	    for (int die : dice) {
	        if (die == number) {
	            sum += die;
	        }
	    }
	    return sum;
	}


	// Method for Pair
	/**
	 * scorePair
	 * 
	 * @param dice
	 * @return
	 */
	public static int scorePair(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Two Pairs
	/**
	 * scoreTwoPairs
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreTwoPairs(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Three of a Kind
	/**
	 * scoreThreeOfAKind
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreThreeOfAKind(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Four of a Kind
	/**
	 * scoreFourOfAKind
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreFourOfAKind(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Small Straight
	/**
	 * scoreSmallStraight
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreSmallStraight(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Large Straight
	/**
	 * scoreLargeStraight
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreLargeStraight(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method for Full House
	/**
	 * scoreFullHouse
	 * 
	 * @param dice
	 * @return
	 */
	public static int scoreFullHouse(int[] dice) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {

	}
}
