
import clases.ComputadoraPortatil;
import clases.Televisor;
import clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
        
        Televisor tvXiaomi = new Televisor("Xiaomi Smart Tv", 329.990,  "Xiaomi", 55, "4K UHD", "LED (QLED)");
        Televisor tvSamsung = new Televisor("Samsung Crystal UHD", 319.990,  "Samsung", 50, "4K UHD", "LED");
        Televisor tvLg = new Televisor("Lg Smart tv", 249000, "LG", 49, "HD", "LED");

        tvXiaomi.mostrarInformacion();
        tvSamsung.mostrarInformacion();
        tvXiaomi.agregarCantidadDisponible(3);
        tvSamsung.agregarCantidadDisponible(2);


        ComputadoraPortatil  computadoraPortatil1 = new ComputadoraPortatil("ASUS Vivobook 14", 339.9900, "Intel Core i3-1215U", 8, 128, 14);
        ComputadoraPortatil computadoraPortatil2 = new ComputadoraPortatil("Lenovo IdeaPad Slim 3", 429.990, "AMD Ryzen 3", 8, 512, 15.6);
        computadoraPortatil1.mostrarInformacion();
        computadoraPortatil2.agregarCantidadDisponible(2);
        
        TiendaElectronica inventarioTienda = new TiendaElectronica();
        inventarioTienda.agregarProducto(tvXiaomi);
        inventarioTienda.agregarProducto(tvSamsung);
        inventarioTienda.agregarProducto(computadoraPortatil2);
        inventarioTienda.agregarProducto(tvLg);
        inventarioTienda.mostrarProductos();

        inventarioTienda.buscarProducto("lenovo ideapad slim 3");
        inventarioTienda.mostrarProductos();

        inventarioTienda.venta("Samsung Crystal UHD", 1);
        inventarioTienda.venta("ASUS vivobook 14", 1);
        inventarioTienda.venta("lg smart tv", 1);
        inventarioTienda.venta("xiaomi smart tv", 4);
        inventarioTienda.mostrarProductos();

    
        


    } 
}
