/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeEbook;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Cap5_7 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int equi, contE1 = 0, contE2 = 0, contE3 = 0, premE1 = 0, premE2 = 0, premE3 = 0, prem = 100000;
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("lugar n°" + cont);
            System.out.println("Ingrese equipo al que pertenesca(1)(2)(3)");
            equi = intro.nextInt();
            switch (equi) {
                case 1:
                    contE1++;
                    if (prem > 0) {
                        premE1 = premE1 + prem;
                    }
                    break;
                case 2:
                    contE2++;
                    if (prem > 0) {
                        premE2 = premE2 + prem;
                    }
                    break;
                case 3:
                    contE3++;
                    if (prem > 0) {
                        premE3 = premE3 + prem;
                    }
                    break;
            }
            if (cont < 4 && cont > 0) {
                prem = prem - 20000;
                if (cont < 7 && cont > 3) {
                    prem = 40000;
                } else {
                    prem=20000;
                }
            }
        }
        System.out.println("Cantidad de corredores por equipo, dentro de las primeras 10 posiciones");
        System.out.println("Equipo 1: " + contE1);
        System.out.println("Equipo 2: " + contE2);
        System.out.println("Equipo 3: " + contE3);
        System.out.println("Cantidad total en premios por equipo");
        System.out.println("Equipo 1: " + premE1);
        System.out.println("Equipo 2: " + premE2);
        System.out.println("Equipo 3: " + premE3);
    }
}
