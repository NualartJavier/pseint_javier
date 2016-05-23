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

public class Arreglos1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int N = 12, sum = 0, max = 0, contM = 0;
        int mes[] = new int[N];
        int prom;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el saldo para el mes N°" + (i + 1));
            mes[i] = intro.nextInt();
            sum = sum + mes[i];
            if (mes[i] > max) {
                max = mes[i];
                contM = i;
            }
        }
        prom = (int) sum / N;
        System.out.println("El promedio de saldo anual es: " + prom);
        System.out.println("El mes que tiene el saldo mayor es: " + contM);
    }
}
