package clases.clase3;

public class Persona {

    // Constantes
    public static final int HOMBRE = 1;
    public static final int MUJER = 0;

    // Atributos
    public String nombre;
    private int genero;
    private int edad;
    private String fechaNacimiento;
    private double estatura;
    private double peso;

    // Constructor
    public Persona(String nombre, int genero, int edad, String fechaNacimiento, double estatura, double peso) {
            this.nombre = nombre;
            this.genero = genero;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;
            this.estatura = estatura;
            this.peso = peso;
    }


    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Metodos adicionales

    public void saludar(){
        System.out.println("Hola soy " + nombre);
    }

    public void despedida(){
        System.out.println("Bye");
    }




}
