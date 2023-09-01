import java.util.Scanner;

public class Ejercicio5 {

    public static double IMCCalculator(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Calculadora de masa corporal ==");
        
        System.out.print("Dame tu peso (79,9): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Dame tu altura (1,84): ");
        double altura = scanner.nextDouble();
        
        System.out.printf("Tu IMC es: %.2f %n", IMCCalculator(peso, altura) );

    }


}
