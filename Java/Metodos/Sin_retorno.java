package Metodos;

public class Sin_retorno {
    
    public static void suma() {
        int a = 5;
        int b = 3;
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    // Método para realizar la resta
    public static void resta() {
        int a = 8;
        int b = 2;
        int resultado = a - b;
        System.out.println("La resta es: " + resultado);
    }

    public static void main(String[] args) {
        // Llamamos a los métodos para hacer la suma y la resta
        suma();
        resta();
    }
}
