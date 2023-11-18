package com.zeddini.yatzy;

import com.zeddini.yatzy.impl.ChanceScoringImpl;

/**
 * La classe principale pour exécuter le jeu Yatzy.
 * Elle démontre l'utilisation du système de scoring en utilisant différentes
 * stratégies de scoring pour calculer les scores basés sur les dés lancés.
 */
public class YatzyGame {

    /**
     * Le point d'entrée principal pour l'application.
     * Cette méthode démontre l'utilisation d'une stratégie de scoring pour la catégorie "Chance".
     * D'autres catégories peuvent être ajoutées et testées de manière similaire.
     *
     * @param args Les arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        YatzyScorer scorer = new YatzyScorer();
        int[] dice = {1, 2, 3, 4, 5}; // Exemple de lancer de dés

        // Utilisation de la catégorie "Chance" pour le scoring
        scorer.setScoringStrategy(new ChanceScoringImpl());
        System.out.println("Chance Score: " + scorer.score(dice));

        // Ajouter d'autres stratégies de scoring selon les besoins
    }
}
