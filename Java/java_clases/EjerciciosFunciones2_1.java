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
public class EjerciciosFunciones2_1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int valor, valor2;
        System.out.println("Ingrese el tamaño del arreglo");
        valor = intro.nextInt();
        int array[] = new int[valor];
        System.out.println("llene el arreglo con valores");
        funcion1(array, valor);
        System.out.println("Ingrese el numero a encontrar en el arreglo");
        valor2 = intro.nextInt();
        if(funcion3(array,valor,valor2)==true){
        System.out.println("El numero se encuentra en el arreglo");
        }else{System.out.println("El numero no se encuentra");}
    }

    public static void funcion1(int[] array, int valor) {
        int i = 0;
        Scanner objeto = new Scanner(System.in);
        while (i < valor) {
            array[i] = objeto.nextInt();
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
