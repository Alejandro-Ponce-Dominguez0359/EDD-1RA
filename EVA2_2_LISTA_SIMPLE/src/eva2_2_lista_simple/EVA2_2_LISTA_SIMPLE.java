
package eva2_2_lista_simple;

import java.util.Scanner;

public class EVA2_2_LISTA_SIMPLE {

   
  public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      
      ListaSimple lista = new ListaSimple();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.imprimir();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      System.out.println("valor del Nodo: " + lista.valorEn(0));
      
      System.out.println("Primera posicion del 100: " + lista.encontrarEn(100));
      System.out.println("Primera posicion del 200: " + lista.encontrarEn(200));
      System.out.println("Primera posicion del 999: " + lista.encontrarEn(999));
      System.out.println("Primera posicion del 700: " + lista.encontrarEn(700));
      
      lista.insertarEn(9999, 3);
      
      System.out.println("Borrar posicion 0:");
      lista.borrarEn(0);
      lista.imprimir();
      System.out.println("Borrar posicion 3:");
      lista.borrarEn(3);
      lista.imprimir();
      
      System.out.println(lista.longitud());
      
      System.out.println("imprecion inversa:");
      lista.imprimirInverso();
      
      
      lista.vaciarLista();
      lista.imprimir();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      
      
      
   }
   
}
