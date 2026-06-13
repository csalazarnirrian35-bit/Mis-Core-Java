package clases;

public class Persona {
    //atributos
    private String nombre;
    private int edad;

 //constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//metodo de instacia Desplegar información
    public void despliegaInformacion(){
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);


    }






}
