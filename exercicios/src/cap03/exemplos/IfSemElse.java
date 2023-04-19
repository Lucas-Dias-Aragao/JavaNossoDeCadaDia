package cap03.exemplos;

import javax.swing.*;

public class IfSemElse {
    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};

        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");

        if(resp == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou cancel");
        }

        if(resp == "Masculino"){
            JOptionPane.showMessageDialog(null, "Você é homem.");
        }

        if(resp == "Feminino") {
            JOptionPane.showMessageDialog(null, "Você é mulher.");
        }
        System.exit(0);
    }
}
