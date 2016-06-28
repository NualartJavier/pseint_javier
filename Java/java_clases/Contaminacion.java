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
public class Contaminacion {

    public static void main(String[] args) {
        int i, j, opc = 0, dia;
        Scanner leer = new Scanner(System.in);
        double ptosCont[][] = new double[10][8];
        double lim[] = new double[7];
        ingLim(lim,leer);
        do {
            System.out.println("Bienvenido al sistema de monitoreo de contaminacion");
            System.out.println("1. Ingresar datos por punto de monitoreo");
            System.out.println("2. Mostrar datos de la semana");
            System.out.println("3. Mostrar dias en que se sobrepasó el limite por cada punto");
            System.out.println("4. Mostrar evento con mayor contaminación");
            System.out.println("5. Salir");
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                    ingDatos(ptosCont,leer);
                    calcCont(ptosCont);
                    break;
                case 2:
                    mostrar(ptosCont);break;
                case 3:
                    for (i = 0; i < 10; i++) {
                        System.out.println("El pto. " + (i+1) + "Sobrepaso el limite " + sobLim(ptosCont, lim, i) + " días");
                    }
                    ;
                    break;
                case 4:
                    mayorEvento(ptosCont, lim);
                    break;
                case 5:
                    System.out.println("Adios!!");
                    break;
                default:
                    break;
            }
        } while (opc != 5);
    }
    public static void ingLim(double lim [],Scanner leer){
        for (int i = 0; i <lim.length; i++) {
            do{
            System.out.println("Ingrese el limite para el dia "+(i+1));
            lim[i]=leer.nextDouble();
            }while(lim[i]<0);
        }
        System.out.println("----------------------------------------------");
    }
    public static void ingDatos(double ptosCont[][],Scanner leer){
        for (int i = 0; i <ptosCont.length; i++) {
            System.out.println("Punto N°"+(i+1));
            for (int j = 0; j <ptosCont[j].length-1; j++) {
                do{
                System.out.println("Ingrese el nivel de contaminacion del dia "+(j+1));
                ptosCont[i][j]=leer.nextDouble();
                }while(ptosCont[i][j]<0);
            }
        }
        System.out.println("----------------------------------------------");
    }
    public static void calcCont(double ptosCont[][]){
        for (int i = 0; i <ptosCont.length; i++) {
            double suma=0;
            for (int j = 0; j <ptosCont[j].length-1; j++) {
                suma=suma+ptosCont[i][j];
                ptosCont[i][7]=suma;
            }
        }
    }
    public static void mostrar(double ptosCont[][]){
        for (int i = 0; i <ptosCont.length; i++) {
            System.out.println("Punto N°"+(i+1));
            for (int j = 0; j <ptosCont[j].length-1; j++) {
                System.out.print("Dia "+(j+1)+": "+ptosCont[i][j]+"\t");
            }
            System.out.print("Total semanal "+ptosCont[i][7]);
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
    public static int sobLim(double ptosCont[][],double lim[],int i){
        int cont=0;
        for (int j = 0; j <ptosCont[j].length-1; j++) {
            if(ptosCont[i][j]>lim[j]){
            cont++;
            }
        }
        return cont;
    }
    public static void mayorEvento(double ptosCont[][],double lim[]){
        int punto=0;
        for (int i = 0; i <ptosCont[i].length-1; i++) {
            double max=0;
            System.out.println("Dia "+(i+1));
            for (int j = 0; j <ptosCont.length; j++) {
                if(ptosCont[j][i]>max){
                max=ptosCont[j][i];
                punto=j;
                }
            }
         System.out.println("El punto que tuvo mayor contaminacion respecto al limite fue  : "+(punto+1));
        }
        System.out.println("----------------------------------------------");
    }
}
