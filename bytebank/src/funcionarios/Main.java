package funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario nico = new Designer();
        nico.setNome("Nico Steppat");
        nico.setCpf("11122233345");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println("Bonificação do Designer: " + nico.getBonificacao());

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("12312312345");
        g1.setSalario(5000.00);

        System.out.println(g1.getBonificacao());
        System.out.println(g1.getNome());
        g1.setSenha(2222);


        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.registra(g1);
        controle.registra(nico);
        System.out.println("Total bonificação: "+ controle.getSoma());

        //testando metodo autentica
        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);

    }
}