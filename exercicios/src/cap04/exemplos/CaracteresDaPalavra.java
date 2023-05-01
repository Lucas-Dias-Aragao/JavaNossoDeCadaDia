package cap04.exemplos;

import javax.swing.*;

public class CaracteresDaPalavra {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog(null,"Forneça uma palavra com "
                + "pelo menos 8 caracteres:");

        String letras = "Palavra: " + palavra
                + "\nCaractere 1: " + palavra.charAt(0)
                + "\nCaractere 2: " + palavra.charAt(1)
                + "\nCaractere 3: " + palavra.charAt(2)
                + "\nCaractere 4: " + palavra.charAt(3);

        JOptionPane.showMessageDialog(null,letras);
        System.exit(0);
    }
}
