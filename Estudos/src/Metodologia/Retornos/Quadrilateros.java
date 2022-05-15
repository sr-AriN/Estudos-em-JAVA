package Metodologia.Retornos;

public class Quadrilateros {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return (baseMaior + baseMenor) * altura / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2) / 2;
    }

    // Válido mas não util
    public static void xpto() {
        System.out.println("Antes");
        return;
    }

}
