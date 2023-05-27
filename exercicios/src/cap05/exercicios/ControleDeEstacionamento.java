package cap05.exercicios;

import javax.swing.*;

public class ControleDeEstacionamento {
    public static void main(String[] args) throws Exception {
        Estacionamento estacionamento = new Estacionamento();
        String[] opcoes = {"1 - Entrada", "2 - Saída", "3 - Listar", "4 - Sair"};
        boolean continua = true;

        do{
            String resp = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:\n ",
                    "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes,"1 - Entrada");

            if(resp.equals("1 - Entrada")){
                String placa = JOptionPane.showInputDialog(null,"Informe a placa");
                int vaga = Integer.parseInt(JOptionPane.showInputDialog(null,"informe a vaga"));
                estacionamento.Entrada(placa,vaga);
            }

            else if(resp.equals("2 - Saída")){
                int vaga = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a vaga"));
                estacionamento.Saida(vaga);
            }

            else if(resp.equals("3 - Listar")){
                JOptionPane.showMessageDialog(null,estacionamento.listar());
            }

            else if(resp.equals("4 - Sair")){
                continua = false;
            }
        } while(continua);

        System.exit(0);
    }
}


