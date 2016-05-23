/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class ClaseArreglo {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int N = 24, max = 0, j = 0, prom, sum = 0, min = 1000, k = 0;
        int temp[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese tempratura  para la hora " + (i + 1));
            temp[i] = intro.nextInt();
            sum = sum + temp[i];
            if (temp[i] > max) {
                max = temp[i];
                j = i + 1;
            }
            if (temp[i] < min) {
                min = temp[i];
                k = i + 1;
            }
        }
        prom = (int) sum / N;
        for (int i = 0; i < N; i++) {
            System.out.println("La temperatura para la hora " + (i + 1) + " fue :" + temp[i]);
        }
        System.out.println("La temperatura mayor fue ha la hora " + j + " con " + max);
        System.out.println("La temperatura menor fue ha la hora " + k + " con " + min);
        System.out.println("El promedio de las temperaturas es: " + prom);
        int temp1,g=0;
        System.out.println("Ingrese la temperatura para saber si está");
        temp1=intro.nextInt();
        for(int i=0;i<N;i++){
        if(temp1==temp[i]){
        g++;
        }
        }
        if(g>0){System.out.println("La temperatura si se encuentra en el arreglo "+g+" veces");
        }else{System.out.println("La temperatura no se encuentra");}
        
    }
}
