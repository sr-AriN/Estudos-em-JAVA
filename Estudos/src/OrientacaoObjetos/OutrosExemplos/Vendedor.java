package OrientacaoObjetos.OutrosExemplos;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao / 100d);

    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", valorSalario='" + getValorSalario() + "'" +
                ", endereco='" + getEndereco().getRua() + "'" +
                ", valorBonificacao='" + valorDaBonificacao +
                "}";
    }

}
