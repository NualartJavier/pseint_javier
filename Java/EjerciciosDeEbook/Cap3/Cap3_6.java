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
public class Cap3Seis {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int seg = 1, op, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, costo = 0;
        System.out.println("Lista del  Menu             - precio");
        System.out.println("(1)Completo italiano        - $690");
        System.out.println("(2)Completo a la chilena    - $890");
        System.out.println("(3)Hamburguesa-queso        - $990");
        System.out.println("(4)Churrasco                - $1100");
        System.out.println("(5)Cerveza                  - $700");
        System.out.println("(6)Bebida                   - $500");
        while (seg == 1) {
            System.out.println("Para pedir ingrese el numero de lista");
            op = intro.nextInt();
            switch (op) {
                case 1:
                    cont1++;
                    costo = costo + 690+(690/10);
                    break;
                case 2:
                    cont2++;
                    costo = costo + 890+(890/10);
                    break;
                case 3:
                    cont3++;
                    costo = costo + 990+(990/10);
                    break;
                case 4:
                    cont4++;
                    costo = costo + 1100+(1100/10);
                    break;
                case 5:
                    cont5++;
                    costo = costo + 700+(700/10);
                    break;
                case 6:
                    cont6++;
                    costo = costo + 500+(500/10);
                    break;
            }
            System.out.println("para realizar un nuevo pedido oprima (1)");
            seg=intro.nextInt();
        }
        System.out.println("El costo total es: "+costo);
    }
}

