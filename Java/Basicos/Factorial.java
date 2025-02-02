package Basicos;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Calcular el factorial
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        scanner.close();
    }
}
