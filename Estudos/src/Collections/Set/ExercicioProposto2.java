package Collections.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

Ordem de Inserção

Ordem Natural (nome)

IDE

Ano de criação e nome

Nome, ano de criacao e IDE

Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioProposto2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagem = new HashSet<>() {
            {
                add(new LinguagemFavorita("java", 1991, "eclipse"));
                add(new LinguagemFavorita("javaScript", 1995, "vscode"));
                add(new LinguagemFavorita("python", 1990, "jython"));
            }
        };

        System.out.println("====\tOrdem de Inserção\t====");
        for (LinguagemFavorita lingua : linguagem) {
            System.out.println("Nome: " + lingua.getNome() +
                    " // " + "Ano: " + lingua.getAnoDeCriacao() +
                    " // " + "IDE: " + lingua.getIde());
        }

        System.out.println("====\tOrdem Natural\t====");
        Set<LinguagemFavorita> linguagem1 = new TreeSet<>(linguagem);
        for (LinguagemFavorita lingua : linguagem1) {
            System.out.println("Nome: " + lingua.getNome() +
                    " // " + "Ano: " + lingua.getAnoDeCriacao() +
                    " // " + "IDE: " + lingua.getIde());
        }

        System.out.println("====\tOrdem por IDE\t====");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(new ComparatorIDE());
        linguagem2.addAll(linguagem);
        for (LinguagemFavorita lingua : linguagem2) {
            System.out.println("Nome: " + lingua.getNome() +
                    " // " + "Ano: " + lingua.getAnoDeCriacao() +
                    " // " + "IDE: " + lingua.getIde());
        }
        System.out.println("====\tOrdem por Ano de Criação\t====");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(linguagem1);
        for (LinguagemFavorita lingua : linguagem3) {
            System.out.println("Nome: " + lingua.getNome() +
                    " // " + "Ano: " + lingua.getAnoDeCriacao() +
                    " // " + "IDE: " + lingua.getIde());
        }

        System.out.println("====\tOrdem de Nome/Ano/IDE\t====");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorNomeAnoIDE());
        for (LinguagemFavorita lingua : linguagem4) {
            System.out.println("Nome: " + lingua.getNome() +
                    " // " + "Ano: " + lingua.getAnoDeCriacao() +
                    " // " + "IDE: " + lingua.getIde());
        }

        System.out.println("====\tLINGUAGENS\t====");
        for (LinguagemFavorita lingua : linguagem3) {
            System.out.println("Nome: " + lingua.getNome());
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return this.anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return this.ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LinguagemFavorita)) {
            return false;
        }
        LinguagemFavorita linguagemFavorita = (LinguagemFavorita) o;
        return Objects.equals(nome, linguagemFavorita.nome)
                && Objects.equals(anoDeCriacao, linguagemFavorita.anoDeCriacao)
                && Objects.equals(ide, linguagemFavorita.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", anoDeCriacao='" + getAnoDeCriacao() + "'" +
                ", ide='" + getIde() + "'" +
                "}";
    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita lingua) {
        return this.getNome().compareTo(lingua.getNome());
    }

}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0)
            return ide;
        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }

}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0)
            return nome;

        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (ano != 0)
            return ano;

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }

}