package com.zeddini.yatzy.impl;

import com.zeddini.yatzy.IScoringStrategy;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Implémentation de la stratégie de scoring pour la catégorie "Large Straight"
 * dans le jeu Yatzy. Un "Large Straight" est une séquence de dés de 2 à 6. Si
 * cette séquence est présente, le score est 20, la somme de tous les dés.
 */
public class LargeStraightScoringImpl implements IScoringStrategy {

	/**
	 * Calcule le score pour la catégorie "Large Straight". Si les dés forment une
	 * séquence de 2 à 6, le score est 20.
	 *
	 * @param dice Un tableau d'entiers représentant les valeurs des dés lancés.
	 * @return Le score de 20 si un "Large Straight" est présent, sinon 0.
	 */
	@Override
	public int score(int[] dice) {
		Set<Integer> diceSet = Arrays.stream(dice).boxed().collect(Collectors.toSet());
		return diceSet.equals(Set.of(2, 3, 4, 5, 6)) ? 20 : 0;
	}
}
