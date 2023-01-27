package org.wgomez.java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<String, String> funcion1 = param -> "Hola que tal " + param;
        String resultado = funcion1.apply("Walter");
        System.out.println(resultado);

        Function<String, String> funcion2 = String::toUpperCase;
        String mayusculas = funcion2.apply("fernando");
        System.out.println(mayusculas);

        BiFunction<String, String, String> funcion3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String concatenacion = funcion3.apply("walter ", "gomez");
        System.out.println(concatenacion);

        BiFunction<String, String, Integer> funcion4 = String::compareTo;
        Integer comparacion = funcion4.apply("fernando", "gomez");
        System.out.println(comparacion);

        BiFunction<String, String, String> funcion5 = String::concat;
        String numeroDeCaracteres = funcion5.apply("fernando", "gomez");
        System.out.println(numeroDeCaracteres);




    }
}
