package cap03.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex02Resistencia {
    public static void executa() throws Exception {
        ArrayList<Integer> resistores = new ArrayList();
        try {
        int r1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do primeiro resistor"));
        resistores.add(r1);
        int r2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do segundo resistor"));
        resistores.add(r2);
        int r3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do terceiro resistor"));
        resistores.add(r3);
        int r4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do quarto resistor"));
        resistores.add(r4);

        if(r1 < 0 || r2 < 0 || r3 < 0 || r4 < 0)
            throw new Exception("O valor deve ser maior que zero");

        int soma = 0;
        Iterator<Integer> iterator = resistores.iterator();
        while(iterator.hasNext()) {
            int next = iterator.next();
            soma += next;
        }

        JOptionPane.showMessageDialog(null, "Resistencias fornecidas: \n" +
                r1 + ", " + r2 + ", " + r3 + ", " + r4 + "\nMaior resistencia: " + Collections.max(resistores) +
                "\nMenor resistencia: " + Collections.min(resistores));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }

        public static void main(String[] args) throws Exception {
            executa();
        }
}
