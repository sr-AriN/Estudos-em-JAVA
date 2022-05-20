package TratamentoDeExcecoes;

import javax.swing.JOptionPane;

//Fazer a divisão de 2 números inteiros
public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        boolean continueLooping = true;
        do {
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Imposssivel dividir um número por 0, tente outro denominador " + e.getMessage());
                // e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }

        } while (continueLooping);

        System.out.println("O código continua... ");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
