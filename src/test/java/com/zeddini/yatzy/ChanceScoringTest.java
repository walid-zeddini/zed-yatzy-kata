package com.zeddini.yatzy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ChanceScoringTest {

    @Test
    public void testScore() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        assertEquals(15, chanceScoring.score(new int[]{1, 2, 3, 4, 5}));
        assertEquals(21, chanceScoring.score(new int[]{4, 5, 5, 6, 1}));
    }
}