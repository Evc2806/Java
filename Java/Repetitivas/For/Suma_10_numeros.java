package Repetitivas.For;

public class Suma_10_numeros {
    public static void main(String[] args) {
        int suma = 0;

        // Usamos un ciclo 'for' para sumar los primeros 10 números
        for (int i = 1; i <= 10; i++) {
            suma += i; // Aumentamos la suma con el valor de 'i'
        }

        System.out.println("La suma de los primeros 10 números es: " + suma);
    }
}
