
package eva2_3_lista_doble;

/**
 *
 * @author calza
 */
public class ListaDoble {
   private Nodo inicio;
   private Nodo fin;
   private int tamanio;
   
   public ListaDoble(){
      inicio = null; //al crear la lista, se crea vacia
      fin = null;
      tamanio = 0;
   }
   
   public void imprimir(){
      Nodo temp = inicio;
      while(temp != null){
         System.out.print("[" + temp.getValor() + "]");
         temp = temp.getSiguiente();
      }
      System.out.println("");
   }
   
   public void imprimirInv(){
      Nodo temp = fin;
      while(temp != null){
         System.out.print("[" + temp.getValor() + "]");
         temp = temp.getPrevio();
      }
      System.out.println("");
   }
   
   public int longitud(){
      return tamanio;
   }
   public boolean listaVacia(){
      if(inicio == null){
        return true;
      }else{
         return false;
      }
   }
   
   public void vaciarLista(){
      inicio = null;
      fin = null;
      tamanio = 0;
   }
   
   public void agregar(int valor){
      Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
      //Y LUEGO??
      if(inicio == null){//LISTA VACIA? VERDADERO
         inicio = nuevo; //nuevo es el primer nodo de la lista
         fin = nuevo;
      }else{//LISTA DE NODOS
         
         fin.setSiguiente(nuevo);
         //conectar anterior
         nuevo.setPrevio(fin);
         fin = nuevo;
      }
      this.tamanio ++;
   }
   
   public void insertarEn(int valor, int posicion) {  

    int tama = longitud();

    //VALIDAR POSICION
    if (posicion < 0 || posicion > tama) {
        throw new RuntimeException( "La posicion " + posicion + " no es valida!!!" );
    }
    Nodo nuevo = new Nodo(valor);
    //DETERMINAR SI LA LISTA ESTA VACIA
    if (inicio == null) {
        inicio = nuevo;
        fin = nuevo;
    // INSERTAR AL INICIO
    } else if (posicion == 0) {
        nuevo.setSiguiente(inicio);
        inicio.setPrevio(nuevo);//linea nueva
        inicio = nuevo;
    //INSERTAR EN EL FINAL
    } else if(posicion == tama){
        nuevo.setPrevio(fin);
        fin.setSiguiente(nuevo);
        fin = nuevo;
        
        //INSERTAR EN CUALQUIER POSICION
    }else{
       Nodo temp = inicio;
       // Nos movemos hasta el nodo que actualmente
       // esta en la posicion donde queremos insertar
        for (int i = 0; i < posicion; i++) {
          temp = temp.getSiguiente();
       }
        //conectar con los otros nodos
        nuevo.setSiguiente(temp);
        nuevo.setPrevio(temp.getPrevio());
        // RECONECTAMOS LOS NODOS EXISTENTES CON NUEVO
        temp.getPrevio().setSiguiente(nuevo);
        temp.setPrevio(nuevo);
    }
    tamanio++; 
   }
   
   // O(N)
public void borrarEn(int posicion) {

    // 1. VERIFICAR SI LA LISTA ESTA VACIA
    if (inicio == null) {
        throw new RuntimeException(
                "No se puede borrar: la lista esta vacia"
        );
    }

    int tama = longitud();

    // 2. VALIDAR POSICION
    if (posicion < 0 || posicion >= tama) {
        throw new RuntimeException(
                "La posicion " + posicion + " no es valida!!!"
        );
    }

    // 3. SI SOLO HAY UN NODO
    if (inicio == fin) {

        inicio = null;
        fin = null;

    // 4. BORRAR EL PRIMER NODO
    } else if (posicion == 0) {

        inicio = inicio.getSiguiente();

        // El nuevo inicio ya no tiene nodo anterior
        inicio.setPrevio(null);

    // 5. BORRAR EL ULTIMO NODO
    } else if (posicion == tama - 1) {

        fin = fin.getPrevio();

        // El nuevo fin ya no tiene nodo siguiente
        fin.setSiguiente(null);

    // 6. BORRAR EN CUALQUIER OTRA POSICION
    } else {

        Nodo temp = inicio;
        int cont = 0;

        // Nos movemos hasta el nodo que queremos borrar
        while (cont < posicion) {
            temp = temp.getSiguiente();
            cont++;
        }

        // El nodo anterior se conecta con el siguiente
        temp.getPrevio().setSiguiente(temp.getSiguiente());

        // El nodo siguiente se conecta con el anterior
        temp.getSiguiente().setPrevio(temp.getPrevio());
    }

    // SE BORRO UN NODO
    tamanio--;
}
}
