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
import com.zeddini.yatzy.impl.FullHouseScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Classe de tests pour la catégorie de score "Full House" dans le jeu de Yatzy.
 *
 * Le score "Full House" est attribué pour une combinaison spécifique 
 * comprenant un brelan et une paire. Cette classe contient des tests 
 * validant la logique de calcul des points pour diverses combinaisons de dés 
 * qui constituent un "Full House", ainsi que pour des scénarios qui ne 
 * correspondent pas aux critères d'un "Full House".
 *
 * Chaque test assure que l'implémentation de FullHouseScoring calcule 
 * correctement et renvoie le score adéquat ou zéro, conformément aux règles 
 * du jeu de Yatzy.
 */
public class FullHouseScoringTest {

	/**
     * Teste la logique de scoring pour la catégorie "Full House".
     * Ce test vérifie différents scénarios, y compris des cas valides et non valides
     * pour un "Full House" selon les règles du Yatzy.
     */
	@Test
	public void testFullHouseScoring() {
		IScoringStrategy fullHouseScoring = new FullHouseScoringImpl();

		// Full House valide (deux 1 et trois 2)
		assertEquals(8, fullHouseScoring.score(new int[] { 1, 1, 2, 2, 2 }));
		// Pas un Full House (deux paires, mais pas de trois d'une sorte)
		assertEquals(0, fullHouseScoring.score(new int[] { 2, 2, 3, 3, 4 }));
		// Pas un Full House (tous les dés sont identiques)
		assertEquals(0, fullHouseScoring.score(new int[] { 4, 4, 4, 4, 4 }));
		// Tests supplémentaires pour confirmer la logique

		// Full House valide (trois 1 et deux 2)
		assertEquals(7, fullHouseScoring.score(new int[] { 1, 1, 1, 2, 2 }));

		// Full House valide (trois 2 et deux 3)
		assertEquals(12, fullHouseScoring.score(new int[] { 2, 2, 2, 3, 3 }));

		// Full House valide (trois 3 et deux 2)
		assertEquals(13, fullHouseScoring.score(new int[] { 2, 2, 3, 3, 3 }));

		// Full House valide (trois 3 et deux 4)
		assertEquals(17, fullHouseScoring.score(new int[] { 3, 3, 3, 4, 4 }));

		// Full House valide (trois 4 et deux 3)
		assertEquals(18, fullHouseScoring.score(new int[] { 3, 3, 4, 4, 4 }));

		// Full House valide (deux 4 et trois 5)
		assertEquals(23, fullHouseScoring.score(new int[] { 4, 4, 5, 5, 5 }));

		// Full House valide (deux 5 et trois 4)
		assertEquals(22, fullHouseScoring.score(new int[] { 4, 4, 4, 5, 5 }));

		// Full House valide (trois 5 et deux 6)
		assertEquals(27, fullHouseScoring.score(new int[] { 5, 5, 5, 6, 6 }));

		// Full House valide (trois 6 et deux 5)
		assertEquals(28, fullHouseScoring.score(new int[] { 6, 6, 6, 5, 5 }));

		// Pas un Full House (suite de 1 à 5)
		assertEquals(0, fullHouseScoring.score(new int[] { 1, 2, 3, 4, 5 }));

		// Pas un Full House (trois 1, mais pas de paire)
		assertEquals(0, fullHouseScoring.score(new int[] { 1, 1, 1, 2, 3 }));

		// Pas un Full House (quatre 2, il manque une paire distincte)
		assertEquals(0, fullHouseScoring.score(new int[] { 2, 2, 2, 2, 3 }));

		// Pas un Full House (tous les dés sont identiques)
		assertEquals(0, fullHouseScoring.score(new int[] { 1, 1, 1, 1, 1 }));
	}
}