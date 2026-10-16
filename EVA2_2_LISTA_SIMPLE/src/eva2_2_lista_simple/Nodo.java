
package eva2_2_lista_simple;


public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    //constructores
    
    public Nodo(){
        siguiente = null;// marca el fin de la lista 
    }
    
    public Nodo(int valor){
        this.valor = valor;
        siguiente = null;
    }
    //get y set
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
