package com.zeddini.yatzy.impl;

import com.zeddini.yatzy.IScoringStrategy;

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
