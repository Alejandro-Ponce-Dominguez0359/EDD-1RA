/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_dimensiones;


public class EVA1_11_DIMENSIONES {


    public static void main(String[] args) {
       
        int[][] matriz;
    matriz = new int[3][];
    
    //cada fila tendrá diferente cantidad de columnas:
    matriz[0] = new int[5];
    matriz[1] = new int[10];
    matriz[2] = new int[3];
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = (int)(Math.random() * 100);
        }
    }
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println("");
    }
}
}
