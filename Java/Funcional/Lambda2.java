package Funcional;

import java.util.function.BiFunction;

public class Lambda2 {
     public static void main(String[] args) {
        // Usamos una lambda para representar la función de suma(interfaz funcional)
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;

        // Llamada a la función usando los parámetros directamente
        int resultado = suma.apply(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
