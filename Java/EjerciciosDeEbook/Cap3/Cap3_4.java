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
public class Cap3Cuatro {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int a, b, c, sum;
        double prom, cuad;
        System.out.println("Ingrese el primer numero");
        a = intro.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = intro.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = intro.nextInt();
        sum = a + b + c;
        prom = (sum / 3);
        cuad=Math.pow(c,2);
        System.out.println("La suma es :" + sum);
        System.out.println("El promedio es :" + prom);
        System.out.println("El doble del primer numero es: "+a*2);
        System.out.println("El triple del segundo numero es: "+b*3);
        System.out.println("El cuadrado del tercer numero es: "+cuad);
    }
}
