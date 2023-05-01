package cap04.exemplos;

import javax.swing.*;

public class TrocandoOsCaracteres {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase: ");

        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\nTirando os espaços: " + frase.replace(" ","")
                + "\nSubstituindo a por u: " + frase.replace("a","u"));

        System.exit(0);
    }
}
