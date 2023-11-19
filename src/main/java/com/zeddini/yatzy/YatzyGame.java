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
import com.zeddini.yatzy.impl.*;

/**
 * La classe principale pour exécuter l'application "le jeu Yatzy" ou Yatzy
 * Game. Elle démontre l'utilisation du système de scoring en utilisant
 * différentes stratégies de scoring pour calculer les scores basés sur les dés
 * lancés.
 */

public class YatzyGame {

	/**
	 * Le point d'entrée principal pour l'application "le jeu Yatzy". La méthode
	 * main démontre l'utilisation des stratégies de scoring pour toutes les
	 * catégories telles que "Chance", .... jusqu'à "Full House"!
	 *
	 */
	public static void main(String[] args) {

		int[] dice = { 1, 2, 3, 4, 5 }; // Exemple de lancer de dés
		 
		// NOTA:
		// Deux Design Patterns ont été utilisés: Strategy Pattern et Factor Methode.
		// On peut appeler soit la méthode scoreByFactory soit scoreByContextStrategy
		 
		/**
		 * Appel de la méthode Factor
		 */
		scoreByFactory("Chance", 0, dice);
	    // scoreByFactory("Singles", 15, dice);
		
		/**
		 * Appel de la méthode scoreByContextStrategy
		 */
		scoreByContextStrategy(dice);
	} 

	private static void scoreByFactory(String type, int value, int[] dice) {
		/**
		 * ScoringStrategyFactory est le factory qui crée des instances de différentes
		 * stratégies de scoring basées sur le type fourni. Cela abstrait la création
		 * des objets et permet d'ajouter de nouvelles stratégies de scoring sans
		 * modifier le code consommateur.
		 */
		IScoringStrategy strategy = ScoringStrategyFactory.getScoringStrategy(type, value);
		int score = strategy.score(dice);
		System.out.println(type + " Score: " + score);

	}

	private static void scoreByContextStrategy(int[] dice) {
		// Obtenir l'instance unique de YatzyScorer
		YatzyScorer scorer = YatzyScorer.getInstance();


		 // Définir la stratégie de scoring 
		 // (par exemple,Utilisation de la catégorie "Chance" pour le scoring)
		scorer.setScoringStrategy(new ChanceScoringImpl());
		System.out.println("Chance Score: " + scorer.score(dice));
		
		// On peut changer la stratégie de scoring et recalculer pour différents lancers
        // scorer.setScoringStrategy(new YatzyScoringImpl());
        // ... et ainsi de suite pour d'autres lancers et stratégies
		
		
//		// Utilisation de la catégorie "Yatzy" pour le scoring
//		scorer.setScoringStrategy(new YatzyScoringImpl());
//		System.out.println("Yatzy Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Singles" pour le scoring
//		scorer.setScoringStrategy(new SinglesScoringImpl(15));
//		System.out.println("Singles Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Pair" pour le scoring
//		scorer.setScoringStrategy(new PairScoringImpl());
//		System.out.println("Pair Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Two Pairs" pour le scoring
//		scorer.setScoringStrategy(new TwoPairsScoringImpl());
//		System.out.println("Two Pairs Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Three Of A Kind" pour le scoring
//		scorer.setScoringStrategy(new ThreeOfAKindScoringImpl());
//		System.out.println("Three Of A Kind Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Four Of A Kind" pour le scoring
//		scorer.setScoringStrategy(new FourOfAKindScoringImpl());
//		System.out.println("Four Of A Kind Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Small Straight" pour le scoring
//		scorer.setScoringStrategy(new SmallStraightScoringImpl());
//		System.out.println("Small Straight Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Large Straight" pour le scoring
//		scorer.setScoringStrategy(new SmallStraightScoringImpl());
//		System.out.println("Large Straigh Score: " + scorer.score(dice));
//
//		// Utilisation de la catégorie "Full House" pour le scoring
//		scorer.setScoringStrategy(new FullHouseScoringImpl());
//		System.out.println("Full House Score: " + scorer.score(dice));
	}
}
