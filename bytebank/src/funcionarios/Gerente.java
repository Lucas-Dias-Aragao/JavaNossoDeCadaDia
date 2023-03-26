package funcionarios;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticavelUtil autenticador;
    public Gerente(){
        this.autenticador = new AutenticavelUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
