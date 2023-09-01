import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        // si el numero es divisible por dos no es primo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo && numero > 1) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
    }
}
