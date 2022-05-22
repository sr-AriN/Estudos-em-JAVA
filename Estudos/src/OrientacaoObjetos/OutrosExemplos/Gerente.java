package OrientacaoObjetos.OutrosExemplos;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao / 100) + 100d);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", endereco='" + getEndereco().getRua() + "'" +
                ", horasTrabalhadas='" + getHorasTrabalhadas() + "'" +
                ", valorHora='" + getValorHora() + "'" +
                ", valorRemuneracao='" + getValorRemuneracao() + "'" +
                ", valorBonificacao='" + valorDaBonificacao +
                "}";
    }

}
