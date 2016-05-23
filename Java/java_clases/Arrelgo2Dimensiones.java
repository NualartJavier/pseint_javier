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
public class Arrelgo2Dimensiones {
    public static void main(String[]args){
        final int N=3;
    Scanner intro = new Scanner(System.in);
    int arr1[][]= new int [N][N];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Ingrese las notas para el alumno: "+(i+1));
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("Nota N°"+(j+1));
                arr1[i][j]= intro.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\n Alumno N°"+(i+1));
            for (int j = 0; j <arr1.length; j++) {
                System.out.print("\t Nota "+(j+1)+" : "+arr1[i][j]+"\t");
            }
        }
    }
}
