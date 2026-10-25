
package eva2_8_recursividad;

public class EVA2_8_RECURSIVIDAD {


   public static void main(String[] args) {
      imprimirCiclo(5);
      imprimirRecu(5);
   }   
   public static void imprimirCiclo(int numero){
      for (int i = numero; i >= 1; i--) {
         System.out.print(i + " - ");
      }
      System.out.println("");
   }
  
   public static void imprimirRecu(int numero){
      //resuelve una parte del problema
      System.out.print(numero + " - ");
      //se llama a si mismo
      if(numero > 1) //detener la recursividad
      imprimirRecu(numero - 1);
     
      
   }
   
   
}
