package VTDOM;

public class Tipo {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; -> limite negativo ultrapassado

        // int i1 = -100000000000; -> limite negativo ultrapassado
        int i2 = 28500;

        long l1 = 1000000000000000000L; // max
        long l2 = 2004000000050005000L; // max

        // float f1 = 4.5; -> Ta passando um double
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04;

        char c1 = 'W';
        char c3 = '\u0057';
        // char c2 = 'Tw'; -> mais de um caractere

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "ag dgb se sakdasldiqanda";

        String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);
    }

}
