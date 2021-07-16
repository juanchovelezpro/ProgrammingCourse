package clases.clase5;

import java.util.Random;

public class CicloWhile {
    public static void main(String[] args) {


        // Ciclo While

        Random ran = new Random();

        ran.nextInt(10);

        int contador = 0;

        int[] enteros = {1,2,3,4,5,6,7};


        boolean centinelaParada = false;

        int numeroABuscar = 5;

        while(!centinelaParada && contador < enteros.length){

            System.out.println(enteros[contador]);
            if(enteros[contador] == numeroABuscar){
                centinelaParada = true;
            }

            contador = contador + 1;

        }


        for(int i = 0; i<10000; i+=2){
            System.out.println(i);
        }


        int x = 10;

        do{
            System.out.println("hola");
        }while(x<10);



    }
}
