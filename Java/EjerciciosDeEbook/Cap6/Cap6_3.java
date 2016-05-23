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
public class Cap6_3 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        final int N = 30;
        int max = 0, dia=0, sum = 0,j=0,remu;
        int abril[] = new int[N];
        int ventasInferiores[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese las ventas del dia " + (i + 1));
            abril[i] = intro.nextInt();
            if (abril[i] > max) {
                max = abril[i];
                dia = i;
            }
            if(abril[i]<10000){
                ventasInferiores[j]=i;
            j++;
            }
            sum = sum + abril[i];
        }
        remu=sum/100;
     System.out.println("El dia en que se logro mayor venta fue "+(dia+1));
     System.out.println("Las ventas totales en el mes fue de $"+sum);
     if(j>0){
     System.out.println("Dias en que las ventas son menores a $10.000");
     for(int k=0;k<j;k++){
         System.out.println("dia "+(ventasInferiores[k]+1));
     }
     }
     System.out.println("La remuneracion que recibe es de : $"+remu);
    }
}
