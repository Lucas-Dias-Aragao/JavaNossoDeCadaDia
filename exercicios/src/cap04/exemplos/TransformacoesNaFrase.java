package cap04.exemplos;

import javax.swing.*;
import java.util.Scanner;

public class TransformacoesNaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase:");
        JOptionPane.showMessageDialog(null, "Frase original: " + frase
                + "\nTodas em maiúsculas: " + frase.toUpperCase()
                + "\nTodas em minúsculas: " + frase.toLowerCase());
        System.exit(0);
    }
}
