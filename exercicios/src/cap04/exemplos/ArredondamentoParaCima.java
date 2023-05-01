package cap04.exemplos;

import javax.swing.*;

public class ArredondamentoParaCima {
    public static void main(String[] args) {
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de " +
                "passageiros"));
        float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null,"Número de passageiros: " + numeroPassageiros + " \n" +
                "Quantidade calculada: " + qtdeOnibus + "\nQuantidade de onibus necessária: " + (int) Math.ceil(qtdeOnibus));

        System.exit(0);
    }

}
