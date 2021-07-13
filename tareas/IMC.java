package tareas;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su peso en Kilogramos (Kg)");

        double weight = scan.nextDouble();

        System.out.println("Ingrese su altura en metros (m)");

        double height = scan.nextDouble();

        // or weight/(height*height)
        double imc = weight/Math.pow(height,2);

        System.out.printf("Su Indice de masa corporal es: %.2f", imc);

    }
}
