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
public interface IScoringStrategy {

    /**
     * Calcule le score pour un ensemble donné de valeurs de dés en fonction des règles de scoring spécifiques.
     * Cette méthode est destinée à être implémentée par différentes stratégies de scoring dans le jeu Yatzy.
     * Chaque stratégie de scoring (comme Chance, Yatzy, Paire, etc.) implémentera cette méthode pour calculer
     * le score basé sur les valeurs des dés fournies.
     * 
     * Exemple d'utilisation :
     * Supposons que nous ayons une stratégie de scoring pour la catégorie "Chance". L'implémentation de cette
     * méthode pour cette stratégie calculera simplement la somme de tous les dés.
     * 
     * @param dice Un tableau d'entiers représentant les valeurs des dés. Chaque élément du tableau
     *             représente la valeur d'un dé, qui doit être comprise entre 1 et 6 inclus.
     * @return Le score calculé en fonction des valeurs des dés et des règles de la stratégie de scoring.
     */
    int score(int[] dice);
}
