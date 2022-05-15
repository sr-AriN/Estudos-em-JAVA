package Metodologia.Retornos;

public class Main {
    public static void main(String[] args) {
        // Quadrilateros
        double areaQuadrado = Quadrilateros.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);
        double areaRetangulo = Quadrilateros.area(5d, 5d);
        System.out.println("Área do retângulo: " + areaRetangulo);
        double areaTrapezio = Quadrilateros.area(7, 8, 9);
        System.out.println("Área do Trapézio: " + areaTrapezio);
        float areaLozangulo = Quadrilateros.area(5f, 5f);
        System.out.println("Área do Lozangulo: " + areaLozangulo);

    }
}
