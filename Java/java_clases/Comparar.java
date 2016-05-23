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
public class Comparar {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int cant = 0, num = 0, max = 0;
        System.out.println("Ingrese la cantidad de numeros");
        cant = intro.nextInt();
        for (int i = 1; i <= cant; i++) {
            System.out.println("Ingrese numero " + i);
            num = intro.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El numero mayor es " + max);
    }
}
