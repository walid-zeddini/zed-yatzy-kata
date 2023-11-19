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
import com.zeddini.yatzy.impl.ThreeOfAKindScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Three of a Kind" dans le jeu Yatzy.
 * Teste la capacité de calculer le score pour trois dés de la même valeur.
 */
public class ThreeOfAKindScoringTest {

    /**
     * Teste le scoring pour la catégorie "Three of a Kind".
     * Vérifie si le score calculé correspond à la somme des trois dés identiques.
     */
    @Test
    public void testThreeOfAKindScoring() {
        IScoringStrategy threeOfAKindScoring = new ThreeOfAKindScoringImpl();
        
        assertEquals(9, threeOfAKindScoring.score(new int[]{3, 3, 3, 4, 5})); // Trois trois
        assertEquals(0, threeOfAKindScoring.score(new int[]{3, 3, 4, 5, 6}));  // Pas de "Three of a Kind"
        assertEquals(9, threeOfAKindScoring.score(new int[]{3, 3, 3, 3, 1})); // Quatre trois, mais score pour trois

        // Tests supplémentaires
        assertEquals(6, threeOfAKindScoring.score(new int[]{1, 1, 2, 2, 2}));  // Trois deux, mais seulement deux uns
        assertEquals(12, threeOfAKindScoring.score(new int[]{4, 4, 4, 1, 2})); // Trois quatres
        assertEquals(15, threeOfAKindScoring.score(new int[]{5, 5, 5, 5, 5})); // Cinq cinqs, mais score pour trois
        assertEquals(0, threeOfAKindScoring.score(new int[]{1, 2, 3, 4, 5}));  // Pas de "Three of a Kind"
        assertEquals(18, threeOfAKindScoring.score(new int[]{6, 6, 6, 2, 3})); // Trois six

        
    }
}
