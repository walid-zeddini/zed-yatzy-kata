package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.ChanceScoringImpl;

public class YatzyGame {
    public static void main(String[] args) {
        YatzyScorer scorer = new YatzyScorer();
        int[] dice = {1, 2, 3, 4, 5}; // Example dice roll

        // Scoring with the Chance category
        scorer.setScoringStrategy(new ChanceScoringImpl());
        System.out.println("Chance Score: " + scorer.score(dice));

        // Add other scoring strategies as needed
    }
}
