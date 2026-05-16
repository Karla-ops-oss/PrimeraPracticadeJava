import java.util.Scanner;
import java.util.Locale;

public class CalcularDescuento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Nos aseguramos de que acepte puntos decimales (ej. 15.50)
        teclado.useLocale(Locale.US);

        System.out.println("--- Calculadora de Descuentos (Oferta 10%) ---");

        // 1. Solicitar el valor de la compra
        System.out.print("Por favor, ingresa el valor total de la compra: $");
        double valorCompra = teclado.nextDouble();

        // 2. Calcular el 10% de descuento
        double montoDescuento = valorCompra * 0.10;

        // 3. Calcular el total final a pagar
        double totalAPagar = valorCompra - montoDescuento;

        // 4. Mostrar los resultados
        System.out.println("\n-------------------------------------------");
        System.out.println("Valor original:   $" + valorCompra);
        System.out.println("Descuento (10%):  $" + montoDescuento);
        System.out.println("Total a pagar:    $" + totalAPagar);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
