
package eva2_6_tipos_genericos;

public class EVA2_6_TIPOS_GENERICOS {

   public static void main(String[] args) {
 
        Ejemplo<ListaDoble> prueba = new Ejemplo<ListaDoble>();
        
    }
    
}
class ListaDoble{}

class Ejemplo<T> {// aqui le estamos diciendo es que vamos a usar cualquier tipo de dato
    private T dato;

    public Ejemplo() {
    }   
   
    public Ejemplo(T dato) {
        this.dato = dato;
    }
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
}



