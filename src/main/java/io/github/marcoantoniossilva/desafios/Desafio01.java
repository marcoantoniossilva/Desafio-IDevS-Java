package io.github.marcoantoniossilva.desafios;

/*
Dado uma palavra qualquer p, construa um algoritmo que calcule a pontuação da palavra de acordo
com a pontuação de cada letra informada abaixo:

1 = A, E, I, O, U, L, N, R, S, T
2 = D, G
3 = B, C, M, P
4 = F, H, V, W, Y
5 = K
8 = J, X
10 = Q, Z

Por exemplo, se a palavra “desafio” for digitada, a pontuação esperada será 11:
d = 2
e = 1
s = 1
a = 1
f = 4
i = 1
o = 1

TOTAL = 11 PONTOS

 */

import java.util.*;

public class Desafio01 {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Digite uma palavra: ");
    String word = keyboard.next();
    int score = calculateWordScore(word);
    System.out.printf("A palavra '%s' teve um total de %d pontos!", word, score);
  }

  public static int calculateWordScore(String word) {
    int score = 0;
    char[] letters = word.toCharArray();

    for (char letter : letters) {
      score += calculateLetterScore(letter);
    }
    return score;
  }

  public static int calculateLetterScore(char letter) {
    List<String> worthOnePoint = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
    List<String> worthTwoPoints = Arrays.asList("D", "G");
    List<String> worthThreePoints = Arrays.asList("B", "C", "M", "P");
    List<String> worthFourPoints = Arrays.asList("F", "H", "V", "W", "Y");
    List<String> worthFivePoints = Arrays.asList("K");
    List<String> worthEightPoints = Arrays.asList("J", "X");
    List<String> worthTenPoints = Arrays.asList("Q", "Z");

    if (worthOnePoint.contains(String.valueOf(letter).toUpperCase())) {
      return 1;
    }
    if (worthTwoPoints.contains(String.valueOf(letter).toUpperCase())) {
      return 2;
    }
    if (worthThreePoints.contains(String.valueOf(letter).toUpperCase())) {
      return 3;
    }
    if (worthFourPoints.contains(String.valueOf(letter).toUpperCase())) {
      return 4;
    }
    if (worthFivePoints.contains(String.valueOf(letter).toUpperCase())) {
      return 5;
    }
    if (worthEightPoints.contains(String.valueOf(letter).toUpperCase())) {
      return 8;
    }
    if (worthTenPoints.contains(String.valueOf(letter).toUpperCase())) {
      return 10;
    }
    return 0;
  }

}
