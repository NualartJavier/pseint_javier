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
public class ArregloLoto {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int apU, apS, contC = 0, k;
        int vecUsuario[] = new int[6];
        int vecSorteo[] = new int[6];

        for (apU = 0; apU < 6; apU++) {
            do {
                System.out.println("Ingrese un numero " + (apU + 1));
                vecUsuario[apU] = intro.nextInt();
            } while (vecUsuario[apU] <= 0 || vecUsuario[apU] >= 37);
            k = 0;
            while (k < apU) {
                if (vecUsuario[apU] == vecUsuario[k]) {
                    apU--;
                }
                k++;
            }
        }
        for (apS = 0; apS < 6; apS++) {
            vecSorteo[apS] = rnd.nextInt(36) + 1;
            k = 0;
            while (k < apS) {
                if (vecSorteo[apS] == vecSorteo[k]) {
                    apS--;
                }
                k++;
            }
        }
        for (k = 0; k < 6; k++) {
            System.out.print(vecSorteo[k] + " - ");
            System.out.println();
        }
        for (apU = 0; apU < 6; apU++) {
            for (apS = 0; apS < 6; apS++) {
                if (vecUsuario[apU] == vecSorteo[apS]) {
                    contC++;
                }
            }
        }
        System.out.println("Coincidencias: " + contC);
        if (contC == 6) {
            System.out.println("Felicidades gano el loto");
        } else if (contC == 5) {
            System.out.println("5 coincidencias - $500000");
        } else {
            System.out.println("Siga participando");
        }
    }
}
