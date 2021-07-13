package tareas;

import java.util.Scanner;

/**
 * Hacer un programa que le pida dos numeros al usuario y printee la suma de los dos numeros
 * Ejemplo -> Entradas -> 1
 * Entrada 2 -> 1
 * Salida -> 2
 */
public class TareaSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero");

        int numeroUno = scanner.nextInt();

        System.out.println("Digite el segundo numero");

        int numeroDos = scanner.nextInt();

        int resultado = numeroUno + numeroDos;

        System.out.println("La suma es " + resultado);

    }
}
