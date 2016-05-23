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
public class Cap3Dos {
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    int a,b,sum,mult;
    System.out.println("Ingrese el primer numero");
    a=intro.nextInt();
    System.out.println("Ingrese el segundo numero");
    b=intro.nextInt();
    sum=a+b;
    mult= a*b;
    System.out.println("La suma es: "+sum);
    System.out.println("La multiplicacion es: "+mult);
    }
}
