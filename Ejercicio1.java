
package com.mycompany.temperaturaconverter;

import java.util.Scanner;

public class TemperaturaConverter {

    public static void main(String[] args) {
       double gradoC = 0;
       double gradoF = 0;
       int opcion = 0;
       System.out.println("Escribe 1 si quieres pasar de celcius a farenheit, o escribe 2 si quieres pasar de farenheit a celcius");
       Scanner scanner = new Scanner(System.in); 
       opcion = Scanner.nextInt();
            if (opcion == 1 ){
                System.out.println("Cuantos °C quieres convertir a °F");
                gradoC = Scanner.nextDouble();
                gradoF = (gradoC*9/5)+32;
                System.out.println(gradoC + "°C equivale a" ° + gradoF + "°F" );
            }
            else if (opcion == 2 ){
                System.out.println("Cuantos °F quieres convertir a °C");
                gradoF = Scanner.nextDouble();
                gradoC = ((gradoF -32)*9/5);
                System.out.println(gradoF + "°F equivale a" ° + gradoC + "°C" );
            
            
            }
    }
}