package contaecliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        System.out.println("Depositando na CP...");
        super.saldo += valor;
    }
}
