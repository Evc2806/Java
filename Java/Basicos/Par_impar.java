package Basicos;
import java.util.Scanner;

public class Par_impar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Comprobar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        scanner.close();
    }
    
}
