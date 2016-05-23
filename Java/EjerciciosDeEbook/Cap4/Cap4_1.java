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
public class Cap4_1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int max = 0, num;
        for (int cont = 1; cont <= 4; cont++) {
            System.out.println("Ingrese el numero " + cont);
            num = intro.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El numero mayor es: " + max);
    }
}
