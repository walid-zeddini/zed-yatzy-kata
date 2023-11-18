package com.zeddini.yatzy;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.zeddini.yatzy.impl.PairScoringImpl;

/**
 * Classe de test pour la stratégie de scoring "Pair" dans le jeu Yatzy.
 * Teste la capacité de la stratégie PairScoring à calculer correctement le score
 * pour différents lancers de dés.
 */
public class PairScoringTest {

    /**
     * Teste le calcul du score pour la catégorie "Pair".
     * Vérifie que la méthode score retourne le score correct pour plusieurs combinaisons
     * de dés, y compris les cas où il n'y a pas de paires, où il y a plusieurs paires,
     * et où tous les dés sont identiques.
     */
    @Test
    public void testScore() { 
        IScoringStrategy pairScoring = new PairScoringImpl(); 
        assertEquals(8, pairScoring.score(new int[]{3, 3, 3, 4, 4}));  // Deux paires de trois et quatre
        assertEquals(12, pairScoring.score(new int[]{1, 1, 6, 2, 6})); // Paire de un et six
        assertEquals(0, pairScoring.score(new int[]{1, 2, 3, 4, 5}));   // Aucune paire
        assertEquals(10, pairScoring.score(new int[]{5, 5, 5, 5, 5})); // Quadruple cinq
        assertEquals(2, pairScoring.score(new int[]{1, 1, 2, 3, 4}));  // Paire de un
    }
}