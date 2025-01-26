package Condicionales;

import java.util.Scanner;

public class Clasificar_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Clasificación según la edad
        if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un anciano.");
        }

        scanner.close();
}
}
