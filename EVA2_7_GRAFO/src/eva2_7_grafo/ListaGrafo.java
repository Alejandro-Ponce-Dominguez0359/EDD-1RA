
package eva2_7_grafo;


public class ListaGrafo <VACA> {
    private Nodo<VACA> inicio;
    private Nodo<VACA> fin;
    private int tamanio;
    public ListaGrafo() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }
    public int longitud() {
        return tamanio;
    }
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    public void vaciarLista() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }
    public VACA valorEn(int posicion) throws RuntimeException {
        int tama = longitud();
        if (posicion >= 0 && posicion < tama) {
            Nodo<VACA> temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        } else {
            throw new RuntimeException("La posicion " + posicion + " no es valida!!!");
        }
    }

    public int encontrarEn(VACA valor) {
        Nodo<VACA> temp = inicio;
        int posicion = 0;
        while (temp != null) {
            if ((temp.getValor() == null && valor == null)|| (temp.getValor() != null&& temp.getValor().equals(valor))) {
                return posicion;
            }
            temp = temp.getSiguiente();
            posicion++;
        }
        return -1;
    }
  
    public void agregar(VACA valor) {
        Nodo<VACA> nuevo = new Nodo<VACA>(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
           
            fin = nuevo;
        }
        tamanio++;
    }
   
    public void insertarEn(VACA valor, int posicion) {
        int tama = longitud();
      
        if (posicion < 0 || posicion > tama) {
           throw new RuntimeException("La posicion " + posicion + " no es valida!!!");
        }
        Nodo<VACA> nuevo = new Nodo<VACA>(valor);
 
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
     
        } else if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
   
        } else if (posicion == tama) {
            nuevo.setPrevio(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
       
        } else {
            Nodo<VACA> temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
           
            nuevo.setSiguiente(temp);
            nuevo.setPrevio(temp.getPrevio());
          
            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
        tamanio++;
    }
 
    public void borrarEn(int posicion) {
      
        if (inicio == null) {
            throw new RuntimeException("No se puede borrar: la lista esta vacia");
        }
        int tama = longitud();
        if (posicion < 0 || posicion >= tama) {
            throw new RuntimeException("La posicion " + posicion + " no es valida!!!");
        }
     
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else if (posicion == 0) {
            inicio = inicio.getSiguiente();
            inicio.setPrevio(null);
        } else if (posicion == tama - 1) {
            fin = fin.getPrevio();        
            fin.setSiguiente(null);      
        } else {
            Nodo<VACA> temp = inicio;
            int cont = 0;
            while (cont < posicion) {
                temp = temp.getSiguiente();
                cont++;
            }
          
            temp.getPrevio().setSiguiente(temp.getSiguiente());

            temp.getSiguiente().setPrevio(temp.getPrevio());
        }
        tamanio--;
    }
  
    public void imprimir() {
        Nodo<VACA> temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
  
    public void imprimirInv() {
        Nodo<VACA> temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
}