
package eva1_12_primos;
import java.util.Scanner;
public class EVA1_12_PRIMOS {

   
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
      System.out.println("ingresa un numero " );
     int n = teclado.nextInt(); 
          
        System.out.println("Metodo 1");
        Metodo1(n);
        
        System.out.println("\nMetodo 2");
        Metodo2(n);
    }

    //Metodo1
    public static void Metodo1(int n) {
        for (int i = 2; i < n; i++) {
                 
            if (n % i == 0) {
                System.out.println("El numero " + n + " No es primo.");
                return; 
            }
        }      
        System.out.println("El numero " + n + " Si es primo.");
    }

   //Metodo2
    public static void Metodo2(int n) {
        int raiz = (int) Math.sqrt(n); 
        
        for (int i = 2; i <= raiz; i++) {
               
            if (n % i == 0) {
                System.out.println("El numero " + n + " No es primo.");
                return; 
            }
        }
        
        System.out.println("El numero " + n + " Si es primo.");
    }
}