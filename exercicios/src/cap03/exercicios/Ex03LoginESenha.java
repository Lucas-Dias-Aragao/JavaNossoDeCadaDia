package cap03.exercicios;

import javax.swing.*;

public class Ex03LoginESenha {
    public static void executa() throws Exception{
        int tentativas = 3;

        for(int i = 1; i <= tentativas; i++) {
            String login = JOptionPane.showInputDialog(null, "Forneça um login: ");
            String senha = JOptionPane.showInputDialog(null,"Forneça a senha: ");

            if(login.equals("java8") & senha.equals("java8")) {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\n" +
                        "Você tem mais " + (tentativas - i) + " tentativa(s)");
                if((tentativas - i) == 0) {
                    throw new Exception("Acesso negado");
                }
            }
        }

        System.exit(0);
    }

    public static void main(String[] args) throws Exception {
        executa();
    }


}
