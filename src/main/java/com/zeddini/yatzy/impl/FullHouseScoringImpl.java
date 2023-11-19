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
 * Implémentation de Stratégie de scoring pour la catégorie "Full House" dans le
 * jeu Yatzy. Un "Full House" est formé lorsque le joueur a trois dés d'une
 * valeur et deux dés d'une autre valeur.
 */
public class FullHouseScoringImpl implements IScoringStrategy {

	/**
	 * Calcule le score pour un "Full House" en Yatzy.
	 * 
	 * @param dice Un tableau représentant les valeurs des dés.
	 * @return Le score total si un "Full House" est présent, sinon 0.
	 */
	@Override
	public int score(int[] dice) {
		Map<Integer, Long> frequencyMap = Arrays.stream(dice).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return (frequencyMap.size() == 2 && frequencyMap.containsValue(2L) && frequencyMap.containsValue(3L))
				? Arrays.stream(dice).sum()
				: 0;
	}
}
