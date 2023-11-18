package com.zeddini.yatzy.impl;

import com.zeddini.yatzy.IScoringStrategy;
import java.util.Arrays;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Yatzy" dans le jeu Yatzy.
 * Dans la catégorie "Yatzy", le joueur marque 50 points si tous les dés ont la même valeur.
 */
public class YatzyScoringImpl implements IScoringStrategy {

    /**
     * Calcule le score pour la catégorie "Yatzy".
     * Retourne 50 si tous les dés ont la même valeur, sinon retourne 0.
     *
     * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
     * @return 50 si tous les dés sont identiques, sinon 0.
     */
    @Override
    public int score(int[] dice) {
        long distinctValues = Arrays.stream(dice).distinct().count();
        return distinctValues == 1 ? 50 : 0;
    }
}