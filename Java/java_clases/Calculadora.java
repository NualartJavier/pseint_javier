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
public class Calculadora {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int op = 0;
        double n1, n2, resul = 0;
        try {
            do {
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("(1)suma");
                System.out.println("(2)resta");
                System.out.println("(3)multiplicacion");
                System.out.println("(4)division");
                System.out.println("(5)Salir");
                op = intro.nextInt();
            } while (op >5 || op<1);
            System.out.println("Ingrese el valor N°1");
            n1 = intro.nextDouble();
            System.out.println("Ingrese el valor N°2");
            n2 = intro.nextDouble();
            switch (op) {
                case 1:
                    resul = (int) n1 + n2;
                    break;
                case 2:
                    resul = (int) n1 - n2;
                    break;
                case 3:
                    resul = n1 * n2;
                            
                    break;
                case 4:
                    resul = n1 / n2;
                    break;
                case 5:
                    System.out.println("GG usted abandonó,bay");
            }
            System.out.println("El resultado de la operacion es: " + resul);
        } catch (NumberFormatException e) {
            System.out.println("Se han introducido caracteres no numericos");
        }catch(ArithmeticException ex){System.out.println("Indefinido");}
    

    }

}
