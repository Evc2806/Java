package Condicionales;

import java.util.Scanner;

public class Antecedentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de cédula al usuario
        System.out.print("Introduce tu número de cédula: ");
        String cedula = scanner.nextLine();

        // Verificar si la cédula tiene antecedentes
        if (cedula.equals("1234")) {
            System.out.println("La persona con cédula " + cedula + " tiene antecedentes.");
        } else {
            System.out.println("La persona con cédula " + cedula + " no tiene antecedentes.");
        }

        scanner.close();
    }
}
