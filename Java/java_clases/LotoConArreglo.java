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
public class LotoConArreglo {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int numI, aciert = 0, op,j;
        int num[] = new int[6];
        int numIn[]=new int [6];
        j=0;
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (rnd.nextDouble() * 36 + 1);
            while(j<i){
             if(num[i]==num[j]){
             i--;
             }
             j++;
            }
        }
        System.out.println("Su carton lo desea (1)numeros aleatorios (2)numeros elegidos");
        op = intro.nextInt();
        switch (op) {
            case 1:
                int nganad[] = new int[6];
                for (int a = 0; a < 6; a++) {
                    do {
                        nganad[a] = (int) (rnd.nextDouble() * 36 + 1);
                    } while (nganad[a] != nganad[a]);
                    for (int k = 0; k < 6; k++) {
                        if (nganad[a] == num[k]) {
                            aciert++;
                        }
                    }
                }
                ;
                break;
            case 2:
                for (j = 0; j < 6; j++) {
                    System.out.println("Ingrese el numero " + (j + 1));
                    numIn[j] = intro.nextInt();
                    for (int k = 0; k < 6; k++) {
                        if (2 == num[k]) {
                            aciert++;
                        }
                    }
                   
                };break;
        }
        System.out.println("Usted obtuvo " + aciert + " Aciertos");
    }

}
