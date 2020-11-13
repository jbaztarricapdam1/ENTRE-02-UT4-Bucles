
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Julen Baztarrica Puyal
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
       for (int fila=1; altura<=fila; altura++){
          for (int espacio=1; espacio<=fila; espacio++){
              System.out.println(" ");
          }
          for (int a=1; a <=(altura*2)-1; a++) {
              System.out.println("*");
          }
            System.out.println();
       }
    }
  

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         

    }
}
