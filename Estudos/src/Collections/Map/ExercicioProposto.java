package Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265
*/

public class ExercicioProposto {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> populacaoEstimada = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(populacaoEstimada);

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        populacaoEstimada.put("RN", 3534165);
        System.out.println(populacaoEstimada);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        if (populacaoEstimada.containsKey("PB") != true)
            populacaoEstimada.put("PB", 4039277);
        System.out.println(populacaoEstimada);

        System.out.println("\nExiba a população PE: " + populacaoEstimada.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoEstimada1 = new LinkedHashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(populacaoEstimada1);

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstimada3 = new TreeMap<>(populacaoEstimada);
        System.out.println(populacaoEstimada3);

        System.out.println("\nExiba o estado com o menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(populacaoEstimada.values());
        String menorEstado = "";
        for (Map.Entry<String, Integer> entry : populacaoEstimada.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
                menorEstado = entry.getKey();
                System.out.println("O estado com a menor população é o: " + menorEstado + " com " + menorPopulacao
                        + " habitantes");
            }
        }

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(populacaoEstimada.values());
        String maiorEstado = "";
        for (Map.Entry<String, Integer> entry : populacaoEstimada.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao)) {
                maiorEstado = entry.getKey();
                System.out.println("O estado com a maior população é o: " + maiorEstado + " com " + maiorPopulacao
                        + " habitantes");
            }
        }

        Iterator<Integer> iterator = populacaoEstimada.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " +
                (soma / populacaoEstimada.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstimada.values().iterator();
        while (iterator1.hasNext()) {
            int temp = iterator1.next();
            if (temp < 4000000)
                iterator1.remove();
        }
        System.out.println(populacaoEstimada);

        System.out.println("\nApague o dicionário de estados: ");
        populacaoEstimada.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + populacaoEstimada.isEmpty());

    }
}
