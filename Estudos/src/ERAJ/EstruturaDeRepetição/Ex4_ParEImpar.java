package ERAJ.EstruturaDeRepetição;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);

        scan.close();
    }
}
