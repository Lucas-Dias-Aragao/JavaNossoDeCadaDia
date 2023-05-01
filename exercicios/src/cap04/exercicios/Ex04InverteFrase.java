package cap04.exercicios;

import javax.swing.*;

//Inverte a frase e retira os espaços em branco
public class Ex04InverteFrase {
    public static void main(String[] args) {
        String fraseInvertida = "";
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase: ");
        String fraseSemEspaco = frase.replace(" ", "");

        for(int i = fraseSemEspaco.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseSemEspaco.charAt(i);
        }
        JOptionPane.showMessageDialog(null,"Frase fornecida: " + frase
                + "\nFrase invertida s/ espaços: " + fraseInvertida);

        System.exit(0);
    }
}
