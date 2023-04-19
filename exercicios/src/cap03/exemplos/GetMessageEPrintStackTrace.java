package cap03.exemplos;

import javax.swing.*;

public class GetMessageEPrintStackTrace {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        try {
            int y = x / 0; //gera exceção
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage());
            erro.printStackTrace();
        }
    }
}
