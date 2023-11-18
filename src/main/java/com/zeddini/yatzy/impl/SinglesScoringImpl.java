package com.zeddini.yatzy.impl;

import com.zeddini.yatzy.IScoringStrategy;
import java.util.Arrays;

/**
 * Implémentation de la stratégie de scoring pour les catégories "Singles" (Ones, Twos, Threes, Fours, Fives, Sixes).
 * Le score est la somme de tous les dés d'une valeur spécifique.
 */
public class SinglesScoringImpl implements IScoringStrategy {

    private final int valueToScore;

    /**
     * Constructeur pour créer une instance de scoring pour une valeur de dé spécifique.
     *
     * @param valueToScore La valeur des dés à sommer pour le score (par exemple, 1 pour Ones, 2 pour Twos, etc.).
     */
    public SinglesScoringImpl(int valueToScore) {
        this.valueToScore = valueToScore;
    }

    /**
     * Calcule le score pour la catégorie "Singles" en fonction de la valeur des dés fournis.
     *
     * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
     * @return Le score total pour les dés qui correspondent à la valeur spécifiée.
     */
    @Override
    public int score(int[] dice) {
        return (int) Arrays.stream(dice)
                .filter(die -> die == valueToScore)
                .sum();
    }
}