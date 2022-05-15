package Metodologia.Criação;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercicios calculadora:");
        Calculadora.soma(1, 4);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercicios de mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);

        // Emprestimo
        System.out.println("Exercicios de emprestimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); // Não necessario mas viável
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }

}
