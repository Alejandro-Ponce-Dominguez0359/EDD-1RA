
package eva2_4_queue;


public class Nodo {
   //DOS ATRIBUTOS
   private int valor;
   private Nodo siguiente;
   private Nodo previo;
   //CONSTRUCTORES:
   public Nodo(){
      siguiente = null;//ESTO ES MUY IMPORTANTE MARCAR EN NULL EL OBJETO, MARCA EL FIN DE LA LISTA
      this.previo = null;
   }
   public Nodo(int dato){//PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
      this.valor = dato;
      siguiente = null;
      this.previo = null;
   }
   
   //getters y setters

   public int getValor() {
      return valor;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setValor(int dato) {
      this.valor= dato;
   }

   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }

   public Nodo getPrevio() {
      return previo;
   }

   public void setPrevio(Nodo previo) {
      this.previo = previo;
   }
   
}
