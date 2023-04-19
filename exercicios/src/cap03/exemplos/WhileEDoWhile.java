package cap03.exemplos;

import javax.swing.*;

public class WhileEDoWhile {
    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite"));
        int contador = limite;

        try {
            while(contador > 0) {
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo\n");

            contador = 0;
            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim do contador progressivo");
        } catch (NumberFormatException erro) {
            System.out.println("Não foi fornecido um número limite válido" + erro.toString());
        }
    }
}
