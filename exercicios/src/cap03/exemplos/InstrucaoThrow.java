package cap03.exemplos;

import javax.swing.*;
import java.io.IOException;

public class InstrucaoThrow {
    public static void main(String[] args) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
            if(idade < 18) {
                throw new Exception("Menor de idade, sai fora daqui");
            } else {
                JOptionPane.showMessageDialog(null,"Ta jóia, pode entrar");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
