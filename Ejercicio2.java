import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de descuento ===");
        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingresa el porcentaje: ");
        double porcentaje = scanner.nextDouble();
        
        double precioConDescuento = calcularPrecioConDescuento(precio, porcentaje);
        
        System.out.println("El precio con descuento  es: " + precioConDescuento);
    }
    
    public static double calcularPrecioConDescuento(double precio, double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
}
