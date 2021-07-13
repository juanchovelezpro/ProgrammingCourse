package retos;

import java.util.Scanner;

/**
 * Hacer un programa que le pida el nombre al usuario y printee el siguiente mensaje "Bienvenido, nombre del usuario"
 * Ejemplo -> entrada -> Juan -> salida -> Bienvenido, Juan
 */
public class RetoWelcome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Como declarar una variable -> Primero el tipo de variable, luego nombre de la variable, luego el =, luego el valor de esa variable
        System.out.println("Por favor digite su nombre:");

        String nombreUsuario = scanner.nextLine();

        System.out.println("Bienvenido, " + nombreUsuario);
    }
}
