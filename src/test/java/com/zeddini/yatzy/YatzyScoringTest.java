package com.zeddini.yatzy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class YatzyScoringTest {
    @Test
    public void testScore() {
    	IScoringStrategy  yatzyScoring = new YatzyScoringImpl();
        assertEquals(50, yatzyScoring.score(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, yatzyScoring.score(new int[]{1, 1, 1, 2, 1}));
    }
}