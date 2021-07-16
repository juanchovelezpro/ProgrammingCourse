package clases.clase6;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escoja uno de los siguientes helados");

        String helados = "1. Vainilla\n2. Chocolate\n3. Chicle\n4. Ron con pasas\n5. Macadamia";
        System.out.println(helados);

        int opcionHelado = scan.nextInt();

        switch (opcionHelado){
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
            default:
                System.out.println("No tenemos esa opción.");
                break;
        }

    }
}
