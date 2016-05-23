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
public class Cap6_2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        final int N = 12;
        int mayor = 0, num=0,sum=0;
        float prom;
        int mes[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el saldo para el mes " + (i + 1));
            mes[i] = intro.nextInt();
            sum=sum+mes[i];
            if (mes[i] > mayor) {
                mayor = mes[i];
                num = i;
            }
        }
        prom=(int)sum/N;
        System.out.println("El mes que tiene mayor saldo es: mes"+(num+1)+" con $"+mayor);
        System.out.println("El promedio anual es: $"+prom);
    }
}
