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
public class EjerciciosFunciones3 {

    public static void main(String[] args) {
        int pisos[] = new int[8];
        int matri[][] = new int[32][12];
        llenado(matri);
        System.out.println("El consumo anual de agua en $ de el edificio es: " + (consumoPago(matri)));
        System.out.println("El consumo anual en m3 del edificio es: " + (consumoAnual(matri)));
        System.out.println("El mes con mayor consumo fue el N°: " + (mayorMes(matri) + 1));
        for (int i = 0; i < matri[i].length; i++) {
            for (int j = 0; j < matri.length; j++) {
                if (i <= 4) {
                    pisos[0] = matri[j][i] + pisos[0];
                }
                if (i > 4 && i <= 8) {
                    pisos[1] = matri[j][i] + pisos[1];
                }
                if (i > 8 && i <= 12) {
                    pisos[2] = matri[j][i] + pisos[2];
                }
                if (i > 12 && i <= 16) {
                    pisos[3] = matri[j][i] + pisos[3];
                }
                if (i > 10 && i <= 20) {
                    pisos[4] = matri[j][i] + pisos[4];
                }
                if (i > 20 && i <= 24) {
                    pisos[5] = matri[j][i] + pisos[5];
                }
                if (i > 24 && i <= 28) {
                    pisos[6] = matri[j][i] + pisos[7];
                }
                if (i > 28 && i <= 32) {
                    pisos[7] = matri[j][i] + pisos[7];
                }
            }
        }
        System.out.println("piso             Consumo anual");
        System.out.println("--------------------------------");
        System.out.println("1                "+pisos[0]);
        System.out.println("2                "+pisos[1]);
        System.out.println("3                "+pisos[2]);
        System.out.println("4                "+pisos[3]);
        System.out.println("5                "+pisos[4]);
        System.out.println("6                "+pisos[5]);
        System.out.println("7                "+pisos[6]);
        System.out.println("8                "+pisos[7]);
    }

    public static void llenado(int matri[][]) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < matri[i].length; i++) {
            System.out.println("Mes N°" + (i + 1));
            for (int j = 0; j < matri.length; j++) {
                System.out.println("Ingrese el consumo de agua para el departamento N°" + (j + 1));
                matri[j][i] = intro.nextInt();
            }
        }
    }

    public static int consumoAnual(int matri[][]) {
        int suma = 0;
        for (int i = 0; i < matri[i].length; i++) {
            for (int j = 0; j < matri.length; j++) {
                suma = matri[j][i] + suma;
            }
        }
        return suma;
    }

    public static int consumoPago(int matri[][]) {
        int total = 0;
        for (int i = 0; i < matri[i].length; i++) {
            for (int j = 0; j < matri.length; j++) {
                if (matri[j][i] <= 5) {
                    total = matri[j][i] * 100 + total;
                } else if (matri[j][i] < 12 && matri[j][i] > 5) {
                    total = (matri[j][i] * 100) + 2000 + total;
                } else {
                    total = (matri[j][i] * 120) + (matri[j][i] / 10);
                }
            }
        }
        return total;
    }

    public static int mayorMes(int matri[][]) {
        int mes = 0, mayor = 0;
        for (int i = 0; i < matri[i].length; i++) {
            int suma = 0;
            for (int j = 0; j < matri.length; j++) {
                suma = matri[j][i] + suma;
            }
            if (suma > mayor) {
                mayor = suma;
                mes = i;
            }
        }
        return mes;
    }

}
