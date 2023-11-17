package com.zeddini.yatzy;

public class YatzyScoringImpl implements IScoringStrategy {

	@Override
    public int score(int[] dice) {
        int firstValue = dice[0];
        for (int die : dice) {
            if (die != firstValue) {
                return 0;
            }
        }
        return 50;
    }

}
