package Metodos;

import java.util.Scanner;

public class Sumas_numeros {
    public static int sumar(int num1, int num2) {
        return num1 + num2; // Retorna la suma de los dos números
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Llamar al método 'sumar' y guardar el resultado
        int resultado = sumar(num1, num2);

        // Imprimir el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);

        scanner.close();
    }
}
