package cap05.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ParOuImpar {
    public static void main(String[] args) {
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10) +1;
            if(num % 2 == 0){
                par.add(num);
            } else {
                impar.add(num);
            }
        }

        System.out.print("PAR: ");
        par.forEach(n -> System.out.print(n + " "));
        System.out.print("\nIMPAR: ");
        impar.forEach(n -> System.out.print(n + " "));

    }
}
