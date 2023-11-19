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

/**
 * La classe YatzyScorer sert de contexte pour appliquer différentes stratégies de scoring dans le jeu Yatzy.
 * Elle maintient une référence à une stratégie (IScoringStrategy) à travers la variable scoringStrategy.
 * La méthode setScoringStrategy permet de changer dynamiquement la stratégie utilisée, 
 * ce qui signifie que le comportement de scoring de YatzyScorer peut être modifié à la volée en lui 
 * fournissant différentes implémentations de IScoringStrategy
 */
public class YatzyScorer {

	/*
	 * Le design pattern Singleton garantit qu'une seule instance 
	 * de la classe YatzyScorer est créée et accessible globalement
	 */
    private static YatzyScorer instance;
    
    private IScoringStrategy scoringStrategy;

    /**
     * Constructeur privé pour empêcher l'instanciation directe.
     */
    private YatzyScorer() {
    }

    /**
     * Fournit l'instance unique de YatzyScorer.
     * Crée l'instance si elle n'existe pas encore, sinon retourne l'instance existante.
     *
     * @return L'unique instance de YatzyScorer.
     */
    public static synchronized YatzyScorer getInstance() {
        if (instance == null) {
            instance = new YatzyScorer();
        }
        return instance;
    }
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
