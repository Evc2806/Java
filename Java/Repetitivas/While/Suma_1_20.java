package Repetitivas.While;

public class Suma_1_20 {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        // Usamos un ciclo 'while' para sumar los números del 1 al 20
        while (i <= 20) {
            suma += i; // Sumamos el valor de 'i' a la variable 'suma'
            i++; // Incrementamos 'i' en cada iteración
        }

        System.out.println("La suma de los números del 1 al 20 es: " + suma);
    }  
}
