package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.SinglesScoringImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour la stratégie de scoring "Singles" dans le jeu Yatzy.
 * Teste les différentes valeurs de dés (Ones, Twos, Threes, etc.) pour vérifier le calcul correct du score.
 */
public class SinglesScoringTest {

    @Test
    public void testSinglesScoring() {
        // Testing for Ones
        IScoringStrategy onesScoring = new SinglesScoringImpl(1);
        assertEquals(2, onesScoring.score(new int[]{1, 2, 1, 4, 5})); // Deux ones

        // Testing for Twos
        IScoringStrategy twosScoring = new SinglesScoringImpl(2);
        assertEquals(4, twosScoring.score(new int[]{1, 2, 1, 2, 5})); // Deux twos (2 + 2)

        // Testing for Threes
        IScoringStrategy threesScoring = new SinglesScoringImpl(3);
        assertEquals(6, threesScoring.score(new int[]{3, 2, 3, 4, 5})); // Deux threes (3 + 3)

        // Testing for Fours
        IScoringStrategy foursScoring = new SinglesScoringImpl(4);
        assertEquals(12, foursScoring.score(new int[]{3, 4, 4, 4, 5})); // Trois fours (4 + 4 + 4)

        // Testing for Fives
        IScoringStrategy fivesScoring = new SinglesScoringImpl(5);
        assertEquals(15, fivesScoring.score(new int[]{3, 4, 5, 5, 5})); // Trois fives (5 + 5 + 5)


        // Testing for Sixes
        IScoringStrategy sixesScoring = new SinglesScoringImpl(6);
        assertEquals(18, sixesScoring.score(new int[]{6, 6, 3, 6, 5})); // Trois sixes (6 + 6 + 6)
    }
}