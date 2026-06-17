package clases;

import java.util.ArrayList;


public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;


//constructor
public TiendaElectronica(){
    this.listaDeProductos = new ArrayList<>();

}

//getter y setter
public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
    return listaDeProductos;
}

public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
    this.listaDeProductos = listaDeProductos;
}

 //METODO AGREGAR PRODUCTO AL INVENTARIO
public void agregarProducto(ProductoElectrodomestico producto){
    this.listaDeProductos.add(producto);
}

//METODO MOSTRAR TODOS LOS PRODUCTOS DISPONIBLES
public void mostrarProductos(){
    System.out.println(getListaDeProductos());
}

//METODO BUSCAR PRODUCTO POR SU NOMBRE
// al colocar ProductoElectrodomestico devolvera mi objeto buscado al final
public ProductoElectrodomestico buscarProducto(String buscaProducto){  //recibe variable "texto que el usuario escribe"
    for (int i = 0; i < listaDeProductos.size(); i++) { //ordeno al ciclo a repetirse las veces que sean necesarias(dependera de cuantos elementos tenga mi lista)
        ProductoElectrodomestico productoInventario = listaDeProductos.get(i); //creo variable temporal para dejar el producto de la vuelta actual, que sera evaluado en la proxima linea
        if (productoInventario.getNombreProducto().equalsIgnoreCase(buscaProducto)) { //se compara nombre producto con el nombre del usuario(los textos)
            return productoInventario;// si en el ciclo encuentra la coincidencia,se devuelve el producto que se esta solicitando, ahi finaliza, en caso contrario sigue buscando y si ya termina de recorrer el ciclo y no encontro coincidencia alguna va al return de abajo
        }
    }
    return null; //este return, fuera del for, es para que el ciclo revise toda la lista, y si no encuentra el producto no se ejecuta el if y solo le queda  ejecutar esto.
}


//METODO REALIZAR VENTA Y VERIFICAR STOCK DE PRODUCTOS

public void venta (String productoVenta, int cantidadSolicitada){
    ProductoElectrodomestico productoActual = buscarProducto(productoVenta);

    if(productoActual != null && productoActual.getCantidadDisponible() >= cantidadSolicitada){
        int stockActualizado = productoActual.getCantidadDisponible() - cantidadSolicitada;
        productoActual.setCantidadDisponible(stockActualizado);
            System.out.println("Venta " + productoVenta +  " realizada con exito");
            return;
        }else if(productoActual == null){
            System.out.println("Producto no existente en inventario");
            return;
        }else{
            System.out.println("Producto agotado");
        }

    }

@Override
    public String toString() {
        return "TiendaElectronica: [listaDeProductos = " + listaDeProductos + "]";
    }


}



































