
package eva1_9_matrices;


public class EVA1_9_MATRICES {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [5][3];
        System.out.println("matriz = " + matriz);
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("matriz[0]= " +matriz[0]);
        System.out.println("matriz[0]= " +matriz[0].length);
        System.out.println("matriz[0]= " +matriz[1]);
        System.out.println("matriz[0]= " +matriz[1].length);
        
      for (int i = 0; i < matriz.length; i++) { //PRIMER DIMENSION
    for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSION --> COLUMNA
        matriz[i][j] = (int)(Math.random() * 100);
    }
}

for (int i = 0; i < matriz.length; i++) { //PRIMER DIMENSION --> FILAS
    for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSION --> COLUMNA
        System.out.print("[" + matriz[i][j] + "]");
    }
    System.out.println("");
}
}
}

