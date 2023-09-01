import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero par o impar");
        System.out.print("Dijite el numero: ");

        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");

        }

    }
}