package com.zeddini.yatzy;
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

public class YatzyScorer {
/**
 * La classe YatzyScorer sert de contexte pour appliquer différentes stratégies de scoring dans le jeu Yatzy.
 * Elle permet de définir la stratégie de scoring à utiliser et de calculer le score pour un lancer de dés donné en fonction de cette stratégie.
 */
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
