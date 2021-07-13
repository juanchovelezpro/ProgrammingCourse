package clases.clase2;

public class DeclararVariables {
    public static void main(String[] args) {


        /*
        Tipos primitivos
         */

        // Solo los valores true | false
        boolean iniciar = false;

        // solo numeros enteros entre -128 y 127
        byte elByte = 127;

        // Solo caracteres entre comillas simples '' o numeros enteros entre 0 y 65535 (Ver los valores de UNICODE)
        char caracter = 'h';

        // Numeros enteros pequeños (ver rango de valores en el API de Java)
        short numeroCorto = 25;

        // Numeros enteros con un mayor rango a los de tipo short (ver rango de valores en el API de Java)
        int numeroEntero = 1000000;

        // Numeros enteros muy grandes (ver rango de valores en el API de Java)
        long numeroEnteroGrande = 1000000000;

        // Numeros con parte entera y parte decimal pero su precision es de unicamente 32 bits (ver rango en API de Java)
        float numeroDecimalPocoPreciso = 2.33333333f;

        // Numeros con parte entera y parte decimal con el doble de precision de los de tipo float, es decir 64 bits (Ver rango en API de Java)
        double numeroDecimalDeMayorPrecision = 998.567889594949;


        int numUno = 4;
        int numDos = 5;

        /*
        Operaciones aritmeticas
         */
        int suma = numUno + numDos;
        int resta = numUno - numDos;
        int multiplicacion = numUno * numDos;
        // Esta variable solo almacena la parte entera del resultado de la division
        int division = numUno / numDos;

        // Probar con float.
        double numFloatUno = 4.0;
        double numFloatDos = 5.0;
        //float floatDivision = numFloatUno/numFloatDos;

        double doubleDivision = numFloatUno / numFloatDos;

        // Ver el residuo de uno division
        int modulo = numDos % numUno;

        /*
        Resultados
         */
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multiplicacion);
        System.out.println("Division =" + division);
        //System.out.println("Float Division" + floatDivision);
        System.out.println("Double Division " + doubleDivision);
        System.out.println("Modulo = " + modulo);

        int x = 5;
        int y = 6;

        // x es menor igual a y ?
        System.out.println(x <= y);


    }
}
