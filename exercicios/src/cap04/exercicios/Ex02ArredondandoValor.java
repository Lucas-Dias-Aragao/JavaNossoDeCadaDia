package cap04.exercicios;

import javax.swing.*;

public class Ex02ArredondandoValor {
    public static void main(String[] args) {
        double valor = 0;

        do {
             valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe o valor do produto: "));
             if(valor != 0) {
                 double acrescimo = valor * 0.12;
                 JOptionPane.showMessageDialog(null,"Valor com acréscimo: R$ " + (valor + acrescimo)
                         + "\nValor arredondado: R$ " + Math.round(valor + acrescimo));
             }
        } while (valor != 0);

        System.exit(0);
    }
}
