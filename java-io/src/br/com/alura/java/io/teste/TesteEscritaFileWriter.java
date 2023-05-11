package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        long ini = System.currentTimeMillis();

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Escrevendo com FileWriter");
        bw.newLine();
        bw.write("Escrevendo outra linha");

        bw.close();

        System.out.println("Passaram " + ini + " milissegundos");
    }
}