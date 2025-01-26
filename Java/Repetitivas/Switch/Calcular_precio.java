package Repetitivas.Switch;

import java.util.Scanner;

public class Calcular_precio {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la categoría del artículo
        System.out.print("Introduce la categoría del artículo (1: Ropa, 2: Electrónica, 3: Alimentación, 4: Muebles): ");
        int categoria = scanner.nextInt();
        int precio;

        // Usamos 'switch' para determinar el precio según la categoría
        switch (categoria) {
            case 1:
                precio = 100;
                System.out.println("El precio de la Ropa es: " + precio + " pesos.");
                break;
            case 2:
                precio = 500;
                System.out.println("El precio de la Electrónica es: " + precio + " pesos.");
                break;
            case 3:
                precio = 50;
                System.out.println("El precio de la Alimentación es: " + precio + " pesos.");
                break;
            case 4:
                precio = 300;
                System.out.println("El precio de los Muebles es: " + precio + " pesos.");
                break;
            default:
                System.out.println("Categoría no válida. Debe ser un número entre 1 y 4.");
        }

        scanner.close();
    }
}
