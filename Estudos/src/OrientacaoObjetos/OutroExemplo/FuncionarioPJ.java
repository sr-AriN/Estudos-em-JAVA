package OrientacaoObjetos.OutroExemplo;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    protected Double valorHora;
    private Double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorHora = this.horasTrabalhadas * this.valorRemuneracao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return this.valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", endereco='" + getEndereco() + "'" +
                ", horasTrabalhadas='" + getHorasTrabalhadas() + "'" +
                ", valorHora='" + getValorHora() + "'" +
                ", valorRemuneracao='" + getValorRemuneracao() + "'" +
                "}";
    }

}
