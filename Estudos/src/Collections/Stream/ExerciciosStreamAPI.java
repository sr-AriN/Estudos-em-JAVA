package Collections.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
        public static void main(String[] args) {
                List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                System.out.println("Imprima todos os elementos dessa lista de Strings: ");
                /*
                 * System.out.println("Imprima todos os elementos dessa lista de Strings: ");
                 * numerosAleatorios.stream().forEach(new Consumer<String>() {
                 * 
                 * @Override
                 * public void accept(String t) {
                 * System.out.println(t);
                 * }
                 * 
                 * });
                 */
                // numerosAleatorios.stream().forEach(t -> System.out.println(t));
                // numerosAleatorios.forEach(t -> System.out.println(t));
                numerosAleatorios.stream().forEach(System.out::println);

                System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
                // Não imprime numeros repetidos
                numerosAleatorios.stream()
                                .limit(5)
                                .collect(Collectors.toSet())
                                .forEach(System.out::println);
                // Se quiser colocar dentro de uma var
                Set<String> collectSet = numerosAleatorios.stream()
                                .limit(5)
                                .collect(Collectors.toSet());
                System.out.println(collectSet);

                System.out.println("Transforme esta lista de String em uma lesta de números inteiros: ");
                /*
                 * numerosAleatorios.stream()
                 * .map(new Function<String, Integer>() {
                 * 
                 * @Override
                 * public Integer apply(String t) {
                 * return Integer.parseInt(t);
                 * }
                 * 
                 * });
                 */
                /*
                 * numerosAleatorios.stream()
                 * .map(t -> Integer.parseInt(t));
                 */
                /*
                 * numerosAleatorios.stream()
                 * .map(Integer::parseInt)
                 * .collect(Collectors.toList())
                 * .forEach(System.out::println);
                 */
                List<Integer> collectList = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
                System.out.println(collectList);

                System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
                /*
                 * List<Integer> listparesMaioresque2 = numerosAleatorios.stream()
                 * .map(Integer::parseInt)
                 * .filter(new Predicate<Integer>() {
                 * 
                 * @Override
                 * public boolean test(Integer t) {
                 * if (t % 2 == 0 && t > 2)
                 * return true;
                 * return false;
                 * }
                 * 
                 * }).collect(Collectors.toList());
                 * System.out.println(listparesMaioresque2);
                 */

                List<Integer> listparesMaioresque2 = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .filter(t -> (t % 2 == 0 && t > 2)).collect(Collectors.toList());
                System.out.println(listparesMaioresque2);

                System.out.println("Mostre a média dos números: ");
                numerosAleatorios.stream()
                                .mapToInt(Integer::parseInt)
                                .average()
                                .ifPresent(System.out::println);

                System.out.println("Remova os valores ímpares: ");
                collectList.removeIf(Integer -> (Integer % 2 != 0));

                System.out.println("Ignore os 3 primeiros  elementos da lista e imprima o restante: ");
                numerosAleatorios.stream()
                                .skip(3)
                                .forEach(System.out::println);
                ;

                long countNumerosUnicos = numerosAleatorios.stream()
                                .distinct()
                                .count();
                System.out.println("Retirando os números repetidos da lista, quantos números ficam? "
                                + countNumerosUnicos);

                List<Integer> numerosAleatoriosIntegers = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

                System.out.println("Mostre o menor valor da lista: ");
                numerosAleatoriosIntegers.stream()
                                .mapToInt(Integer::intValue)
                                .min()
                                .ifPresent(System.out::println);

                System.out.println("Mostre o maior valor da lista: ");
                numerosAleatoriosIntegers.stream()
                                .mapToInt(Integer::intValue)
                                .max()
                                .ifPresent(System.out::println);

                int somaDosNumerosAleatorios = numerosAleatoriosIntegers.stream()
                                .mapToInt(Integer::intValue)
                                .filter(t -> (t % 2 == 0 && t > 2))
                                .sum();
                System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosAleatorios);

                System.out.println("Mostre a lista na ordem númerica: ");
                List<Integer> numerosOrdemNatural = numerosAleatoriosIntegers.stream()
                                .sorted(Comparator.naturalOrder())
                                .collect(Collectors.toList());
                System.out.println(numerosOrdemNatural);

                System.out.println("Agrupe os valores ímpares múltiplos de 3 e de 5: ");
                // dica collect(Collectors.groupingBy(new Function))
                Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosIntegers.stream()
                                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
                System.out.println(collectNumerosMultiplosDe3E5);
        }

}
