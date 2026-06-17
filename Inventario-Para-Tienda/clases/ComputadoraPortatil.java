package clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    private String procesador;
    private int memoriaRamGB;
    private int almacenamientoGB;
    private double tamanopantallaPulgadas;


    //constructor
public ComputadoraPortatil(String nombreProducto, double precio, String procesador, int memoriaRamGB, int almacenamientoGB, double tamanopantallaPulgadas){
    super(nombreProducto, precio, 0);
    this.procesador = procesador;
    this.memoriaRamGB = memoriaRamGB;
    this.almacenamientoGB = almacenamientoGB;
    this.tamanopantallaPulgadas = tamanopantallaPulgadas;

}
@Override
public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Procesador: " + this.procesador);
    System.out.println("Memoria RAM: " + this.memoriaRamGB + " GB");
    System.out.println("Almacenamiento: " + this.almacenamientoGB + " GB");
    System.out.println("Tamaño Pantalla: " + this.tamanopantallaPulgadas + " pulgadas");
}
@Override
public String toString() {
    return "ComputadoraPortatil: " + super.toString() + " [procesador=" + procesador + ", memoriaRamGB=" + memoriaRamGB + ", almacenamientoGB="
            + almacenamientoGB + ", tamanopantallaPulgadas=" + tamanopantallaPulgadas + "]";
}




}
