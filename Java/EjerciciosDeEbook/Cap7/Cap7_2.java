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
public class Cap7_2 {

    public static void main(String[] args) {
        int[] horas = new int[10];
        int[] horasExt = new int[10];
        horas(horas);
        pago(horas, horasExt);
        sueldo(horasExt);
    }

    public static void horas(int[] horas) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < horas.length; i++) {
            System.out.println("Trabajador n° " + (i + 1));
            do {
                System.out.println("Ingrese la cantidad de horas trabajadas (mayor a 40)");
                horas[i] = intro.nextInt();
            } while (horas[i] < 40);
        }
    }

    public static void pago(int[] horas, int[] horasExt) {
        int hrs;
        for (int i = 0; i < horas.length; i++) {
            hrs = horas[i];
            horasExt[i] = hrs - 40;
        }
    }

    public static void sueldo(int[] horasExt) {
        int salario, pago;
        for (int i = 0; i < horasExt.length; i++) {
            if (horasExt[i] < 4) {
                pago = 2000;
                salario = 200000 + (horasExt[i] * pago);
            } else if (horasExt[i] <= 7) {
                pago = 3000;
                salario = 200000 + (horasExt[i] * pago);
            } else {
                pago = 3500;
                salario = 200000 + (horasExt[i] * pago);
            }
            System.out.println("El sueldo del trabajador " + (i + 1) + " es :" + salario);
        }
    }
}
