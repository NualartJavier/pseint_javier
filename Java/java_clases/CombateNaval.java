/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juan
 */
public class CombateNaval {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        final int N = 5;
        int bUs = 5, bPc = 5, x, y, p1, p2;
        boolean dispUs, dispPc;
        int pc[][] = new int[N][N];
        int us[][] = new int[N][N];
        for (int i = 0; i < pc.length; i++) {
            for (int j = 0; j < pc.length; j++) {
                pc[i][j] = 0;
            }
        }
        for (int i = 0; i < us.length; i++) {
            for (int j = 0; j < us.length; j++) {
                us[i][j] = 0;
            }
        }
        System.out.println("Posicionar los barcos en el tablero (5;5)");
        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese la posicion para el barco N°" + (i + 1) + "(x,y)");
            do {
                System.out.println("X:");
                x = intro.nextInt();
            } while (x < 1 || x > 5);
            do {
                System.out.println("Y:");
                y = intro.nextInt();
            } while (y < 1 || y > 5);
            if (us[x - 1][y - 1] != 1) {
                us[x - 1][y - 1] = 1;
                System.out.println("El barco esta posicionado");
            } else {
                System.out.println("La posicion esta ocupada, intente denuevo");
                i--;
            }
        }
        System.out.println("Tablero del jugador");
        for (int i = 0; i < us.length; i++) {
            for (int j = 0; j < us.length; j++) {
                System.out.print(us[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("Preparando tablero de la computadora.....");
        for (int i = 0; i < 5; i++) {
            x = (int) (rnd.nextDouble() * 5 + 1);
            y = (int) (rnd.nextDouble() * 5 + 1);
            if (pc[x - 1][y - 1] != 1) {
                pc[x - 1][y - 1] = 1;
            } else {
                i--;
            }
        }
        System.out.println("Tablero de la computadora");
        for (int i = 0; i < us.length; i++) {
            for (int j = 0; j < us.length; j++) {
                System.out.print(pc[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("Que comienze el combate....");

       do{
        System.out.println("Es tu turno");
        do {
            System.out.println("Ingresa la cordenada en la que quieres disparar");
            System.out.println("X");
            p1 = intro.nextInt();
            System.out.println("Y");
            p2 = intro.nextInt();
            dispUs = true;
            if (pc[p1 - 1][p2 - 1] == 1) {
                System.out.println("El disparo fue exitoso, has hundido un barco enemigo");
                pc[p1 - 1][p2 - 1] = 2;
                bPc--;
            } else if (pc[p1 - 1][p2 - 1] == 2) {
                System.out.println("Ya se realizo un disparo a esta coordenada, intentalo denuevo");
                dispUs = false;
            } else {
                System.out.println("Disparo errado");
                pc[p1 - 1][p2 - 1] = 2;
            }
            System.out.println("Barcos tuyos : " + bUs + "/ Barcos enemigos : " + bPc);
        } while (dispUs == false);
        //Juega la maquina
        System.out.println("Turno de la computadora");
        do{
        p1=(int) (rnd.nextDouble()*5+1);
        p2=(int) (rnd.nextDouble()*5+1);
        dispPc=true;
        if(us[p1-1][p2-1]==1){
        System.out.println("El enemigo te hundio un barco");
        bUs--;
        us[p1-1][p2-1]=2;
        }else{
        if(us[p1-1][p2-1]==0){
        us[p1-1][p2-1]=2;
        System.out.println("Disparo de la computadora errado");
        }else{ dispPc=false;}
        }
        }while(dispPc==false);
       }while(bUs!=0&&bPc!=0);
    }
}
