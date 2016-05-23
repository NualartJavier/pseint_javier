/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;
import java.util.Random;
/**
 *
 * @author juan
 */
public class OrdenarMatris {
     public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 30 + 1);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        //se usan dos for para el lugar que quedara fijo, y los otros dos para el que se movera
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[k].length; l++) {
                        if (matriz[i][j] < matriz[k][l]) {
                            int tmp = matriz[k][l];
                            matriz[k][l] = matriz[i][j];
                            matriz[i][j] = tmp;
                        }
                    }
                }
            }
        }
        
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
