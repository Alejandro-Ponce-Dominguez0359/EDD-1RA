
package eva2_4_queue;


public class MyQueue {
   private Nodo inicio;
    private Nodo fin;
    private int tamanio;

 
    public MyQueue() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }


    public void imprimirInv() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }

    public int longitud() {
        return tamanio;
    }

    public int valorEn(int posicion) throws RuntimeException {
        int tama = longitud();
        if (posicion >= 0 && posicion < tama) {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        } else {
            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
        }
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

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
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


 
    public void insertarEn(int valor, int posicion) {
        int tama = longitud();
        if (posicion < 0 || posicion > tama) {
            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
        }

        Nodo nuevo = new Nodo(valor);
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

            Nodo temp = inicio;
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
            throw new RuntimeException(
                    "No se puede borrar: la lista esta vacia"
            );
        }

        int tama = longitud();
        if (posicion < 0 || posicion >= tama) {
            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
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
            Nodo temp = inicio;
            int cont = 0;

            while (cont < posicion) {
                temp = temp.getSiguiente();
                cont++;
            }
            temp.getPrevio().setSiguiente(
                    temp.getSiguiente()
            );
            temp.getSiguiente().setPrevio(
                    temp.getPrevio()
            );
        }

        tamanio--;
    }

    public void push(int valor) {
        agregar(valor);
    }

    public int peek() {
        if (listaVacia()) {
            throw new RuntimeException("No se puede leer: la cola esta vacia");
        }
        return inicio.getValor();
    }

    public int pop() {
        if (listaVacia()) {
            throw new RuntimeException("No se puede eliminar: la cola esta vacia");
        }
        int valor = inicio.getValor();
        borrarEn(0);
        return valor;
    }
}
