package ERAJ.EstruturaDeRepetição;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuade de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
a saída deve ser confirme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        do {
            System.out.println("Número Inválido!! Tente outro entre 1 a 10: ");
            tabuada = scan.nextInt();
        } while ((tabuada < 1) || (tabuada > 10));

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        scan.close();
    }
}
