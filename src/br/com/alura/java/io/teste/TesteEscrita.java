package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Escrevendo com BufferedWriter");
        bw.newLine();
        bw.newLine();
        bw.write("Escrevendo outra linha");

        bw.close();
    }
}