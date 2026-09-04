
package eva1_2_stack;


public class EVA1_2_STACK {
    public static void main(String[] args) {
        
        System.out.println("INICA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
    }
     public static void B(){
         System.out.println("INICA A");
         int i = 5;
         double d= 5.5;
         System.out.println("TERMINA B");
     }
}
