package Collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
*/

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturaDoSemestre = new ArrayList<>();

        double soma = 0.0d;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a temperatura do " + i + "º mês");
            Double temperatura = scan.nextDouble();
            temperaturaDoSemestre.add(temperatura);
            soma += temperatura;
        }
        scan.close();
        double mediaDaTemperaturaDoSemestre = soma / temperaturaDoSemestre.size();

        System.out.println("Temperatura do Semestre: " + temperaturaDoSemestre);
        System.out.println("Média de temperaturas do semestre: " + mediaDaTemperaturaDoSemestre + "ºC");

        for (Double temp : temperaturaDoSemestre) {
            if (temp > (mediaDaTemperaturaDoSemestre)) {
                int index = temperaturaDoSemestre.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp + " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp + " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp + " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp + " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
