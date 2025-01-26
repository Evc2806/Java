package Condicionales;

import java.util.Scanner;

public class Numero_correcto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es correcto
        if (numero == 4) {
            System.out.println("El número es correcto.");
        } else {
            System.out.println("El número es incorrecto.");
        }

        scanner.close();
    }
}
