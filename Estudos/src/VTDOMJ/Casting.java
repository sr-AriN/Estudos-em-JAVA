package VTDOMJ;

public class Casting {
    public static void main(String[] args) {
        // Explicito short -> byte
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        // Implicito int -> long
        long l1;
        int i1 = 10;
        l1 = i1;
        // Explicito long -> int
        // Perda de informação
        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;
        // Explicito long -> int
        int i3;
        long l3 = 10000L;
        i3 = (int) l3;
        // Implicito float -> double
        double d1;
        float f1 = 10.5f;
        d1 = f1;
        // Explicito double -> float
        float f2;
        double d2 = 10000.58d;
        f2 = (float) d2;
        // Explicito double -> float
        // Perda de informação
        float f3;
        double d3 = 10000.58888888888888888888888888888888888888888888;
        f3 = (float) d3;
        // Explicito float -> int
        // Perda de informação
        int i4;
        float f4 = 11.5327f;
        i4 = (int) f4;
        // Explicito double -> byte
        // Perda de informação
        b1 = (byte) d3;

        System.out.println("b1: " + b1);
        System.out.println("b1: " + l1);
        System.out.println("b1: " + i2);
        System.out.println("b1: " + i3);
        System.out.println("b1: " + d1);
        System.out.println("b1: " + f2);
        System.out.println("b1: " + f3);
        System.out.println("b1: " + i4);
    }

}
