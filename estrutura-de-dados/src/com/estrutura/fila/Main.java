package com.estrutura.fila;

public class Main {

    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue()); //saída esperada: chamar o primeiro da fila retirando-o da mesma
        System.out.println(minhaFila); //Saída esperada: Fila sem o "primeiro"

        minhaFila.enqueue("ultimo"); //Adiciona ultimo elemento na fila
        System.out.println(minhaFila);

        System.out.println(minhaFila.first()); //saída esperada: "segundo"
        System.out.println(minhaFila);


    }
}
