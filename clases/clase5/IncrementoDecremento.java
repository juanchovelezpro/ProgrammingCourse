package clases.clase5;

public class IncrementoDecremento {

    public static void main(String[] args) {


        int x = 5; // x = 5
        int y = 10; // y = 10
        int z = 3; // z = 3

        x += y++; // x + y = 5 + 10 =  ---> x = 15, y = 11
        y -= z+(--x); // y = 11 --- z = 3 , x = 14 ----  y = y - z + x --- y = 11 - 17 ---> y = -6

        // x = 14
        // y = -6
        // z = 3

        z = --z + (x++) - y++; // z = 2 + 14 - (-6)

        // x = 15
        // y = -5
        // z = 22

        int w = --x + y + z; // w = 14 + (-5) + 22  ---> w = 31

        // Cuesta  w = 21;  Juanpis w = 20 , Caviedes w = No sabe no responde.
        System.out.println(w);

    }
}
