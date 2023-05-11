package br.com.alura.java.io.teste;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCsv {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("contas.csv"));

        while (scan.hasNextLine()) {
            String linha = scan.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoDaConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt","BR"), "%s - %04d-%08d, %s: - %.2f %n",
                                    tipoDaConta, agencia, numero, titular, saldo);


//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
            linhaScanner.close();
        }

        scan.close();
    }
}
