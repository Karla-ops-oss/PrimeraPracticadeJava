import java.util.Scanner;
import java.util.Locale;

public class EncontrarMayor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // Permite ingresar números con punto decimal

        System.out.println("--- Buscador del Número Mayor ---");

        // 1. Solicitar los tres números
        System.out.print("Ingresa el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = teclado.nextDouble();

        // 2. Lógica para encontrar el mayor
        // Empezamos asumiendo que el primero es el mayor
        double mayor = num1;

        // Si el segundo número es más grande que nuestro mayor actual, el segundo pasa a ser el mayor
        if (num2 > mayor) {
            mayor = num2;
        }

        // Si el tercer número es más grande que nuestro mayor actual, el tercero pasa a ser el mayor
        if (num3 > mayor) {
            mayor = num3;
        }

        // 3. Mostrar el resultado
        System.out.println("\n-------------------------------------------");
        System.out.println("Los números ingresados fueron: " + num1 + ", " + num2 + " y " + num3);
        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
