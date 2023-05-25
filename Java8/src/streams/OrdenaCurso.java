package streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Curso: " + this.getNome() + " - Alunos: " + this.getAlunos();
    }
}

public class OrdenaCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        System.out.println(cursos);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny() //devolve qualquer curso que corresponda ao filtro
                .ifPresent(System.out::println);

        List<Curso> collect = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("------------------------");

        OptionalDouble sum = cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        System.out.println(sum);

    }
}
