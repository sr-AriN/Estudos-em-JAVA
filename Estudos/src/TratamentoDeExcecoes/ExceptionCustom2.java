package TratamentoDeExcecoes;

import javax.swing.JOptionPane;

public class ExceptionCustom2 {
    public static void main(String[] args) {
        int[] numerador = { 2, 4, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {
    private int numerado;
    private int denominado;

    public DivisaoNaoExataException(String message, int numerado, int denominado) {
        super(message);
        this.numerado = numerado;
        this.denominado = denominado;
    }

    public int getNumerado() {
        return this.numerado;
    }

    public void setNumerado(int numerado) {
        this.numerado = numerado;
    }

    public int getDenominado() {
        return this.denominado;
    }

    public void setDenominado(int denominado) {
        this.denominado = denominado;
    }

}
