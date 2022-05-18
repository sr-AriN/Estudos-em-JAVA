package Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie um conjunto contendo as cores do arco-íris e:

Exiba todas as cores uma abaixo da outra

A quantidade de cores que o arco-íris tem

Exiba as cores em ordem alfabética

Exiba as cores na ordem inversa da que foi informada

Exiba todas as cores que começam com a letra ”v”

Remova todas as cores que não começam com a letra “v”

Limpe o conjunto

Confira se o conjunto está vazio
*/

public class ExercicioProposto1 {
    public static void main(String[] args) {

        System.out.println("Criando o conjunto: ");
        Set<String> cores = new HashSet<>() {
            {
                add(new String("vermelho"));
                add(new String("laranja"));
                add(new String("amarelo"));
                add(new String("verde"));
                add(new String("azul"));
                add(new String("anil"));
                add(new String("violeta"));
            }
        };
        System.out.println(cores);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + cores.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(cores3);
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor : cores) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v"))
                iterator2.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());

    }
}