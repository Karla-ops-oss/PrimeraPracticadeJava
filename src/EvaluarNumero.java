import java.util.Scanner;

public class EvaluarNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Evaluador de Números (Positivo, Negativo o Neutro) ---");

        // 1. Solicitar el número entero
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = teclado.nextInt(); // Usamos int porque el ejercicio pide un número entero

        System.out.println("\n-------------------------------------------");

        // 2. Evaluar las tres posibilidades
        if (numero > 0) {
            // Si es mayor que cero, es positivo
            System.out.println("El número " + numero + " es: POSITIVO");
        }
        else if (numero < 0) {
            // Si no fue mayor que cero, pero es menor que cero, es negativo
            System.out.println("El número " + numero + " es: NEGATIVO");
        }
        else {
            // Si no es mayor ni menor que cero, por descarte tiene que ser cero
            System.out.println("El número ingresado es: NEUTRO (CERO)");
        }

        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
