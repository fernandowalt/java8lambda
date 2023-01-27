package org.wgomez.java.lambda;

import org.wgomez.java.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {


        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(20);
        System.out.println(resultado);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("hgh"));

        BiPredicate<String, String> test3 = String::equals;
        boolean result = test3.test("Hola", "Hola");
        System.out.println(result);

        BiPredicate<Integer, Integer> test4 = (a, b) -> a > b;
        boolean resultado4 = test4.test(5, 4);
        System.out.println(resultado4);

        Usuario a = new Usuario();
        a.setNombre("walter");
        Usuario b = new Usuario();
        b.setNombre("walterk");

        BiPredicate<Usuario, Usuario> test5 = (u1, u2) -> u1.getNombre().equals(u2.getNombre());
        boolean resultado5 = test5.test(a, b);
        System.out.println(resultado5);




    }
}
