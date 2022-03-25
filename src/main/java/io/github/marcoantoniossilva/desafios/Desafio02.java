package io.github.marcoantoniossilva.desafios;

import java.util.ArrayList;
import java.util.List;

/*
  Escreva um algoritmo que mostre todos os números n menores que 10.000, onde n e n + 1 possuem o mesmo número de divisores.
*/

public class Desafio02 {

  public static void main(String[] args) {
    final int MAX_NUMBER = 10_000;
    int lastDividersCount = 0;
    List<String> numbersWithSameDividersCount = new ArrayList<>();

    for (int currentNumber = 1; currentNumber <= MAX_NUMBER; currentNumber++) {
      int dividersCount = getDividersCount(currentNumber);
      if (lastDividersCount == dividersCount) {
        numbersWithSameDividersCount.add(String.valueOf(currentNumber - 1));
      }
      lastDividersCount = dividersCount;
    }

    String result = String.join(",", numbersWithSameDividersCount);

    System.out.println(result);
  }


  public static int getDividersCount(int number) {
    int dividersCount = 1;  // Todos  os números são divisíveis por ele mesmo
    int divider = 1;

    while (divider <= number / 2) {  // O maior divisor de um número tirando ele mesmo, é a metade dele
      if (number % divider == 0) {
        dividersCount++;
      }
      divider++;
    }
    return dividersCount;
  }
}
