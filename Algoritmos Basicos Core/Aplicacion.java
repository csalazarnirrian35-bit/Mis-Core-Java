

import clases.Algoritmos;



public class Aplicacion {
    public static void main(String[] args) {
        
        boolean esPar = Algoritmos.nroPar(20);
        System.out.println("Es numero par ? : " + esPar);
        System.out.println(Algoritmos.nroPar( 53));


        boolean esPrimo = Algoritmos.nroPrimo(47);
        System.out.println("Es numero primo ? : " + esPrimo);
        System.out.println(Algoritmos.nroPrimo(8));

        String palabraReves = Algoritmos.stringEnReversa("Algoritmos");
        System.out.println("String en reversa : " + palabraReves);
        System.out.println(Algoritmos.stringEnReversa("papaya"));
        

        boolean palindromo = Algoritmos.esPalindromo("Oso");
        System.out.println("Es palindromo: "+ palindromo);
        System.out.println(Algoritmos.esPalindromo("camaron"));

        Algoritmos.secuenciaFizzBuzz(30);
    
    

        
    }





}

