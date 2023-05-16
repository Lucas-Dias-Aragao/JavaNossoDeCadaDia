package cap05.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class OrdenaNotas {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            notas.add(Double.parseDouble(JOptionPane.showInputDialog("Forneça a " + (i+1) + "ª nota")));
        }

        notas.sort(Comparator.reverseOrder());
        System.out.println("Notas em ordem decrescente: ");

        double soma = 0;
        String r = "";
        for(Double num : notas) {
            soma += num;
            r += num + ", ";
        }
        JOptionPane.showMessageDialog(null,"Notas: \n" + r
                + "\nMédia final: " + soma/notas.size());
    }
}
