import java.util.Scanner;
import java.util.Random;

public class proyecto {

    // Variables globales
    static double[] distancias = {91.7, 41.4, 78.3, 628.7, 1275.0, 2870.0}; // Distancias a planetas en millones de km
    static String[] planetas = {"Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano"};
    static double combustibleDisponible = 1000; // En litros
    static double oxigenoDisponible = 1000; // En horas
    static double velocidadNave = 50000; // En km/h

    // Función para mostrar los planetas y seleccionar destino
    public static int seleccionarDestino() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el destino interplanetario:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + ". " + planetas[i]);
        }
        System.out.print("Ingrese el número del planeta: ");
        int destino = scanner.nextInt();
        return destino - 1; // Restamos 1 para coincidir con el índice del array
    }

    // Función para calcular la distancia y el tiempo de viaje
    public static void calcularTiempoDeViaje(int destino) {
        double distancia = distancias[destino] * 1_000_000; // Convertir a kilómetros
        double tiempoEstimado = distancia / velocidadNave; // Tiempo en horas
        System.out.println("El tiempo estimado de viaje a " + planetas[destino] + " es: " + tiempoEstimado + " horas.");
    }

    // Función para gestionar los recursos de la nave
    public static boolean gestionarRecursos(double tiempoRestante) {
        double combustibleNecesario = tiempoRestante * 0.5; // Por cada hora se consume 0.5L de combustible
        double oxigenoNecesario = tiempoRestante * 0.3; // Por cada hora se consume 0.3 horas de oxígeno

        if (combustibleDisponible < combustibleNecesario || oxigenoDisponible < oxigenoNecesario) {
            System.out.println("¡No hay suficientes recursos para continuar el viaje!");
            return false; // Si no hay recursos suficientes, retornamos false
        }

        // Reducir recursos
        combustibleDisponible -= combustibleNecesario;
        oxigenoDisponible -= oxigenoNecesario;

        return true; // Si los recursos son suficientes, retornamos true
    }

    // Función para simular eventos aleatorios durante el viaje
    public static void simularEventosAleatorios() {
        Random random = new Random();
        int evento = random.nextInt(100);

        if (evento < 10) {
            System.out.println("¡Un fallo en el sistema de navegación ha ocurrido! El viaje se retrasa.");
        } else if (evento < 20) {
            System.out.println("¡Un asteroide se aproxima! La nave tiene que desviar su curso.");
        } else if (evento < 30) {
            System.out.println("¡Desvío inesperado! Tienes que recalcular la ruta.");
        }
    }

    // Función para mostrar el progreso del viaje
    public static void mostrarProgreso(double tiempoRestante, double tiempoEstimado) {
        double progreso = (1 - (tiempoRestante / tiempoEstimado)) * 100;
        System.out.println("Progreso: " + (int) progreso + "%");
        System.out.println("Combustible restante: " + combustibleDisponible + "L");
        System.out.println("Oxígeno restante: " + oxigenoDisponible + " horas");
    }

    // Función principal del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al simulador de viaje interplanetario.");
        int destino = seleccionarDestino();
        calcularTiempoDeViaje(destino);

        double distancia = distancias[destino] * 1_000_000; // Convertir a km
        double tiempoEstimado = distancia / velocidadNave; // En horas
        double tiempoRestante = tiempoEstimado;

        while (tiempoRestante > 0) {
            // Mostrar el progreso del viaje
            System.out.println("Restan " + tiempoRestante + " horas de viaje.");
            mostrarProgreso(tiempoRestante, tiempoEstimado);

            // Simulamos los eventos aleatorios
            simularEventosAleatorios();

            // Gestionamos los recursos (suponiendo que cada ciclo es de 1 hora)
            if (!gestionarRecursos(1)) { // 1 hora de viaje
                break; // Si los recursos no son suficientes, el viaje termina
            }

            // Reducir el tiempo de viaje
            tiempoRestante -= 1;

            // Pausa para simular el paso del tiempo (500 ms)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verificar si el viaje fue completado o interrumpido
        if (tiempoRestante <= 0) {
            System.out.println("¡Felicidades, has llegado a " + planetas[destino] + "!");
        } else {
            System.out.println("El viaje ha sido interrumpido debido a falta de recursos.");
        }
    }
}

