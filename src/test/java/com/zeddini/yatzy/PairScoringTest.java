package com.zeddini.yatzy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.zeddini.yatzy.impl.PairScoringImpl;

public class PairScoringTest {
	@Test
	public void testScore() {
		IScoringStrategy pairScoring = new PairScoringImpl();
		assertEquals(8, pairScoring.score(new int[] { 3, 3, 3, 4, 4 }));
		assertEquals(12, pairScoring.score(new int[] { 1, 1, 6, 2, 6 }));
		assertEquals(0, pairScoring.score(new int[] { 1, 2, 3, 4, 5 }));
	}
}