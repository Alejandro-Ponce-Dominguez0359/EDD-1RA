
package eva2_7_grafo;


public class EVA2_7_GRAFO {

  
   public static void main(String[] args) {
    
        ListaGrafo<Integer> lista = new ListaGrafo<Integer>();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        System.out.println(" Original:");
        lista.imprimir();

        System.out.println("Longitud: " + lista.longitud());

        //  valorEn
        System.out.println("Valor en posicion 0: " + lista.valorEn(0));
        System.out.println("Valor en posicion 2: " + lista.valorEn(2));

        // encontarEn
        System.out.println("El 300 esta en la posicion: "+ lista.encontrarEn(300));

        System.out.println("El 999 esta en la posicion: "+ lista.encontrarEn(999));

        // insertarEn
        lista.insertarEn(250, 2);
        System.out.println("despues de insertar 250 lista en posicion 2:");
        lista.imprimir();

        // BorrarEn
        lista.borrarEn(1);
        System.out.println("despues de borrar la posicion1:");
        lista.imprimir();

        // Imprimir inverso
        System.out.println("lista en inverso:");
        lista.imprimirInv();

        // lista vacia
        System.out.println("Lista vacia: " + lista.listaVacia());

        //vaciar lista
        lista.vaciarLista();
        System.out.println("despues de vaciar lista:");
        lista.imprimir();
        System.out.println("Longitud: " + lista.longitud());
        System.out.println("Lista vacia: " + lista.listaVacia());
         
   }
   
}
