/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.2
 */
package java_clases;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class TallerDeEntrada {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int cantE;
        double x = 0, y = 0, x1, y1, d, dT = 0, comb;
        do {
            System.out.println("Ingrese la cantidad de entregas a realizar el dia de hoy");
            cantE = intro.nextInt();
            if (cantE < 0) {
                System.out.println("La cantidad ingresada no es valida, intene denuevo");
            }
        } while (cantE < 0);
        for (int i = 1; i <= cantE; i++) {
            System.out.println("Ingresar el punto carteciano (x,y) par el envio n°" + i);
            System.out.println("Ingrese el valor de x");
            x1 = intro.nextDouble();
            System.out.println("Ingrese el valor de y");
            y1 = intro.nextDouble();
            d = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow(y1 - y, 2));
            dT = dT + d;
            x = x1;
            y = y1;
        }
        if (dT <= 750) {
            comb = (15 * dT);
            System.out.println("El camion necesitara: " + comb + "ltrs");
        } else {
            System.out.println("El estanque del camion no tiene la capacidad");
        }
    }
}
