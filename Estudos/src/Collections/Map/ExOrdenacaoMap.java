package Collections.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Dados as seguintes informações sobre meus libros favoritos e seus autores, 
crie um dicionário e ordene este dicionário exibindo:
(Nome Autor - Nome Livro)

Autor = Howking, Stephen - Livro = Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = O Poder do Hábito. páginas: 408
Autor = Harari, Yural Noah - Livro = 21 Lições Para o Século 21. páginas: 432
*/

public class ExOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("====\tOrdem Aleatória\t====");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                put("Hawking, Stephan", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari, Yural Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " // " + livro.getValue().getNome());

        System.out.println("====\tOrdem de Inserção\t====");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephan", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari, Yural Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " // " + livro.getValue().getNome());

        System.out.println("====\tOrdem Alfabética por Autores\t====");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " // " + livro.getValue().getNome());

        System.out.println("====\tOrdem Alfabética por Nomes dos Livros\t====");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " // " + livro.getValue().getNome());

        System.out.println("====\tOrdem por Número de Páginas\t====");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPag());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " // " + livro.getValue().getNome());
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", paginas='" + getPaginas() + "'" +
                "}";
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }

}

class ComparatorPag implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }

}