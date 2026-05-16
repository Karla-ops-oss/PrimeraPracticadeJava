import java.util.Scanner;
import java.util.Locale;

public class CalcularPromedio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // Para permitir notas con punto decimal (ej: 5.5)

        System.out.println("--- Evaluador de Promedios Estudiantiles ---");

        // 1. Solicitar las tres notas
        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();

        // 2. Calcular el promedio
        // Usamos paréntesis para asegurarnos de que primero sume y luego divida
        double promedio = (nota1 + nota2 + nota3) / 3;

        // 3. Mostrar el promedio en pantalla
        System.out.println("\n-------------------------------------------");
        System.out.printf("El promedio final del estudiante es: %.2f\n", promedio);
        // Nota: "%.2f" sirve para mostrar solo 2 decimales y que no salgan números infinitos

        // 4. Determinar si está aprobado o reprobado (Condición)
        // Cambia el 6.0 por la nota mínima de tu escuela si es necesario
        if (promedio >= 6.0) {
            System.out.println("Estado: ¡APROBADO!");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
