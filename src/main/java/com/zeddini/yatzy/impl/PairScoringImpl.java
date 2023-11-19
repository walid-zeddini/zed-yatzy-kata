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
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.zeddini.yatzy.IScoringStrategy;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Pair" dans le jeu Yatzy.
 * Cette stratégie calcule le score en trouvant la paire la plus élevée parmi les dés lancés.
 */
public class PairScoringImpl implements IScoringStrategy {

    /**
     * Calcule le score pour la catégorie "Pair" en fonction des dés fournis.
     * Recherche la paire la plus élevée parmi les dés et retourne sa somme. Si aucune paire n'est trouvée,
     * retourne 0.
     *
     * @param dice Un tableau d'entiers représentant les dés lancés.
     * @return Le score calculé, qui est la somme des dés de la paire la plus élevée, ou 0 si aucune paire n'est trouvée.
     */
    @Override
    public int score(int[] dice) {
        return Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() >= 2)
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .map(e -> e.getKey() * 2)
                .orElse(0);
    }
}
