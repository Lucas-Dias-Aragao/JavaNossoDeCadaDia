package cap03.exercicios;

import javax.swing.*;

public class Ex05Menu {
    public static void main(String[] args) throws Exception {
        Object[] op = {"Exercício 1", "Exercício 2", "Exercício 3", "Exercício 4"};

        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o exercício desejado:\n", "Menu", JOptionPane.PLAIN_MESSAGE,
                null, op, "Exercício 1");

            if(resp == "Exercício 1") {
                Ex01CalculoDesconto.executa();
            } else if (resp == "Exercício 2") {
               Ex02Resistencia.executa();
            } else if (resp == "Exercício 3") {
                Ex03LoginESenha.executa();
            } else if (resp == "Exercício 4") {
                Ex04Tabuada.executa();
            }

        System.exit(0);
    }
}
