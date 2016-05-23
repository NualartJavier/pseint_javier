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
public class Cap3Uno {
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    double rad,h,at,v;
    System.out.println("Ingrese la altura");
    h=intro.nextDouble();
    System.out.println("Ingrese el radio");
    rad= intro.nextDouble();
    at=(int)2*Math.PI*(h+rad);
    v=(Math.PI*Math.pow(rad,2)*h);
    System.out.println("El area del cilindro es "+at+"cm2");
    System.out.println("El volumen es "+v+"cm3");
    }
}
