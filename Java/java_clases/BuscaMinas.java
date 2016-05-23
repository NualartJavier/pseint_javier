/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juan
 */
public class BuscaMinas {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int N = 6, M = 7, y, x;
        int matri[][] = new int[N][M];
        int tab[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tab[i][j] = 0;
                matri[i][j] = 0;
            }
        }
        for (int i = 0; i < 4; i++) {
            y = (int) (rnd.nextDouble() * 1 + 7);
            x = (int) (rnd.nextDouble() * 1 + 6);
            if (matri[x - 1][y - 1] == 0) {
                matri[x - 1][y - 1] = 5;
            } else {
                i--;
            }
        }
    //jugar
    System.out.println("Ingrese las coordenadas (x;y) donde descubir");
    System.out.println("(1-6) X: ");
    x=intro.nextInt();
    System.out.println("(1-7) Y: ");
    y=intro.nextInt();
    if(matri[x-1][y-1]==0){
    
    }
    }
}
