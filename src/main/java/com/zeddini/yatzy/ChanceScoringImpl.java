package com.zeddini.yatzy;

public class ChanceScoringImpl implements IScoringStrategy {
	@Override
	public int score(int[] dice) {
		int sum = 0;
		for (int die : dice) {
			sum += die;
		}
		return sum;
	}
}
