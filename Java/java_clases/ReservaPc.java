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
public class ReservaPc {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int pc[] = new int[5];
        for (int i = 0; i < 5; i++) {
            pc[i] = 0;
        }
        int op, pcE, z = 0, pcL,op1=0;
        do{
        System.out.println("Ingrese la opcion que desee realizar");
        System.out.println("1) reservar un pc");
        System.out.println("2) liberar un pc");
        System.out.println("3) Salir");
        op = intro.nextInt();
        switch (op) {
            case 1:
                do {
                    do{System.out.println("Ingrese el numero del pc que desea reservar");
                    System.out.println("1)PC1 2)PC2 3)PC4 4)PC5 5)PC6");
                    pcE = intro.nextInt();}while(pcE<1||pcE>6);
                    
                        if (pc[pcE - 1] == 0) {
                            System.out.println("El pc esta disponible, reservacion realizada");
                            pc[pcE-1] = 1;
                            z = 1;
                        } else {
                            z = 2;
                            System.out.println("El pc no esta disponible, vuelva a intentarlo");
                        }
                    
                } while (z == 2);
                break;
            case 2:
                do {
                    do{System.out.println("Ingrese el numero del pc que desea liberar");
                    System.out.println("1)PC1 2)PC2 3)PC4 4)PC5 5)PC6");
                    pcL = intro.nextInt();}while(pcL<1||pcL>6);
                    
                        if (pc[pcL - 1] == 1) {
                            z = 1;
                            System.out.println("El pc seleccionado ha sido liberado");
                            pc[pcL-1] = 0;
                        } else {
                            System.out.println("El pc seleccionado ya esta liberado");
                            z = 2;
                        }
                    
                } while (z == 2);break;
            case 3: System.out.println("Cerrando el programa.... Adios");
            op1=2;break;
        }
        }while(op1!=2);
    }
}
