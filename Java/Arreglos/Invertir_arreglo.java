package Arreglos;

public class Invertir_arreglo {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Invertir el arreglo
        int start = 0;
        int end = numeros.length - 1;
        while (start < end) {
            // Intercambiar los elementos
            int temp = numeros[start];
            numeros[start] = numeros[end];
            numeros[end] = temp;

            // Avanzar los índices
            start++;
            end--;
        }

        // Imprimir el arreglo invertido
        System.out.println("Arreglo invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
 
}
