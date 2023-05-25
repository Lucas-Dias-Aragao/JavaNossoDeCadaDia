package datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY,25);

        Period periodo = Period.between(dataAtual,dataFutura);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String periodoFormatado = formatador.format(dataAtual);
        System.out.println(periodoFormatado);
    }
}
