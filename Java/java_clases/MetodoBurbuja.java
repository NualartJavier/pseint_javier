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
public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int num[] = new int[6];
        int j = 0, aux;
        boolean cambio;
        for (int i = 0; i < 6; i++) {
            num[i] = rnd.nextInt(20) + 1;
            System.out.print(num[i] + " ");
        }
        System.out.println();
        do {
            j++;
            cambio = false;
            for (int k = 0; k < 5; k++) {
                if (num[k] > num[k + 1]) {
                    aux = num[k];
                    num[k] = num[k + 1];
                    num[k + 1] = aux;
                    cambio = true;
                }
            }
        } while (j < 6 || cambio == true);
        for(int i=0;i<6;i++){
            System.out.print(num[i]+" ");
        }
    }
}
