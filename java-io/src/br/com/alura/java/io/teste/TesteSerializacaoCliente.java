package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Astolfo");
        cliente.setProfissao("Dev");
        cliente.setCpf("25225225288");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome() + ", " + cliente.getProfissao());
    }
}
