package com.zeddini.yatzy;

/**
 * La classe YatzyScorer sert de contexte pour appliquer différentes stratégies de scoring dans le jeu Yatzy.
 * Elle permet de définir la stratégie de scoring à utiliser et de calculer le score pour un lancer de dés donné en fonction de cette stratégie.
 */
public class YatzyScorer {

    private IScoringStrategy scoringStrategy;

    /**
     * Définit la stratégie de scoring à utiliser.
     * Cette méthode permet de changer la stratégie de scoring en fonction de la catégorie
     * de scoring choisie pour un lancer de dés particulier.
     *
     * @param strategy L'implémentation de IScoringStrategy à utiliser pour le scoring.
     */
    public void setScoringStrategy(IScoringStrategy strategy) {
        this.scoringStrategy = strategy;
    }

    /**
     * Calcule le score pour un lancer de dés donné en utilisant la stratégie de scoring actuellement définie.
     * Cette méthode délègue le calcul du score à l'objet IScoringStrategy spécifié.
     *
     * @param dice Un tableau d'entiers représentant les dés lancés.
     * @return Le score calculé pour le lancer de dés, selon la stratégie de scoring actuelle.
     */
    public int score(int[] dice) {
        return scoringStrategy.score(dice);
    }
}
