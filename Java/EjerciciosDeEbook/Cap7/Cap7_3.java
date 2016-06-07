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
public class Cap7_3 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int matri[][] = new int[10][10];
        int fila;
        llenar(matri);
        do{System.out.println("Ingrese la fila a la cual quiera sacar el promedio (entre 1 y 10)");
        fila = intro.nextInt();}while(fila<1||fila>10);
        System.out.println("El promedio para la fila "+fila+" es : "+promFila(matri,fila));
        System.out.println("La suma de la diagonal es : "+diagonal(matri));
    }

    public static void llenar(int matri[][]) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                do {
                    System.out.println("Ingrese un numero entre 0 y 250");
                    matri[i][j] = intro.nextInt();
                } while (matri[i][j] < 0 || matri[i][j] > 250);
            }
        }
    }

    public static int promFila(int matri[][],int fila) {
        int suma=0,prom;
        for (int i = 0; i <matri.length; i++) {
            suma=matri[fila][i]+suma;
        }
        prom=(int)suma/10;
        return prom;
    }
    public static int diagonal(int matri[][]){
        int suma=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j){
                suma=matri[i][j]+suma;
                }
            }
        }
        return suma;
    }
}
