package VTDOMJ;

public class Variaveis {

    public static void main(String[] args) {
        // Validas
        int i;
        int I;
        int _1a;
        int $aq;

        /*
         * Invalidas
         * int i;
         * int 1a;
         */

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // j = 15; -> Não pode alterar um valor final(Constante)

        int asrn24678md;
        int asrn2$4678_md;

        /*
         * int asrn246 78md;
         * int asrn2$46%78_md;
         */

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        final int NUMERO_TENTATIVAS = 5;

        /*
         * Má pratica funcionais
         * int QuantidadeProduto;
         * final int numeroTentativas = 5;
         * int QUANTIDADE_OPCOES = 25;
         * int qtdProd;
         */

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);

    }
}
