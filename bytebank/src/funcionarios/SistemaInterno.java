package funcionarios;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel a) {
        boolean autenticou = a.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode acessar o sistema!");
        } else {
            System.out.println("Não pode acessar o sistema!");
        }
    }
}
