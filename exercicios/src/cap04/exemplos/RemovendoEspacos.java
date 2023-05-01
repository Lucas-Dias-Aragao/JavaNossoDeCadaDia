package cap04.exemplos;

import javax.swing.*;

public class RemovendoEspacos {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase: ");
        frase = "     " + frase + "     ";

        JOptionPane.showMessageDialog(null, "Com espaços: " + "- " + frase + " -"
                + "\nSem espaços: " + "- " + frase.trim() + " -");

        System.exit(0);
    }
}
