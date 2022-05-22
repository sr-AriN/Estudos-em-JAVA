package OrientacaoObjetos.OutroExemplo;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", valorSalario='" + getValorSalario() + "'" +
                ", endereco='" + getEndereco().getRua() + "'" +
                "}";
    }
}
