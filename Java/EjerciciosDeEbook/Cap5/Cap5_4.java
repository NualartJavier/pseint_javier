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
public class Cap5_4 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num, a = 0, mult;
        System.out.println("Ingrese un numero");
        num = intro.nextInt();
        for (int i = 1; i < (num + 1); i++) {
            if (num % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            System.out.println("No es primo");
        } else {
            System.out.println("Si es primo");
        }

        for (int j = 1; j <= 10; j++) {
            mult = j * num;
            System.out.println(j + "*" + num + "=" + mult);
        }
    }
}
