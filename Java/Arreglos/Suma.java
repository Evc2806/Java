package Arreglos;

public class Suma {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        // Calcular la suma de los elementos del arreglo
        for (int i = 0; i<numeros.length; i++) {
            suma += numeros[i]; // Sumar cada elemento
        }

        // Mostrar el resultado
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }  
}
