package defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("zinedine");
        palavras.add("aula");
        palavras.add("eitalasqueiradoida");

        //Collections.sort(palavras,new ComparaPorTamanho());
        //palavras.sort((s1, s2) -> s1.length() - s2.length());

        //method references
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(palavras);

        //for antigo
//        for(String p : palavras){
//            System.out.println(p);
//        }

        //lambda
        //palavras.forEach(s-> System.out.println(s));
        palavras.forEach(System.out::println);
    }
}