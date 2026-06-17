package clases;

public class ProductoElectrodomestico {
    private String nombreProducto;
    private double precio;
    private int cantidadDisponible;



    //constructor
    public ProductoElectrodomestico(String nombreProducto, double precio, int cantidadDisponible){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    

    }

    //constructor sobrecargado
    public ProductoElectrodomestico(String nombreProducto, double precio){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = 0;
    

    }
    //Getters y Setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    


    public void agregarCantidadDisponible(int stockAgregado){
        this.cantidadDisponible += stockAgregado;
        System.out.println("Stock actualizada disponible : " + stockAgregado + " unidades " + nombreProducto);
    }


     //Metodo de instancia
    public void mostrarInformacion(){
        System.out.println("\n--------Producto Electrodomesticos---------");
        System.out.println("Nombre Producto: " + this.nombreProducto);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock disponible: "+ this.cantidadDisponible);
    }

    @Override
    public String toString() {
        return "ProductoElectrodomestico [nombreProducto=" + nombreProducto + ", precio=" + precio
                + ", cantidadDisponible=" + cantidadDisponible + "]";
    }


    


    



} 
