package OrientacaoObjetos.OutrosExemplos;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua funcionário", "Complemento endereço funcionário", "bairro funcionário");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Primeiro vendedor");
        vendedor.setDocumento("123.456.789-10");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("\n\n");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Primeiro Caixa", "109.876.543-21", 2000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("\n\n");

        Gerente gerente = new Gerente();
        gerente.setNome("Primeiro Gerente");
        gerente.setDocumento("456.123.078-99");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.setValorRemuneracao(1000d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }
}
