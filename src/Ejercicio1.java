import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos que ingrese el usuario
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Calculadora de Área de un Rectángulo ---");

        // 1. Solicitar y leer la base
        System.out.print("Por favor, ingresa la base del rectángulo: ");
        double base = teclado.nextDouble();

        // 2. Solicitar y leer la altura
        System.out.print("Ahora, ingresa la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        // 3. Calcular el área
        double area = base * altura;

        // 4. Mostrar el resultado
        System.out.println("\n-------------------------------------------");
        System.out.println("Con una base de " + base + " y una altura de " + altura + ",");
        System.out.println("el área total del rectángulo es: " + area);
        System.out.println("-------------------------------------------");

        // Cerramos el scanner por buena práctica
        teclado.close();
    }
}
