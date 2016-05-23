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
public class Cap4_3 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        float nota;

        do {
            System.out.println("Ingrese la nota (1.0-7.0)");
            nota = intro.nextFloat();
            if (nota < 1 || nota > 7) {
                System.out.println("Nota ingresada fuera del rango, intente denuevo");
            }
        } while (nota < 1 || nota > 7);

        if (nota < 4.0) {
            System.out.println("Nota conceptual: Insuficiente");
        } else if (nota < 5.0) {
            System.out.println("Nota conceptual: Suficiente");
        } else if (nota < 6.0) {
            System.out.println("Nota conceptual: Bien");
        } else {
            System.out.println("Nota conceptual: Muy bien");
        }
    }
}
