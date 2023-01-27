package org.wgomez.java.lambda;

import org.wgomez.java.lambda.models.Usuario;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));


        };
        consumidor.accept(new Date());
        BiConsumer<String, Integer> consumidorbi = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años");
        };
        consumidorbi.accept("walter", 32);
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo");

        List<String> nombre = Arrays.asList("Walter", "edwin", "darwin");
        nombre.forEach(System.out::println);

        Usuario user1 = new Usuario();
        BiConsumer<Usuario, String> asignacion = Usuario::setNombre;

        asignacion.accept(user1, "andres");
        System.out.println(user1.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo";

        System.out.println(proveedor.get());


    }
}
