package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dads as seguintes informações sobre sobre meus gatos, crie uma lista e ordene esta lista exibindo:
(nome - idade - cor)

Ex:
Gato 1 = nome: Jan, idade: 18, cor: preto
Gato 1 = nome: Simba, idade: 6, cor: tigrado
Gato 1 = nome: Jan, idade: 12, cor: amarelo
*/

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jan", 18, "preto"));
                add(new Gato("Jan", 6, "tigrado"));
                add(new Gato("Jan", 12, "amarelo"));
            }
        };
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());
        // meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor\t---");
        Collections.sort(meusGatos, new ComparatorCor());
        // meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        // meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", cor='" + getCor() + "'" +
                "}";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0)
            return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0)
            return cor;
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
