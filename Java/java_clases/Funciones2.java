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
public class Funciones2 {
    final static int N=8;
    
    public static void main(String[]args){
    int[]numeros= new int [N];
    ingresar(numeros);
    muestra(numeros);
    }
    
    public static void ingresar(int[]array){
    int i;
    Scanner intro = new Scanner(System.in);
        for ( i = 0; i <N; i++) {
            System.out.println("Ingrese un numero para la celda "+i);
            array[i]=intro.nextInt();
        }
    }
    public static void muestra(int[] array){
    int i;
    System.out.println("Numeros en el arreglo");
        for ( i = 0; i <N; i++) {
            System.out.println("X["+ i+"] ="+array[i]);
        }
    }
}
