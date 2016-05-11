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
public class Cap5_6 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int valorB = 300, op, valor = 0, op2, cantIng;
        System.out.println("Ingrese el tipo de sándwich");
        System.out.println("(1)churrasco");
        System.out.println("(2)lomode cerdo");
        System.out.println("(3)ave");
        System.out.println("(4)atun");
        op = intro.nextInt();
        switch (op) {
            case 1:
                valor = valorB + 400;
                break;
            case 2:
                valor = valorB + 350;
                break;
            case 3:
                valor = valorB + 250;
                break;
            case 4:
                valor = valorB + 350;
                break;
        }
        System.out.println("Desea agregar uno de los siguientes ingredientes (1)Si(2)No:");
        System.out.println("-lechuga-tomate-champignon-palta-palmitos-queso-tocino-jamon-huevo frito-cebolla");
        op2 = intro.nextInt();
        if (op2 == 1) {
            System.out.println("Ingrese cantidad de ingredientes ha agregar");
            cantIng = intro.nextInt();
            if (cantIng > 3) {
                if (cantIng > 5) {
                    valor = valor + (cantIng * 100);
                } else {
                    valor = valor + (cantIng * 120);
                }
            } else {
                valor = valor + (cantIng * 150);
            }
        }
     System.out.println("El valor total del sándwich es: "+valor);
    }
}
