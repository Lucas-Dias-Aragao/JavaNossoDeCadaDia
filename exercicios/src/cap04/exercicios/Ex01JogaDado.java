package cap04.exercicios;

import javax.swing.*;

public class Ex01JogaDado {
    public static void main(String[] args) {

        int numJogadas = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de jogadas: "));
        int i = 0, soma = 0;
        int resultadoDaJogada;
        String str = "";

        while (i < numJogadas) {
            resultadoDaJogada = (int) (Math.random() * 6) + 1;
            soma += resultadoDaJogada;
            str += "\n" + resultadoDaJogada;
            i++;
        }
        str += "\nTotal = " + soma;
        JOptionPane.showMessageDialog(null,"Números sorteados" + str);
    }
}
