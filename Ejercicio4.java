import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tablas de pultiplicar ===");

        System.out.print("Ingresa el numero de la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
