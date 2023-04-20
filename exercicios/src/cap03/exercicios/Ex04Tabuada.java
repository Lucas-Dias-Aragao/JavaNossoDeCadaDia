package cap03.exercicios;

import javax.swing.*;

public class Ex04Tabuada {
    public static void executa() {
        StringBuilder tabuada = new StringBuilder();
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número desejado"));

        for(int i = 0; i <= 10; i++) {
            tabuada.append(numero).append(" X ").append(i).append(" = ").append(numero * i + "\n");
        }
        JOptionPane.showMessageDialog(null,tabuada);
    }

    public static void main(String[] args) {
        executa();
    }
}
