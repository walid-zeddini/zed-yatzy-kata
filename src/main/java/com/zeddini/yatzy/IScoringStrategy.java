package com.zeddini.yatzy;

public interface IScoringStrategy {
	/**
	 * Calcule le score pour un jet de dés donné.
	 *
	 * @param dice Un tableau d'entiers représentant les dés.
	 * @return Le score calculé.
	 */
	int score(int[] dice);
}
