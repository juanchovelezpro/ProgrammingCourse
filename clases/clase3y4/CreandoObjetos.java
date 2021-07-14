package clases.clase3;

public class CreandoObjetos {
    public static void main(String[] args) {

        Persona persona = new Persona( "Juan Camilo", 1, 10, "20/12/1998", 1.80, 80);
        Persona persona2 = new Persona( "Bryam Cuesta", 1, 14, "01/01/2007", 1.80, 80);
        System.out.println(persona.getNombre());
        persona.setNombre("Samuel");
        System.out.println(persona.getNombre());
        System.out.println(persona2.getNombre());

        System.out.println("Persona 1 saludando");

        System.out.println(persona.getPeso());

        persona.saludar();

        persona.despedida();

        // Operador ternario  condicion ? true : false  (SIEMPRE DEBE RETORNAR UN VALOR)

        String mensaje = "";

        mensaje = persona2.getEdad() >= 18 ? "La persona con el nombre " + persona2.getNombre() + " puede entrar" : "Usted no puede entrar";

        System.out.println(mensaje);
        // if else else if ...

        if(persona.getEdad() >= 18 && persona.getEdad() <= 25) {
            System.out.println("Usted puede entrar a zona normal");
        }













    }
}
