package cap03.exemplos;

import javax.swing.*;

public class IfComElse {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Forneça o número do mês");
        if(aux != null) {
            try{
                int mes = Integer.parseInt(aux);
                if(mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null,"Mês válido!\n " + mes);
                } else {
                    JOptionPane.showMessageDialog(null,"Mês inválido!\n " + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,"Digite apenas valores numéricos " + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }

        System.exit(0);
    }
}
