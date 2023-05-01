package cap04.exercicios;

import javax.swing.*;

//A senha é gerada com tamanho de acordo com o número aleatório gerado
public class Ex03SenhaAleatoria {
    public static void main(String[] args) {
        int numeroSorteado = (int) (5 + (Math.random() * (10 - 5))); //gera números de 5 a 10
        StringBuilder senha = new StringBuilder();

        for(int i = 1; i <= numeroSorteado; i++) {
            senha.append(Math.round(Math.random() * 9));
        }
        JOptionPane.showMessageDialog(null,"Número sorteado: " + numeroSorteado
                + "\nSenha: " + senha);

        System.exit(0);
    }
}
