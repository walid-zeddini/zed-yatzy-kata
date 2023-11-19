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
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Two Pairs" dans le jeu Yatzy.
 * Dans cette catégorie, si deux paires distinctes de dés sont présentes, le score est la somme
 * de ces deux paires. Si moins de deux paires sont trouvées, le score est 0.
 */
public class TwoPairsScoringImpl implements IScoringStrategy {

    /**
     * Calcule le score pour la catégorie "Two Pairs".
     * Deux paires distinctes doivent être présentes pour obtenir un score.
     *
     * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
     * @return Le score total pour les deux paires, ou 0 si moins de deux paires sont trouvées.
     */
	@Override
    public int score(int[] dice) {
        Map<Integer, Long> counts = Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(d -> d, Collectors.counting()));

        List<Integer> pairs = counts.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .sorted(Map.Entry.<Integer, Long>comparingByKey().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (pairs.size() >= 2) {
            return pairs.get(0) * 2 + pairs.get(1) * 2;
        }
        return 0;
    }
}