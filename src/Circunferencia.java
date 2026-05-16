import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Calculadora de Área de una Circunferencia ---");

        // 1. Solicitar el radio
        System.out.print("Por favor, ingresa el radio del círculo: ");
        double radio = teclado.nextDouble();

        // 2. Calcular el área usando Math.PI y Math.pow(radio, 2)
        // Math.pow(base, exponente) eleva el radio al cuadrado
        double area = Math.PI * Math.pow(radio, 2);

        // 3. Mostrar el resultado
        System.out.println("\n-------------------------------------------");
        System.out.println("Para un círculo con radio de " + radio + ",");
        System.out.println("el área total es: " + area);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}
