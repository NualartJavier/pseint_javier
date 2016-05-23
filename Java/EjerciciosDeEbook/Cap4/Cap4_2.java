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
public class Cap4_2 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    int rest,mont;
    System.out.println("Ingrese el monto de dinero");
    mont=intro.nextInt();
    int bill20=mont/20000;
    rest=mont%20000;
    int bill10=rest/10000;
    rest=rest%10000;
    int bill5=rest/5000;
    rest=rest%5000;
    int bill2=rest/2000;
    rest=rest%2000;
    int bill1=rest/1000;
    rest=rest%1000;
    int mon500=rest/500;
    rest=rest%500;
    int mon100=rest/100;
    rest=rest%100;
    int mon50=rest/50;
    rest=rest%50;
    int mon10=rest/10;
    rest=rest%10;
    System.out.println("cantidad de billestes de 20000: "+bill20);
    System.out.println("cantidad de billestes de 10000: "+bill10);
    System.out.println("cantidad de billestes de 5000: "+bill5);
    System.out.println("cantidad de billestes de 2000: "+bill2);
    System.out.println("cantidad de billestes de 1000: "+bill1);
    System.out.println("cantidad de monedas de 500: "+mon500);
    System.out.println("cantidad de monedas de 100: "+mon100);
    System.out.println("cantidad de monedas de 50: "+mon50);
    System.out.println("cantidad de monedas de 10: "+mon10);
    System.out.println("cantidad de monedas de 1: "+rest);
    }
}
