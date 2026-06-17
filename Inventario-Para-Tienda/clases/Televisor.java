package clases;

public class Televisor extends ProductoElectrodomestico {
    private String marca;
    private int tamanoPantalla;
    private String resolucion;
    private String tecnologiaDePanel;

//constructor de la clase
public Televisor(String nombreProducto, double precio, String marca, int tamanoPantalla, String resolucion, String tecnologiaDePanel){
    super(nombreProducto, precio, 0);
    this.marca = marca;
    this.tamanoPantalla = tamanoPantalla;
    this.resolucion = resolucion;
    this.tecnologiaDePanel = tecnologiaDePanel;
}
 //Getters y Setters

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public double getTamanoPantalla() {
    return tamanoPantalla;
}

public void setTamanoPantalla(int tamanoPantalla) {
    this.tamanoPantalla = tamanoPantalla;
}

public String getResolucion() {
    return resolucion;
}

public void setResolucion(String resolucion) {
    this.resolucion = resolucion;
}

public String getTecnologiaDePanel() {
    return tecnologiaDePanel;
}

public void setTecnologiaDePanel(String tecnologiaDePanel) {
    this.tecnologiaDePanel = tecnologiaDePanel;
}




    //sobrescribe metodo mostrarInformacion()
@Override
public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Tamaño pantalla: " + this.tamanoPantalla + " pulgadas");
    System.out.println("Resolución: " + this.resolucion);
    System.out.println("Tecnologia de panel: " + this.tecnologiaDePanel);

}

@Override
public String toString() {
    return "Televisor: " + super.toString() + " [marca=" + marca + ", tamanoPantalla=" + tamanoPantalla + ", resolucion=" + resolucion
            + ", tecnologiaDePanel=" + tecnologiaDePanel + "]";
}






}
