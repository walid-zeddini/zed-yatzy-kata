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
import java.util.Arrays;
import com.zeddini.yatzy.IScoringStrategy;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Chance" dans le jeu Yatzy.
 * Dans la catégorie "Chance", le score est simplement la somme de toutes les valeurs de dés.
 */
public class ChanceScoringImpl implements IScoringStrategy {

    /**
     * Calcule le score pour un lancer de dés dans la catégorie "Chance".
     * Dans cette catégorie, le score est égal à la somme des valeurs de tous les dés.
     * Chaque élément du tableau représente la valeur d'un dé, qui doit être comprise entre 1 et 6.
     * 
     * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
     * @return Le score total pour le lancer de dés, qui est la somme de toutes les valeurs des dés.
     */
    @Override
    public int score(int[] dice) {
        return Arrays.stream(dice).sum();
    }
}
