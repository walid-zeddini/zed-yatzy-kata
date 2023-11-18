package com.zeddini.yatzy.impl;

import java.util.Arrays;

import com.zeddini.yatzy.IScoringStrategy;

public class ChanceScoringImpl implements IScoringStrategy {
	/**
	 * Calcule le score pour la catégorie "Chance" dans le jeu Yatzy. Le score est
	 * la somme de tous les dés.
	 *
	 * @param dice Un tableau d'entiers représentant les dés.
	 * @return Le score calculé.
	 */
	public int score(int[] dice) {
		return Arrays.stream(dice).sum();
	}
}
