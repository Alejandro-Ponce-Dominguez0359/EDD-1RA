
package eva2_7_grafo;


public class Nodo<VACA> {

   private VACA valor;
    private Nodo<VACA> siguiente;
    private Nodo<VACA> previo;
  
   public Nodo(){
      siguiente = null;
      this.previo = null;
   }
   public Nodo(VACA dato){
      this.valor = dato;
      siguiente = null;
      this.previo = null;
   }
   

   public VACA getValor() {
      return valor;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setValor(VACA dato) {
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
