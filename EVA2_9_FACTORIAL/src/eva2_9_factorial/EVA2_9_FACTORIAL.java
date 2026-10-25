
package eva2_9_factorial;

public class EVA2_9_FACTORIAL {

   public static void main(String[] args) {
    
      System.out.println(factorialCiclo(5));
      System.out.println(factorialRecu(5));
   }
   
   public static int factorialCiclo(int valor){
      int resultado = 1;
    for (int i = 1; i <= valor; i++) {
        System.out.print(i);      
        if (i < valor) {
            System.out.print(" x ");
        }
        resultado = resultado * i;
    }
    System.out.println();
    return resultado;
   }
   
   public static int factorialRecu(int valor){
      if(valor == 0)
         return 1;
      else
      return valor * factorialRecu(valor - 1);
      
   }
}
