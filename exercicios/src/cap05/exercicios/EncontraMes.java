package cap05.exercicios;

public class EncontraMes {
    public static void main(String[] args) {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto","setembro","outubro","novembro","dezembro"};
        int num = (int) (Math.random() * 12);

        String s = "Mes não encontrado";

        for (int i = 0; i < meses.length; i++){
            s = meses[num];
        }

        System.out.println("O mês sorteado é: " + s);
        System.exit(0);
    }
}
