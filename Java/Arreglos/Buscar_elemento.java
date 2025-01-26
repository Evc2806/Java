package Arreglos;

import java.util.Scanner;

public class Buscar_elemento {
     public static void main(String[] args) {
        // Declarar e inicializar un arreglo
        int[] numeros = {5, 8, 12, 20, 30};
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número a buscar
        System.out.print("Introduce un número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        boolean encontrado = false;

        // Buscar el número en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                encontrado = true;
                break; // Si lo encuentra, termina la búsqueda
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " fue encontrado.");
        } else {
            System.out.println("El número " + numeroABuscar + " no está en el arreglo.");
        }

        scanner.close();
    }

}
