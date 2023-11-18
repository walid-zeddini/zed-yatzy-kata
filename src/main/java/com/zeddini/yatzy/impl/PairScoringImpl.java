package com.zeddini.yatzy.impl;

import java.util.Arrays;

import com.zeddini.yatzy.IScoringStrategy;

public class PairScoringImpl implements IScoringStrategy {
    @Override
    public int score(int[] dice) {
        Arrays.sort(dice);
        for (int i = dice.length - 1; i > 0; i--) {
            if (dice[i] == dice[i - 1]) {
                return dice[i] * 2;
            }
        }
        return 0;
    }
}
