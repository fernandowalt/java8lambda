package org.wgomez.java.lambda;

import org.wgomez.java.lambda.aritmetica.Aritmetica;
import org.wgomez.java.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));

        System.out.println(cal.computar(10, 5, resta));

        System.out.println(cal.computar(9, 5, (a, b) -> a * b));

    }
}
