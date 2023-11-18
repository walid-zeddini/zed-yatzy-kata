package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.TwoPairsScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Two Pairs" dans le jeu Yatzy.
 * Vérifie si le score calculé est correct pour différentes combinaisons de dés
 * conformément aux règles de la catégorie "Two Pairs".
 */
public class TwoPairsScoringTest {

    /**
     * Teste le scoring pour la catégorie "Two Pairs".
     * Vérifie si le score calculé correspond à la somme des deux paires les plus élevées,
     * ou si le score est 0 lorsque moins de deux paires sont trouvées.
     */
	@Test
    public void testTwoPairsScoring() {
        IScoringStrategy twoPairsScoring = new TwoPairsScoringImpl();

       
        assertEquals(8, twoPairsScoring.score(new int[]{1, 1, 2, 3, 3})); // Deux paires (1+1+3+3)
        assertEquals(0, twoPairsScoring.score(new int[]{1, 1, 2, 3, 4})); // Une seule paire
        assertEquals(6, twoPairsScoring.score(new int[]{1, 1, 2, 2, 5})); // Deux paires (1+1+2+2)
        assertEquals(8, twoPairsScoring.score(new int[]{1, 1, 3, 3, 3})); // Deux paires (1+1+3+3)
        assertEquals(0, twoPairsScoring.score(new int[]{3,3,3,3,1})); // Deux paires de même type (0 car pas deux paires distinctes)

        assertEquals(0, twoPairsScoring.score(new int[]{1, 2, 3, 4, 5})); // Pas de paires
        assertEquals(0, twoPairsScoring.score(new int[]{2, 2, 2, 2, 5})); // Quatre de même type (0 car pas deux paires distinctes)
    }
}
