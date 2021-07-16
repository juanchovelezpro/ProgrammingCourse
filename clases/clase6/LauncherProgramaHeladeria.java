package clases.clase6;

import clases.clase3y4.Persona;

import java.util.Scanner;

public class LauncherProgramaHeladeria {
    public static void main(String[] args) {

        Heladeria heladeria = new Heladeria("Los heladitos", "1. Vainilla\n2. Chocolate\n3. Chicle\n4. Ron con pasas\n5. Macadamia\n10. Cerrar Heladeria.");
        Scanner scan = new Scanner(System.in);

        boolean isClosed = false;

        while(!isClosed){

            System.out.println("Bienvenido a la heladeria " + heladeria.getName());
            System.out.println("Estas son las opciones de helado, cual deseas ?\n" + heladeria.getOptionsIceCreams());

            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("Tenga su helado de Vainilla");
                    break;
                case 2:
                    System.out.println("Tenga su helado de chocolate");
                    break;
                case 3:
                    System.out.println("Tenga su helado de chicle");
                    break;
                case 4:
                    System.out.println("Tenga su helado de ron con pasas");
                    break;
                case 5:
                    System.out.println("Tenga su helado de macadamia");
                    break;
                case 10:
                    isClosed = true;
                    break;
                default:
                    System.out.println("No tenemos esa opción.");
                    break;
            }
        }

        System.out.println("Cerrando heladeria...");
        System.out.println("Heladeria cerrada.");


    }
}
