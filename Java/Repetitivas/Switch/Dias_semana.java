package Repetitivas.Switch;

import java.util.Scanner;

public class Dias_semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número del 1 al 7
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        // Usamos 'switch' para determinar el día de la semana
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número fuera de rango. Debe ser un número entre 1 y 7.");
        }

        scanner.close();
    }
}
