package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.*;
/**
 * Classe factory pour la création d'instances de différentes stratégies de scoring dans le jeu Yatzy.
 * <p>
 * Cette classe implémente le design pattern Factory Method pour offrir une interface simple
 * pour la création d'objets de diverses classes de stratégies de scoring. Elle encapsule la logique d'instanciation
 * et découple le code client des implémentations concrètes.
 * </p>
 * <p>
 * Le pattern Factory Method est utilisé ici pour gérer la création de différents objets de stratégie de scoring
 * en fonction du type de scoring requis. Cette approche simplifie le processus de création
 * et offre une flexibilité pour les ajouts ou modifications futures des stratégies de scoring.
 * </p>
 *
 * @param type  Le type de stratégie de scoring à créer.
 * @param value Une valeur optionnelle utilisée par certaines stratégies de scoring, comme SinglesScoring.
 * @return Une instance d'une classe qui implémente IScoringStrategy.
 * @throws IllegalArgumentException si un type de scoring inconnu est fourni.
 */
public class ScoringStrategyFactory { 

	public static IScoringStrategy getScoringStrategy(String type, int value) {

		return switch (type) {
		case "Chance" -> new ChanceScoringImpl();
		case "Yatzy" -> new YatzyScoringImpl();
		case "Singles" -> new SinglesScoringImpl(value);
		case "Pair" -> new PairScoringImpl();
		case "TwoPairs" -> new TwoPairsScoringImpl();
		case "ThreeOfAKind" -> new ThreeOfAKindScoringImpl();
		case "FourOfAKind" -> new FourOfAKindScoringImpl();
		case "SmallStraight" -> new SmallStraightScoringImpl();
		case "LargeStraight" -> new LargeStraightScoringImpl();
		case "FullHouse" -> new FullHouseScoringImpl();
		default -> throw new IllegalArgumentException("Unknown scoring type: " + type);
		};
	}
}