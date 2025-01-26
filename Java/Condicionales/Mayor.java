package Condicionales;

import java.util.Scanner;

public class Mayor {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Determinar cuál número es mayor
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor.");
        } else if (num1 < num2) {
            System.out.println("El segundo número (" + num2 + ") es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }  
}
