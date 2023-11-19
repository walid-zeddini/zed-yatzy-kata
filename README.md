# Zed Yatzy Scoring System Implementation

This implementation of the Yatzy Scoring System is inspired by the classic dice game Yatzy. The rules and gameplay are adapted to closely match the original game.

If you are interested in similar projects and learning resources, you might find [SammanCoaching.org](https://sammancoaching.org).

## Description

This project that I called it **Zed Yatzy Kata**  focuses on implementing a scoring system for the dice game Yatzy. Detailed rules and the problem description can be found here: [Yatzy](https://sammancoaching.org/kata_descriptions/yatzy.html)

## Scoring Categories

In Yatzy, players score points based on various dice combinations. The categories include:

- **Chance:** Sum of all dice.
- **Yatzy:** 50 points for five-of-a-kind.
- **Singles:** (Ones, Twos, Threes, Fours, Fives, Sixes) Sum of dice with the specified number.
- **Pair:** Sum of the two highest matching dice.
- **Two Pairs:** Sum of two different pairs of dice.
- **Three of a Kind:** Sum of three dice with the same number.
- **Four of a Kind:** Sum of four dice with the same number.
- **Small Straight:** 15 points for a sequence from 1 to 5.
- **Large Straight:** 20 points for a sequence from 2 to 6.
- **Full House:** Sum of a three-of-a-kind and a pair.

## Implementation

The scoring system is implemented in **Java 17**, adhering to best practices in software development. Key features include:

- **Distinct classes** for each scoring category.
- Thorough unit testing using **JUnit 5** .
- Application of **TDD** and **BDD** methodologies.
- **Clean code** practices and **SOLID** principles.
- Application of **Design Pattern** such as **Strategy Pattern** **Factory Method** and **Singleton Pattern** .

## Usage

To score a roll, instantiate the appropriate scoring strategy class and pass an array of dice values to the `score` method.
Exemple Of Chance Scoring:
 
```java
IScoringStrategy chanceScoring = new ChanceScoringImpl();
int score = chanceScoring.score(new int[]{1, 2, 3, 4, 5});
```
## Tests

Comprehensive unit tests are provided for each scoring strategy, ensuring robustness and correctness. Tests are designed to cover a wide range of scenarios, validating the scoring logic for each Yatzy category.

## Acknowledgements

This Yatzy Scoring System is a creative adaptation from the original game, designed to explore advanced software development techniques and refactoring practices. The original concept of Yatzy and its scoring rules are classic and widely recognized.

Special thanks to the contributors and maintainers of Cyber-Dojo for providing a platform that inspires such katas. For more information on the original kata, refer to [Jon Jagger's blog post](http://jonjagger.blogspot.co.uk/2012/05/yahtzee-cyber-dojo-refactoring-in-java.html).