package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Imprimindo caracteres com PrintStream");
        ps.println();
        ps.println("Mais uma linha com PrintStream");

        ps.close();
    }
}