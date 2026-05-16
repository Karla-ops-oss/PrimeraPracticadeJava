import java.util.Scanner;
import java.util.Locale;

public class CalcularHipotenusa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Configuramos para poder usar puntos en los decimales (ej: 3.5)
        teclado.useLocale(Locale.US);

        System.out.println("--- Calculadora de Hipotenusa (Teorema de Pitágoras) ---");

        // 1. Solicitar la longitud del primer cateto
        System.out.print("Ingresa la longitud del primer cateto (a): ");
        double catetoA = teclado.nextDouble();

        // 2. Solicitar la longitud del segundo cateto
        System.out.print("Ingresa la longitud del segundo cateto (b): ");
        double catetoB = teclado.nextDouble();

        // 3. Aplicar el Teorema de Pitágoras
        // Sumamos los cuadrados de ambos catetos y luego extraemos la raíz cuadrada
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        // 4. Mostrar el resultado
        System.out.println("\n-------------------------------------------");
        System.out.println("Para los catetos con longitudes " + catetoA + " y " + catetoB + ",");
        System.out.println("la longitud de la hipotenusa es: " + hipotenusa);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}