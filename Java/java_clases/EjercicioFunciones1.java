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
public class EjercicioFunciones1 {

    public static void main(String[] args) {
        int i;
        boolean op;
        String resp = "";
        float ptjes[] = new float[6];
        float matrizPorc[][] = new float[10][7];
        Scanner intro = new Scanner(System.in);
        llenarMatrizPorc(matrizPorc, intro);
        do {
            leerPtjes(ptjes);
            for (i = 0; i < 10; i++) {
             if(calcPond(ptjes,matrizPorc,i)){
             System.out.println("puede postular a la carrera"+(i+1));
             }else{System.out.println("Tu puntaje no alcanza gg wp ");}
            }
            do{
            op=false;    
            System.out.println("Desea otra simulación: ");
            resp=intro.next();
            }while(op==false);
        } while(resp.equals("no")!=true);
    }

    public static void llenarMatrizPorc(float matrizPorc[][], Scanner intro) {
        int j=0;
        for (int i = 0; i < matrizPorc.length; i++) {
            System.out.println("Carrera N° "+(i+1));
            for ( j = 0; j <matrizPorc[j].length; j++) {
                porc(j);
                matrizPorc[i][j] = intro.nextFloat();
            }
        }
    }

    public static void leerPtjes(float ptjes[]) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < ptjes.length; i++) {
            puntj(i);
            ptjes[i] = intro.nextFloat();
        }
    }
    public static boolean calcPond(float ptjes[],float matrizPorc[][], int i){
        float suma=0;
        for (int k = 0; k <matrizPorc[k].length-1; k++) {
                suma= ((matrizPorc[i][k])/100*ptjes[k])+suma;
        }
        if(suma>matrizPorc[i][7]){
        return true;
        }else return false;
    }
    
    public static void porc(int j) {
        switch (j) {
            case 0:
                System.out.println("Ingrese el porcentaje NEM");
                break;
            case 1:
                System.out.println("Ingrese el porcentaje Ranking");
                break;
            case 2:
                System.out.println("Ingrese el porcentaje de Lenguaje y comunicacion");
                break;
            case 3:
                System.out.println("Ingrese el porcetanje de prueba de matematicas ");
                break;
            case 4:
                System.out.println("Ingrese el porcentaje de Historia y Ciencias sociales ");
                break;
            case 5:
                System.out.println("Ingrese el porcentaje de Ciencas ");
                break;
            case 6:
                System.out.println("Ingrese el puntaje del ultimo matriculado");
                break;
        }
    }

    public static void puntj(int i) {
        switch (i) {
            case 0:
                System.out.println("Ingrese su puntaje NEM");
                break;
            case 1:
                System.out.println("Ingrese su puntaje Ranking");
                break;
            case 2:
                System.out.println("Ingrese su punjate de Lenguaje y comunicacion");
                break;
            case 3:
                System.out.println("Ingrese su puntaje de prueba de matematicas ");
                break;
            case 4:
                System.out.println("Ingrese su puntaje de Historia y Ciencias sociales ");
                break;
            case 5:
                System.out.println("Ingrese su puntaje de Ciencas ");
                break;
        }

    }
}
