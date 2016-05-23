/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerDeEntrada2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juan
 */
public class TallerDeEntrada5 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int N, j = 0, aux, mas;
        boolean cambio;
        System.out.println("Ingrese la cantidad de n° del arreglo");
        N = intro.nextInt();
        int numeros[] = new int[N];
        int pares[] = new int[N];
        int imp[] = new int[N];
        for (int i = 0; i < N; i++) {
            do {
                numeros[i] = rnd.nextInt(20) + 1;
                System.out.println("N°" + (i + 1) + " = " + numeros[i]);
            } while (numeros[i] > 20 || numeros[i] < 0);
        }
        for (int l = 0; l < N; l++) {
            for (int i = 0; i < N; i++) {
                if (numeros[i] == l) {

                }
            }
        }
        do {
            j++;
            cambio = false;
            for (int k = 0; k < N - 1; k++) {
                if (numeros[k] < numeros[k + 1]) {
                    aux = numeros[k];
                    numeros[k] = numeros[k + 1];
                    numeros[k + 1] = aux;
                    cambio = true;
                }
            }
        } while (j < N || cambio == true);
        for (j = 0; j < N; j++) {
            System.out.print(numeros[j] + " ");
        }
        System.out.println();
        for(int i=0;i<N;i++){
        if(numeros[i]%2==0){
        pares[i]=numeros[i];
        }else{
        imp[i]=numeros[i];
        }
        }
        
        System.out.println("Arreglo de pares");
        for(int i=0;i<N;i++){
        if(imp[i]==0){int k=0;
        }else{System.out.print(pares[i]+" ");}
        }
        System.out.println("Arreglo de impares");
        for(int i=0;i<N;i++){
        System.out.print(imp[i]+" ");
        }
    }
}
