package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
    Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.6}, faça:
*/

public class ExList {
    public static void main(String[] args) {
        // List notas = new ArrayList<Double>(); //antes do java 5
        /*
         * List<Double> notas = new ArrayList<Double>(); //Generics(JDK 5) - Diamond
         * Operator(jdk)
         */
        // ArrayList<Double> notas = new ArrayList<>(); // Não recomendável
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,
        // 3.6))
        /*
         * Valida porém limitada
         * List<Double> notas = new ArrayList<>((7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
         * notas.add(10d);
         * System.out.println(notas);
         */
        /*
         * Torna a lista imutável (Também válido)
         * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
         * notas.add(1d);
         * notas.remove(5d);
         * System.out.println(notas);
         */

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5,0 pela nota 6,0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5,0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iteretor = notas.iterator();
        Double soma = 0d;
        while (iteretor.hasNext()) {
            double next = iteretor.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos balores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        /*
         * System.out.println("Apague toda a lista: ");
         * notas.clear();
         * System.out.println(notas);
         */

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
         * Extra: Resolva esses exercícios utilizando os métodos da implementação
         * LinkedList;
         */

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new ArrayList<>();
        for (double nota : notas) {
            notas2.add(nota);
        }
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista sem removendo-o: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
    }
}
