package OrientacaoObjetos.EstruturaBasica;

//Classe
public class Carro {

    // Atributos
    private String cor;
    private String modelo;
    private int capacidadeDoTanque;

    // Contrutor

    public Carro() {
    }

    // Gets and Seters
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeDoTanque() {
        return this.capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    // Método
    double totalParaCompletarOTanque(double valorDoCombustivel) {
        return capacidadeDoTanque + valorDoCombustivel;
    }
}