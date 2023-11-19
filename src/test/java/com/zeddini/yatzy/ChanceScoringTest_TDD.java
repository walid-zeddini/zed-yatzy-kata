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
import org.junit.jupiter.api.Test;
import com.zeddini.yatzy.impl.ChanceScoringImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Méthodologie Test-Driven Development (TDD) / Red-Green-Refactor sur la
 * Classe de test pour la catégorie "Chance" dans le jeu Yatzy.
 * Cette classe teste la logique de scoring pour différentes combinaisons de dés.
 */
public class ChanceScoringTest_TDD {

    /**
     * Teste le scoring pour un lancer typique avec des dés différents.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithTypicalRoll() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {1, 2, 3, 4, 5};
        assertEquals(15, chanceScoring.score(dice));
    }

    /**
     * Teste le scoring pour un lancer où tous les dés sont identiques.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithAllDiceSame() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {6, 6, 6, 6, 6};
        assertEquals(30, chanceScoring.score(dice));
    }

    /**
     * Teste le scoring pour un lancer avec une combinaison mixte de dés.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithMixedRoll() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {2, 3, 2, 5, 4};
        assertEquals(16, chanceScoring.score(dice));
    }

    /**
     * Teste le scoring pour un lancer avec des dés répétés.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithRepeatedDice() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {3, 3, 3, 3, 2};
        assertEquals(14, chanceScoring.score(dice));
    }

    /**
     * Teste le scoring pour un lancer avec des dés faibles.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithLowDice() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {1, 1, 2, 2, 2};
        assertEquals(8, chanceScoring.score(dice));
    }

    /**
     * Teste le scoring pour un lancer avec une combinaison variée de dés.
     * Le score doit être la somme de tous les dés.
     */
    @Test
    public void testChanceScoringWithVariedCombination() {
        IScoringStrategy chanceScoring = new ChanceScoringImpl();
        int[] dice = {1, 4, 5, 5, 6};
        assertEquals(21, chanceScoring.score(dice));
    }
}
