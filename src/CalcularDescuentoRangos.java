import java.util.Scanner;
import java.util.Locale;

public class CalcularDescuentoRangos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Configuramos para poder ingresar precios con punto decimal (ej: 150.50)
        teclado.useLocale(Locale.US);

        System.out.println("--- Calculadora de Descuentos por Rangos ---");

        // 1. Solicitar el valor de la compra
        System.out.print("Por favor, ingresa el valor de la compra: $");
        double valorCompra = teclado.nextDouble();

        // Variables para almacenar el porcentaje, el dinero a descontar y el total
        double porcentajeDescuento = 0.0;
        double montoDescuento = 0.0;
        double totalAPagar = 0.0;

        // 2. Determinar el porcentaje de descuento según el rango
        if (valorCompra < 100) {
            porcentajeDescuento = 0.0; // Menor que 100: no hay descuento
        }
        else if (valorCompra >= 100 && valorCompra <= 300) {
            porcentajeDescuento = 0.10; // Entre 100 y 300: 10%
        }
        else {
            porcentajeDescuento = 0.15; // Mayor que 300: 15%
        }

        // 3. Hacer los cálculos
        montoDescuento = valorCompra * porcentajeDescuento;
        totalAPagar = valorCompra - montoDescuento;

        // 4. Mostrar los resultados en pantalla
        System.out.println("\n-------------------------------------------");
        System.out.printf("Valor de la compra:   $%.2f\n", valorCompra);
        System.out.printf("Descuento aplicado:   $%.2f (%.0f%%)\n", montoDescuento, (porcentajeDescuento * 100));
        System.out.printf("Total neto a pagar:   $%.2f\n", totalAPagar);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
