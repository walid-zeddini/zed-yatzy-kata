package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.LargeStraightScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Large Straight" dans le jeu
 * Yatzy. Teste la capacité de détecter un "Large Straight" et de calculer le
 * score approprié.
 */
public class LargeStraightScoringTest {

	/**
	 * Teste le scoring pour la catégorie "Large Straight". Vérifie si le score
	 * calculé est 20 pour une séquence de dés de 2 à 6.
	 */
	@Test
	public void testLargeStraightScoring() {

		IScoringStrategy largeStraightScoring = new LargeStraightScoringImpl();
		assertEquals(20, largeStraightScoring.score(new int[] { 2, 3, 4, 5, 6 })); // Large Straight
		assertEquals(0, largeStraightScoring.score(new int[] { 1, 2, 3, 4, 5 })); // Pas un "Large Straight"
		assertEquals(0, largeStraightScoring.score(new int[] { 2, 3, 4, 5, 5 })); // Pas un "Large Straight"

		// Tests supplémentaires
		assertEquals(0, largeStraightScoring.score(new int[] { 1, 1, 1, 1, 1 })); // Pas un "Large Straight"
		assertEquals(0, largeStraightScoring.score(new int[] { 3, 4, 5, 6, 6 })); // Pas un "Large Straight"
		assertEquals(0, largeStraightScoring.score(new int[] { 2, 3, 4, 4, 5 })); // Pas un "Large Straight"
		assertEquals(0, largeStraightScoring.score(new int[] { 1, 2, 2, 4, 5 })); // Pas un "Large Straight"
		assertEquals(0, largeStraightScoring.score(new int[] { 1, 3, 4, 5, 6 })); // Pas un "Large Straight"
	}
}
