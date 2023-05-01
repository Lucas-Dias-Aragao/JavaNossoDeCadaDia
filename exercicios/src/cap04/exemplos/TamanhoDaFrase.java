package cap04.exemplos;

import javax.swing.*;

public class TamanhoDaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase");
        int tamanho =  frase.length();
        JOptionPane.showMessageDialog(null,"Frase: " + frase
                + "\nQuantidade de caracteres: " + tamanho);
        System.exit(0);
    }
}
