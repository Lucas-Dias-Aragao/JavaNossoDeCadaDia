package cap05.exemplos;

import javax.swing.*;

public class ArrayPesquisaCor {
    public static void main(String[] args) {
        String[] cores = {"azul", "vermelho", "amarelo", "preto", "branco"};
        String mensagem = "Cor não encontrada";
        String cor = JOptionPane.showInputDialog(null,"Forneça uma cor");

        for(String elemento : cores) {
            if(elemento.equals(cor)) {
                mensagem = "Cor encontrada";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}
