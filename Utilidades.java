import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Julen Baztarrica Puyal
 */
public class Utilidades
{
    
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int cifra = 0;
        
        while(n > 10){
            cifra = n % 10;
            n = n / 10;
            if(cifra >= 7){
                return false;
            }
        }
        return true;
    }
     

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
         int cifras = 0;
        
         while (n > 0){
             n = n/10;
             cifras++;
            }
            System.out.println(n + " tiene " + cifras + " dígitos");
            return 0;
    }

}
