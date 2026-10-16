
package eva2_2_lista_simple;


public class ListaSimple {
   private Nodo inicio;
   private Nodo fin;
   private int tamanio; // GUARDA LA CANTIDAD DE NODOS
   
   
   public ListaSimple(){
      inicio = null; //al crear la lista, se crea vacia
      fin = null;
      tamanio = 0;
   }
   //siempre se agregan al final de la lista los nodos 
   //VERSION 1: O(N) -- > SE AGREGA AL FINAL. SE RECORREN TODOS
   //VERSION MEJORADA: O(1)
   public void agregar(int valor){
      Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
      //Y LUEGO??
      if(inicio == null){//LISTA VACIA? VERDADERO
         inicio = nuevo; //nuevo es el primer nodo de la lista
         fin = nuevo;
      }else{//LISTA DE NODOS
         //mover al final 
         Nodo temp = inicio;
         /*
         while(temp.getSiguiente() !=null){
            temp = temp.getSiguiente();
         }
         temp.setSiguiente(nuevo);//conecta nuevo al final de la lista */
         fin.setSiguiente(nuevo);
         fin = nuevo;
      }
      tamanio ++;
   }
   //O(N)
   public void imprimir(){
      Nodo temp = inicio;
      while(temp != null){
         System.out.println("[" + temp.getValor() + "]");
         temp = temp.getSiguiente();
      }
      
   }
   //O(1)
   public int longitud(){
      return tamanio;
      //O(N)
      /*int cont = 0;
      Nodo temp = inicio;
      while(temp != null){
         cont++;
         temp = temp.getSiguiente();
      }
      return cont;*/
   }
  // O(1)
   public boolean listaVacia(){
      if(inicio == null){
        return true;
      }else{
         return false;
      }
   }
   //O(1)
   public void vaciarLista(){
      inicio = null;
      fin = null;
      tamanio = 0;
   }
   //VALIDAR: posiciones que tengan un valor valido
                                       //throws
   public int valorEn(int posicion) throws RuntimeException {
      //excepción
      //VALIDAR posicion
      int tama = longitud();
     if (posicion >= 0 && posicion < tama) { // posición válida

        Nodo temp = inicio;

        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }

        return temp.getValor();

      }else{
         throw new RuntimeException(
                "La posicion " + posicion + " no es valida!!!"
        );
      }

   }
   // REGRESA LA PRIMER APARICION DEL VALOR EN LA LISTA
   // REGRESA LA POSICION
   // O(N)
   public int encontrarEn(int valor){  //PRIMERO
      Nodo temp = inicio;
      int posicion = 0 ;
      
      while(temp != null){
          
         if(temp.getValor() == valor){
            return posicion;
         } 
         temp = temp.getSiguiente();
         posicion ++;
      }
      
      return -1;
   }
   
   public void insertarEn(int valor, int posicion) {  //SEGUNDO

    int tama = longitud();

    // 1. VALIDAR POSICION
    if (posicion < 0 || posicion > tama) {
        throw new RuntimeException( "La posicion " + posicion + " no es valida!!!" );
    }

    Nodo nuevo = new Nodo(valor);
    // 2. DETERMINAR SI LA LISTA ESTA VACIA
    if (inicio == null) {

        inicio = nuevo;
        fin = nuevo;

    // 3. INSERTAR AL INICIO
    } else if (posicion == 0) {
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    // 4. INSERTAR EN CUALQUIER OTRA POSICION
    } else {
        Nodo temp = inicio;
        // Nos movemos hasta el nodo anterior
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        // Nuevo apunta al que estaba despues
        nuevo.setSiguiente(temp.getSiguiente());
        // El anterior apunta al nuevo
        temp.setSiguiente(nuevo);
        // Si se inserto al final, actualizamos fin
        if (posicion == tama) {
            fin = nuevo;
        }
        tamanio++;
    }
   }
   
   //O(N)
   public void borrarEn(int posicion){  //TERCERO
      
      //VER SI LA LISTA ESTA VACIA
      if (inicio == null){
          throw new RuntimeException("No se puede borrar: la lista esta vacia");
      }
      
      int tama = longitud();
      
      //VALIDACION DE POSICIONES
      
      if(posicion < 0 || posicion >= tama){
         throw new RuntimeException("La posicion " + posicion + " no es valida!!!");
      }
      
      //si solo existe un nodo
      if(inicio == fin){
         inicio = null;
         fin = null;
         //borrar el primer nodo
      }else if (posicion == 0){
         inicio = inicio.getSiguiente();
         
         //borrar en cualquier otra posicion
      }else{
         Nodo temp = inicio;
         
         //llegar al nodo anterior al que borrar
         for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
         }
         
         //nodo que se va a borrar
         Nodo borrar = temp.getSiguiente();
        // Reconectamos con el nodo que sigue
        temp.setSiguiente(borrar.getSiguiente());
        // Si borramos el ultimo nodo, actualizamos fin
        if (borrar == fin) {
            fin = temp;
        }
      }
      
      tamanio --;
   }
   
   //O(N2)
 
      public void imprimirInverso() {
         for (int i = longitud() - 1; i >= 0; i--) {
            System.out.println("[" + valorEn(i) + "]");
    }
         }

}

//modificar longitud para que sea O(1)
//Imprimir el orden inverso O(N2)