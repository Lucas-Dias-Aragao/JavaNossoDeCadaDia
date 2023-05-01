package cap04.exemplos; //Operaçoes matematicas e de String

import javax.swing.*;

public class ArredondamentoParaBaixo {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota da prova: "));
        JOptionPane.showMessageDialog(null,"Nota original: " + nota +
                "\nNota arredondada para baixo: " + Math.floor(nota));

        System.exit(0);
    }
}
