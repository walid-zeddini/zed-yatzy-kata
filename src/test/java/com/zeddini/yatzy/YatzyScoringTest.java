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
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.zeddini.yatzy.impl.YatzyScoringImpl;

/**
 * Classe de test pour la catégorie "Yatzy" dans le jeu Yatzy.
 * Cette classe teste la fonctionnalité de scoring pour la catégorie "Yatzy",
 * où le score maximal est obtenu si tous les dés ont la même valeur.
 */
public class YatzyScoringTest {

    /**
     * Teste le calcul du score pour la catégorie "Yatzy".
     * Vérifie que le score est correctement calculé pour différents cas,
     * y compris les cas où tous les dés ont la même valeur et les cas où ils ne l'ont pas.
     */
    @Test
    public void testScore() {
    	IScoringStrategy yatzyScoring = new YatzyScoringImpl();
    	
    	 assertEquals(0, yatzyScoring.score(new int[]{1, 1, 1, 2, 1})); // Quatre dés identiques
         assertEquals(0, yatzyScoring.score(new int[]{1, 1, 2, 2, 1})); // Trois dés identiques
         assertEquals(0, yatzyScoring.score(new int[]{1, 1, 2, 3, 4})); // Deux dés identiques
         assertEquals(0, yatzyScoring.score(new int[]{1, 2, 3, 4, 5})); // Pas de dés identiques
         
    	assertEquals(50, yatzyScoring.score(new int[]{1, 1, 1, 1, 1})); // Tous les dés identiques
    	assertEquals(50, yatzyScoring.score(new int[]{2, 2, 2, 2, 2})); // Tous les dés identiques
    	assertEquals(50, yatzyScoring.score(new int[]{3, 3, 3, 3, 3})); // Tous les dés identiques
    	assertEquals(50, yatzyScoring.score(new int[]{4, 4, 4, 4, 4})); // Tous les dés identiques
    	assertEquals(50, yatzyScoring.score(new int[]{5, 5, 5, 5, 5})); // Tous les dés identiques
        assertEquals(50, yatzyScoring.score(new int[]{6, 6, 6, 6, 6})); // Tous les dés sont des six
    }
}
