package clases;

public class Algoritmos {   //Numero Par
    public static boolean nroPar(int numero){
        int resultado = numero % 2;
        return resultado == 0;
    }
        //Número Primo
    public static boolean nroPrimo(int numero){
        if( numero < 2){
            return false;
        } 
        int i = 2;
        while(i < numero){
        if(numero % i == 0){
            return false;
        }
        i++;                
        }
            return true;
        }

        //String Reversa
        public static String stringEnReversa(String texto){
            String textoReves = "";
            for(int i = texto.length() - 1; i >= 0; i--){
                textoReves += texto.charAt(i);
            
            }
            return textoReves;
            
        }
        // Es Palindromo
        public static boolean esPalindromo(String palabra){
            String palabraReves = stringEnReversa(palabra);
            return palabra.equalsIgnoreCase(palabraReves);
            
        }
        // Secuencia FizzBuzz
            public static void secuenciaFizzBuzz(int nro){
                for(int i = 1; i <= nro; i++){
                if( i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if(i % 3 == 0){
                    System.out.println("Fizz");
                }else if(i % 5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }

    }



            











        
    








    
