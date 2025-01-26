package Metodos;
import java.util.Scanner;
public class Par_immpar {
   // Método para verificar si un número es par o impar
   public static String verificarParImpar(int numero) {
    if (numero % 2 == 0) {
        return "El número " + numero + " es par.";
    } else {
        return "El número " + numero + " es impar.";
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar un número al usuario
    System.out.print("Introduce un número: ");
    int numero = scanner.nextInt();

    // Llamar al método 'verificarParImpar' y mostrar el resultado
    String resultado = verificarParImpar(numero);
    System.out.println(resultado);

    scanner.close();
} 
}
