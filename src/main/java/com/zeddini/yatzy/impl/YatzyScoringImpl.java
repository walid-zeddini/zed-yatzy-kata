package com.zeddini.yatzy.impl;
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