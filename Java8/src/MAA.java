import java.util.Scanner;

public class MAA {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a,b,c;
        System.out.println("informe a");
        a = num.nextInt();
        System.out.println("informe b");
        b = num.nextInt();
        System.out.println("informe c");
        c = num.nextInt();

        if((a == b) && (a == c)){
            System.out.println("Empate");
        }
        if((a != b) && (b == c)){
            System.out.println("Ana venceu");
        }
        if((b != a) && (a == c)){
            System.out.println("Bruno venceu");
        }
        if((c != b) && (a == b)){
            System.out.println("Carlos venceu");
        }


//        SE (a = b) E (a = c) então
//        Escreva("*")
//        Fim_se
//
//
//        Se (a <> b) E (b = c) então
//        Escreva("A")
//        Fim_se
//
//        Se (b <> a) E (a = c) então
//        Escreva("B")
//        Fim_se
//
//        Se (c <> a) E (a = b) então
//        Escreva("C")
//        Fim_se

    }
}
