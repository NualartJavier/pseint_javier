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
public class EjerciciosFunciones2_3 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);    
    System.out.println("Ingrese el tamaño de los arrelgos");
    int valor=intro.nextInt();
    int array1[]= new int [valor];
    int array2[]=new int [valor];
    System.out.println("Ingrese los valores de el arreglo 1");
    funcion1(array1,valor);
    System.out.println("Ingrese los valores de el arreglo 2");
    funcion1(array2,valor);
    int valor2;
    System.out.println("Datos que tienen en comun ambos arreglos");
        for (int i = 0; i <array1.length; i++) {
            valor2=array1[i];
            if(funcion3(array2,valor,valor2)==true){
            System.out.print(valor2+"\t");
            }
        }
    }
    public static void funcion1(int array1[],int valor){
    Scanner intro = new Scanner(System.in);
        int i = 0;
        while (i < valor) {
            array1[i] = intro.nextInt();
            i++;
        }
    }
    public static boolean funcion3(int array[], int valor, int valor2) {
        int i = 0;
        while (i < valor) {
            if (array[i] == valor2) {
                return true;
            }
            i++;
        }
        return false;
    }
}
