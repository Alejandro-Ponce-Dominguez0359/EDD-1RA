
package eva2_5_stack;

public class EVA2_5_STACK {

  
   public static void main(String[] args) {
      
        MyStack pila = new MyStack();
        //  PUSH
        pila.push(100);
        pila.push(200);
        pila.push(300);
        pila.push(400);
        System.out.println("Despues de hacer push:");
        pila.imprimir();
        //  PEEK
        System.out.println("Peek: " + pila.peek());
        System.out.println("La pila sigue igual despues de peek:");
        pila.imprimir();
        // POP
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pila despues del primer pop:");
        pila.imprimir();
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pila despues del segundo pop:");
        pila.imprimir();
        
        System.out.println("Nuevo peek: " + pila.peek());
       
        System.out.println("Tamanio actual: " + pila.longitud());
   }
   
}
