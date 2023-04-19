package cap03.exemplos;

import javax.swing.*;

public class TryCatch {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog(null,"Forneça o valor do 1º numero: ");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog(null,"Forneça o valor do 2º numero: ");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException | NumberFormatException erro ) {
            JOptionPane.showMessageDialog(null, "Erro!\n" +
                    erro.toString(), "Erro ", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Tecla cancel pressionada.\n" + erro,
                    "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execução!");
        }

        System.exit(0);
    }
}
