package cap05.exercicios;

import javax.swing.*;

public class Estacionamento {
    String[] vagas = new String[10];

    public Estacionamento() {

    }

    public void Entrada(String placa, int vaga) throws Exception {
        vagas[vaga] = placa;
    }

    public void Saida(int vaga) {
        vagas[vaga] = null;
    }

    public String listar() {
        String retorno = "";
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null) {
                 retorno += "Vaga: "+ (i+1) +" ocupada - PLACA: "+ vagas[i] +"\n";
            } else {
                retorno += "Vaga: "+ (i+1) + " livre\n";
            }
        }
        return retorno;
    }

}
