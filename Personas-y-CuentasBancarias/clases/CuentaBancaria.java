package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
     //atributo solo clase, no del contructor por que es estatica
    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    
    //Contructor
    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta();
        //esto agrega todo a la lista de cuentas bancarias 
        CuentaBancaria.listaDeCuentasBancarias.add(this);
    
    }

    
    //Getters y Setters
    public double getSaldo() {
        return saldo;
    }
    
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public Persona getTitular() {
        return titular;
    }
    
    
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    //lo comente porque no se deberia darse opcion a poder modificar el numero cuenta 
    /*public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        }*/
    
    //generar numero aleatorio de cuenta 6 digitos
    private int generarNumeroCuenta(){
    Random numeroAleatorio = new Random();
    int numeroCuenta = 100000 + numeroAleatorio.nextInt(900000);// se indica desde esos numeros porque piden de 6 digitos
       //revisa cada cuenta guardada en la lista y
    for (CuentaBancaria cuenta : CuentaBancaria.listaDeCuentasBancarias) {
        if(cuenta.getNumeroCuenta() == numeroCuenta){ // si el numero coincide con el nuevo
            return this.generarNumeroCuenta();   // esta repetido, genera otro
        }  
    } 
    return numeroCuenta;   // es nuevo , devuelve
    }
    
    //Depositar Dinero
    public void depositar(double monto){
        this.saldo += monto;
        System.out.println("Deposito: "+ monto + " fue realizado con exito!");
    }   

    // retirar dinero
    public void retirar(double monto){
        if(monto > 0 && this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Retiro: " + monto + " fue realizado con exito");
        }else{
            System.out.println("Monto solicitado " + monto + " excede el monto disponible para retiro");
        }
    }
    
    //metodo despliega informacion
    public void despliegaInformacion(){
        System.out.println("\n ----Datos de la cuenta---");
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo cuenta: " + this.saldo);
        System.out.println("Titular de la cuenta: " + this.titular.getNombre());
        System.out.println("------------------------------");
    }

    //Metodo estatico imprimir la informacion de todas las cuentas
    public static void imprimeInformacionDeTodasLasCuentas(){
        System.out.println("--Informacion de todas las cuentas bancarias--");
        for (CuentaBancaria ctaBancaria : listaDeCuentasBancarias) {
            ctaBancaria.despliegaInformacion();
        }
    }






    
    
    

}



