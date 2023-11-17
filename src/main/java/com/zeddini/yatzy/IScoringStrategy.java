package com.zeddini.yatzy;

public interface IScoringStrategy {
	
	
    /**
     * Calculates the score for a given set of dice values according to the specific scoring rules.
     * 
     * @param dice An array of integers representing the dice values.
     * @return The calculated score.
     */
    int score(int[] dice);
}
