package com.zeddini.yatzy;
/*
 * Copyright 2023 Zeddini, as indicated by the @author tags.
 *
 * Licensed under the zeddini License; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.zeddini.com/licenses/LICENSE-2.0
 *
 * @author  Zeddini Walid
 * @version 1.0.0
 * @since   2023-11-19 
 */
import com.zeddini.yatzy.impl.SmallStraightScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Small Straight" dans le jeu
 * Yatzy. Teste la capacité de détecter un "Small Straight" et de calculer le
 * score approprié.
 */
public class SmallStraightScoringTest {

	/**
	 * Teste le scoring pour la catégorie "Small Straight". Vérifie si le score
	 * calculé est 15 pour une séquence de dés de 1 à 5.
	 */
	@Test
	public void testSmallStraightScoring() {
		IScoringStrategy smallStraightScoring = new SmallStraightScoringImpl();
		assertEquals(15, smallStraightScoring.score(new int[] { 1, 2, 3, 4, 5 })); // Small Straight
		assertEquals(0, smallStraightScoring.score(new int[] { 2, 3, 4, 5, 6 })); // Pas un "Small Straight"
		assertEquals(0, smallStraightScoring.score(new int[] { 1, 2, 2, 4, 5 })); // Pas un "Small Straight"

		// Tests supplémentaires
		assertEquals(0, smallStraightScoring.score(new int[] { 1, 1, 1, 1, 1 })); // Pas un "Small Straight"
		assertEquals(0, smallStraightScoring.score(new int[] { 2, 3, 4, 5, 5 })); // Pas un "Small Straight"
		assertEquals(0, smallStraightScoring.score(new int[] { 1, 3, 4, 5, 6 })); // Pas un "Small Straight"
		assertEquals(0, smallStraightScoring.score(new int[] { 1, 2, 3, 3, 4 })); // Pas un "Small Straight"
		assertEquals(0, smallStraightScoring.score(new int[] { 1, 2, 3, 4, 4 })); // Pas un "Small Straight"
	}
}
