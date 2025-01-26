package Metodos;

public class Retorno {
    // Método para realizar la suma con argumentos y retorno
    public static int suma(int a, int b) {
        int resultado = a + b;
        return resultado; // Retorna el resultado de la suma
    }

    // Método para realizar la resta con argumentos y retorno
    public static int resta(int a, int b) {
        int resultado = a - b;
        return resultado; // Retorna el resultado de la resta
    }

    public static void main(String[] args) {
        //Llamamos a los métodos pasando argumentos y almacenamos el retorno
        int resultadoSuma = suma(5, 3);  // Suma 5 y 3
        int resultadoResta = resta(8, 2); // Resta 8 y 2

        // Imprimimos los resultados
        System.out.println("La suma es: " + resultadoSuma);
        System.out.println("La resta es: " + resultadoResta);
      
//suma(4,5);
//resta(6,8);

    }
}
