package com.zeddini.yatzy;

public class YatzyScorer {

	private IScoringStrategy scoringStrategy;

	public void setScoringStrategy(IScoringStrategy strategy) {
		this.scoringStrategy = strategy;
	}

	/**
	 * 
	 * @param dice
	 * @return
	 */
	public int score(int[] dice) {
		return scoringStrategy.score(dice);
	}
}
