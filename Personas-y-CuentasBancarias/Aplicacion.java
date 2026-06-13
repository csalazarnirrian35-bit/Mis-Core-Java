import clases.CuentaBancaria;
import clases.Persona;


public class Aplicacion {
    public static void main(String[] args) {
        // 3 instancia de Personas
        Persona Alejandro = new Persona("Alejandro", 39);
        Persona Ana = new Persona("Ana", 56);
        Persona Rosa = new Persona("Rosa", 48);

        // 3 instancia Cuenta Bancaria
        CuentaBancaria cuentaAlejandro = new CuentaBancaria(60.00, Alejandro);
        CuentaBancaria cuentaAna = new CuentaBancaria(300.00, Ana);
        CuentaBancaria cuentaRosa = new CuentaBancaria(150.00, Rosa);

        // Operaciones de Depositos y Retiros
        System.out.println("Movimientos de Alejandro");
        cuentaAlejandro.depositar(100.00);
        System.out.println("Saldo Alejandro es: " + cuentaAlejandro.getSaldo());
        cuentaAlejandro.retirar(50.00);
        System.out.println("Saldo cuenta Alejandro: " + cuentaAlejandro.getSaldo());
        
        System.out.println("Movimiento de Ana");
        cuentaAna.depositar(300);
        cuentaAna.retirar(700);
        System.out.println("Saldo Ana es: " + cuentaAna.getSaldo());

        System.out.println("Movimiento de Rosa");
        System.out.println("Saldo cuenta: " + cuentaRosa.getSaldo());
        cuentaRosa.retirar(70);
        System.out.println("saldo cuenta Rosa: " + cuentaRosa.getSaldo());
        cuentaRosa.depositar(30);
        System.out.println("Saldo Actual es: " + cuentaRosa.getSaldo());
        
        //imprime informacion de todas las cuentas
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();

    }
    
    

}
