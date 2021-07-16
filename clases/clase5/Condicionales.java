package clases.clase5;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        // Operador Ternario condicion ? true : false (Siempre debe retornar un valor)

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        int edad = scan.nextInt();

        //String mensaje = edad >= 18 ? "Usted puede entrar al club" : "Usted no puede entrar al club";

        /*
        if(edad >= 18){
            System.out.println("Usted puede entrar al club");
        }else{
            System.out.println("Usted no puede entrar al club");
        }
         */

        if(edad >= 18 && edad < 25){
            System.out.println("Usted puede entrar al club de adolescentes");
        }else if(edad >= 25 && edad < 59){
            System.out.println("Usted puede entrar al club de adultos");
        }else if(edad >= 60){
            System.out.println("Usted entra al ancianato");
        }else{
            System.out.println("Usted no puede entrar");
        }









    }
}
