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
import com.zeddini.yatzy.impl.FourOfAKindScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Four of a Kind" dans le jeu
 * Yatzy. Teste la capacité de calculer le score pour quatre dés de la même
 * valeur.
 */
public class FourOfAKindScoringTest {

	/**
	 * Teste le scoring pour la catégorie "Four of a Kind". Vérifie si le score
	 * calculé correspond à la somme des quatre dés identiques.
	 */
	@Test
	public void testFourOfAKindScoring() {
		IScoringStrategy fourOfAKindScoring = new FourOfAKindScoringImpl();
		assertEquals(8, fourOfAKindScoring.score(new int[] { 2, 2, 2, 2, 5 })); // Quatre deux
		assertEquals(0, fourOfAKindScoring.score(new int[] { 2, 2, 2, 5, 5 })); // Pas de "Four of a Kind"
		assertEquals(8, fourOfAKindScoring.score(new int[] { 2, 2, 2, 2, 2 })); // Cinq deux, mais score pour quatre

		// Tests supplémentaires
		assertEquals(12, fourOfAKindScoring.score(new int[] { 3, 3, 3, 3, 2 })); // Quatre trois
		assertEquals(0, fourOfAKindScoring.score(new int[] { 4, 4, 4, 2, 2 })); // Trois quatres, pas un "Four of a Kind"
		assertEquals(20, fourOfAKindScoring.score(new int[] { 5, 5, 5, 5, 5 })); // Cinq cinqs, mais score pour quatre
		assertEquals(0, fourOfAKindScoring.score(new int[] { 1, 2, 3, 4, 5 })); // Pas de "Four of a Kind"
		assertEquals(24, fourOfAKindScoring.score(new int[] { 6, 6, 6, 6, 3 })); // Quatre six
		assertEquals(0, fourOfAKindScoring.score(new int[] { 1, 1, 1, 2, 2 })); // Trois uns, pas un "Four of a Kind"
	}
}
