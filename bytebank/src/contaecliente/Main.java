package contaecliente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(111, 112);
        //cp.deposita(200);

        cc.transfere(10.0,cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        //testando tributaveis
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        calculador.registra(cc);
        System.out.println("Imposto CC: " + cc.getValorImposto());

    }
}