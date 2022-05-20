package OrientacaoObjetos.EstruturaBasica;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("BMW");
        carro.setCapacidadeDoTanque(45);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeDoTanque());
        System.out.println(carro.totalParaCompletarOTanque(6.59));

        Carro carro1 = new Carro();

        carro.setCor("Cinza");
        carro.setModelo("Mercedes");
        carro.setCapacidadeDoTanque(66);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.totalParaCompletarOTanque(4.66));
    }

}
