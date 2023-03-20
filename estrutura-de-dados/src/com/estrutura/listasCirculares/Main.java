package com.estrutura.listasCirculares;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");

        minhaListaCircular.remove(3);
        System.out.println(minhaListaCircular);

//        System.out.println(minhaListaCircular.get(0));
//        System.out.println(minhaListaCircular.get(1));
//        System.out.println(minhaListaCircular.get(2));

        for(int i = 0; i < 10; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
