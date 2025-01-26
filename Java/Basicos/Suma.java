package Basicos;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular y mostrar la suma
        int suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);
        
        scanner.close();
    }


}
    

