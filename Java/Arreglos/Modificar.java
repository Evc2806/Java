package Arreglos;

public class Modificar {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo de 5 enteros
        int[] numeros = {10, 20, 30, 40, 50};

    
        // Imprimir el arreglo antes de la modificación
        System.out.println("Arreglo antes de la modificación:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Modificar el valor en el índice 2 (el valor 30)
        numeros[2] = 100;

        // Imprimir el arreglo después de la modificación
        System.out.println("Arreglo después de la modificación:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    
}

