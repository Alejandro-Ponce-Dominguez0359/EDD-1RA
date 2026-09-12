
package eva1_7_arreglos_size;


public class EVA1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
       
    
    int[] original = new int[10];
    for (int i = 0; i < original.length; i++) {
        original[i] = (int)(Math.random() * 100);
    }
    
   
    for (int i = 0; i < original.length; i++) {
        System.out.println("{" + original[i] + "}");
    }
    System.out.println();
    
    
    int[] copia = new int[5];  
    
   
    for (int i = 0; i < copia.length; i++) {
        copia[i] = original[i];
    }
    
 
    for (int i = 0; i < copia.length; i++) {
        System.out.println("{" + copia[i] + "}");
    }
    }
}   