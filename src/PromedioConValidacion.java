import java.util.Scanner;
import java.util.Locale;

public class PromedioConValidacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // Permite ingresar notas con punto decimal

        System.out.println("--- Evaluador de Promedios con Validación (Rango 0 a 10) ---");

        // 1. Solicitar y validar la Nota 1
        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10. Programa terminado.");
            teclado.close();
            return; // Termina la ejecución del programa inmediatamente
        }

        // 2. Solicitar y validar la Nota 2
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10. Programa terminado.");
            teclado.close();
            return;
        }

        // 3. Solicitar y validar la Nota 3
        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();
        if (nota3 < 0 || nota3 > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10. Programa terminado.");
            teclado.close();
            return;
        }

        // 4. Calcular el promedio (solo si todas las notas fueron válidas)
        double promedio = (nota1 + nota2 + nota3) / 3;

        // 5. Mostrar resultados
        System.out.println("\n-------------------------------------------");
        System.out.printf("El promedio final del estudiante es: %.2f\n", promedio);

        // Determinamos el estado (Aprobado con 6.0 o más)
        if (promedio >= 6.0) {
            System.out.println("Estado: ¡APROBADO!");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
