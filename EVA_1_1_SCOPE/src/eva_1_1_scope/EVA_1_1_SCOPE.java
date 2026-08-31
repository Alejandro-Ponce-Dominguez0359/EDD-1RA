
package eva_1_1_scope;


public class EVA_1_1_SCOPE {

   
    public static void main(String[] args) {
       int x = 100;//existe dentro del bloque el main()
       for (int i = 0; i < 10; i++){//existe solo en dentro del for
           System.out.println("i = "+i);
           x++;//vuelve dentro del for
    }
    System.out.println("Valor final de la i = "+ i);//ya no existe
        System.out.println("valor final de la x = " + x);//todavia existe
       }
    public static void OtraFuncion(){
        System.out.println("valor de x " + x ); // No existe 
    }
}