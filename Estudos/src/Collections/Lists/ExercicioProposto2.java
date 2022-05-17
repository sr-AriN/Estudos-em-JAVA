package Collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Devia para a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        int susIndice = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                susIndice++;
            }
        }

        switch (susIndice) {
            case 2:
                System.out.println("Suspeita!! ");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice!! ");
                break;
            case 5:
                System.out.println("Assassina!! ");
                break;
            default:
                System.out.println("Inocente!! ");
                break;
        }
        scan.close();
    }
}
