package Funcional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.lang.System;
public class Lambdas_varias {
    public static void main(String[] args) {
        // Function: Toma un argumento y devuelve un valor
        Function<Integer, Integer> cuadrado = (x) -> x * x;
        System.out.println("Cuadrado: " + cuadrado.apply(4));  // Imprime 16

        
        // BiFunction: Toma dos argumentos y devuelve un valor
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
        System.out.println("Suma: " + suma.apply(4, 5));  // Imprime 9

     

        // Supplier: No toma argumentos, pero devuelve un valor
        Supplier<String> saludo = () -> "Hola, Mundo!";
        System.out.println("Saludo: " + saludo.get());  // Imprime "Hola, Mundo!"

        // Consumer: Toma un argumento y no devuelve nada
        Consumer<String> imprimir = (x) -> System.out.println(x);
        imprimir.accept("¡Hola!");  // Imprime "¡Hola!"
    }
}
