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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import com.zeddini.yatzy.impl.ChanceScoringImpl;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

/**
 * Classe de test pour la catégorie "Chance" dans le jeu Yatzy.
 * Cette classe utilise des tests paramétrés pour tester diverses combinaisons de dés
 * et vérifier que le score calculé est correct.
 */
public class ChanceScoringTest {

    /**
     * Teste le calcul du score pour la catégorie "Chance" avec différentes combinaisons de dés.
     * Utilise des tests paramétrés fournis par la méthode 'provideDiceForChance'.
     * 
     * @param dice Le tableau de dés pour le test.
     * @param expectedScore Le score attendu pour la combinaison de dés donnée.
     */
	@ParameterizedTest
    @MethodSource("provideDiceForChance")
    public void testScoreChance(int[] dice, int expectedScore) {
        // Arrange
        IScoringStrategy chanceScoring = new ChanceScoringImpl();

        // Act & Assert
        assertEquals(expectedScore, chanceScoring.score(dice),
                "Le score calculé pour la combinaison de dés doit être égal à la somme des valeurs des dés.");
    }
 

    /**
     * Fournit un flux de données pour les tests paramétrés, avec différentes combinaisons de dés
     * et les scores attendus correspondants.
     * 
     * @return Un flux d'arguments contenant des tableaux de dés et les scores attendus.
     */

    private static Stream<Arguments> provideDiceForChance() {
        return Stream.of(
            Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 15), // Cas typique avec des dés différents
            Arguments.of(new int[] { 2, 3, 4, 5, 6 }, 20), // Autre cas typique avec des dés différents
            Arguments.of(new int[] { 1, 1, 1, 1, 1 }, 5),  // Tous les dés identiques (minimum)
            Arguments.of(new int[] { 6, 6, 6, 6, 6 }, 30), // Tous les dés identiques (maximum)
            Arguments.of(new int[] { 4, 4, 4, 4, 4 }, 20), // Autre cas avec tous les dés identiques
            Arguments.of(new int[] { 3, 3, 3, 3, 3 }, 15), // Autre cas avec tous les dés identiques
            Arguments.of(new int[] { 2, 2, 2, 2, 2 }, 10), // Autre cas avec tous les dés identiques
            Arguments.of(new int[] { 1, 2, 1, 2, 1 }, 7),  // Combinaison mixte
            Arguments.of(new int[] { 2, 3, 2, 3, 2 }, 12), // Autre combinaison mixte
            Arguments.of(new int[] { 4, 5, 5, 5, 4 }, 23), // Combinaison avec des répétitions
            Arguments.of(new int[] { 3, 4, 3, 4, 3 }, 17), // Autre combinaison avec des répétitions
            // Autres cas de test
            Arguments.of(new int[] { 1, 2, 3, 3, 2 }, 11), // Combinaison mixte avec répétitions
            Arguments.of(new int[] { 2, 4, 4, 5, 5 }, 20), // Combinaison avec deux paires
            Arguments.of(new int[] { 1, 1, 2, 3, 4 }, 11), // Combinaison avec une paire
            Arguments.of(new int[] { 5, 5, 5, 5, 1 }, 21)  // Combinaison avec quatre d'une sorte
        );
    }
}

