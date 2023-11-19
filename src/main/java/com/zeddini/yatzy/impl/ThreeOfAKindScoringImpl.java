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
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Three of a Kind" dans le jeu Yatzy.
 * Dans cette catégorie, si trois dés ont la même valeur, le score est la somme de ces trois dés.
 */
public class ThreeOfAKindScoringImpl implements IScoringStrategy {

    /**
     * Calcule le score pour la catégorie "Three of a Kind".
     * Si trois dés ou plus ont la même valeur, le score est la somme de ces trois dés.
     *
     * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
     * @return Le score calculé ou 0 si aucun "Three of a Kind" n'est trouvé.
     */
    @Override
    public int score(int[] dice) {
        Map<Integer, Long> frequencyMap = Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= 3)
                .mapToInt(entry -> entry.getKey() * 3)
                .findFirst()
                .orElse(0);
    }
}
