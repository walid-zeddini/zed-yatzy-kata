package com.zeddini.yatzy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.zeddini.yatzy.impl.ChanceScoringImpl;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class ChanceScoringTest {

	@ParameterizedTest
	@MethodSource("provideDiceForChance")
	public void testScoreChance(int[] dice, int expectedScore) {
		IScoringStrategy chanceScoring = new ChanceScoringImpl();
		assertEquals(expectedScore, chanceScoring.score(dice),
				"Le score calculé doit correspondre à la somme attendue");
	}

	private static Stream<Arguments> provideDiceForChance() {
		return Stream.of(Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 15), // Cas typique
				Arguments.of(new int[] { 2, 3, 4, 5, 6 }, 20), // Un autre cas typique
				Arguments.of(new int[] { 1, 1, 1, 1, 1 }, 5), // Tous les dés identiques (minimum)
				Arguments.of(new int[] { 6, 6, 6, 6, 6 }, 30), // Tous les dés identiques (maximum)
				Arguments.of(new int[] { 4, 4, 4, 4, 4 }, 20), // Autre cas avec tous les dés identiques
				Arguments.of(new int[] { 3, 3, 3, 3, 3 }, 15), // Autre cas avec tous les dés identiques
				Arguments.of(new int[] { 2, 2, 2, 2, 2 }, 10), // Autre cas avec tous les dés identiques
				Arguments.of(new int[] { 1, 2, 1, 2, 1 }, 7), // Combinaison mixte
				Arguments.of(new int[] { 2, 3, 2, 3, 2 }, 12), // Autre combinaison mixte
				Arguments.of(new int[] { 4, 5, 5, 5, 4 }, 23), // Combinaison avec des répétitions
				Arguments.of(new int[] { 3, 4, 3, 4, 3 }, 17) // Autre combinaison avec des répétitions
		);
	}
}
