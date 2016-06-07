package java_clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class EjerciciosFunciones2_2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int valor = intro.nextInt();
        int array[] = new int[valor];
        System.out.println("llene el arreglo con valores");
        funcion1(array, valor);
        funcion4(array,valor);
        System.out.println("El numero mayor es: "+array[valor-1]);
    }

    public static void funcion1(int array[], int valor) {
        Scanner intro = new Scanner(System.in);
        int i = 0;
        while (i < valor) {
            array[i] = intro.nextInt();
            i++;
        }
    }

    public static void funcion4(int array[], int valor) {
        int i = 0, j, x;
        while (i < valor) {
            j = i + 1;
            while (j < valor) {
                if (array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
                j++;
            }
            i++;
        }
    }
}
