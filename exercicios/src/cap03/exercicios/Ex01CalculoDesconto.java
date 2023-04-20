package cap03.exercicios;

import javax.swing.*;

public class Ex01CalculoDesconto {
        public static void executa() throws Exception{
            String nomeDoProduto = JOptionPane.showInputDialog(null,"Nome do produto");
            float valorOriginal = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor do produto"));
            float desconto, novoValor, percentualDesconto = 0;

            try {
                if(valorOriginal >= 50 && valorOriginal < 200) {
                    percentualDesconto = 0.05F;
                } else if(valorOriginal >= 200 && valorOriginal < 500) {
                    percentualDesconto = 0.06F;
                } else if(valorOriginal >= 500 && valorOriginal < 1000) {
                    percentualDesconto = 0.07F;
                } else if(valorOriginal >= 1000) {
                    percentualDesconto = 0.08F;
                } else if (valorOriginal < 0) {
                    throw new Exception("O valor deve ser maior que zero");
                }
                desconto = valorOriginal * percentualDesconto;
                novoValor = valorOriginal - desconto;
                JOptionPane.showMessageDialog(null,"Nome do produto: " + nomeDoProduto +"\n" +
                        "Valor: R$ " + valorOriginal + "\n" + "Desconto: R$ " + desconto + "\n" + "Total: R$ " + novoValor);

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
            }
            System.exit(0);
        }

    public static void main(String[] args) throws Exception {
        executa();
    }
}
