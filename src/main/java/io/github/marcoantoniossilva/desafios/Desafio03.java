package io.github.marcoantoniossilva.desafios;

import java.util.Scanner;

/*
  O número primo 41, pode ser escrito como a soma de 6 números primos consecutivos:
  41 = 2 + 3 + 5 + 7 + 11 + 13
  Essa é a maior soma de números primos consecutivos que gera um número primo abaixo de 100.
  A maior soma de números primos consecutivos abaixo de 500 que gera um número primo contém 14 termos e é igual à 281:
  281 = 2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 + 31 + 37 + 41 + 43
  Faça um algoritmo que receba um número n e mostre qual é o maior número primo abaixo de n que é obtido através da soma consecutiva de números primos.
 */


public class Desafio03 {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.print("Digite um número: ");
    int number = keyboard.nextInt();
    System.out.printf("A maior soma de números primos consecutivos que gera um número primo abaixo de %d é %d.", number, dividersSum(number));

  }

  public static int dividersSum(int limit) {
    int total = 0;
    int number = 0;
    int lastPrimeNumber = 0;

    while (total <= limit) {
      if (isPrimeNumber(number)) {
        total += number;
        if (isPrimeNumber(total)) {
          lastPrimeNumber = total;
        }
      }
      number++;
    }
    return lastPrimeNumber;
  }

  public static boolean isPrimeNumber(int number) {
    int dividersCount = 1; // Todos  os números são divisíveis por ele mesmo
    int divider = 1;

    while (divider <= number / 2) { // O maior divisor de um número tirando ele mesmo, é a metade dele
      if (number % divider == 0) {
        dividersCount++;
      }
      divider++;
    }
    return dividersCount == 2;
  }
}
