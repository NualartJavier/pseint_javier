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
public class Cap3Cinco {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);    
    int suelB,pHrs,hrs; 
    double desc,suelT;
    System.out.println("Ingrese su sueldo Basico");
    suelB=intro.nextInt();
    System.out.println("Ingrese el pago por horas extras");
    pHrs=intro.nextInt();
    System.out.println("Ingrese la cantidad de horas extras realizadas");
    hrs=intro.nextInt();
    desc=Math.round((20*suelB)/100);
    suelT=suelB+(pHrs*hrs)- desc;
    System.out.println("El sueldo basico es: "+suelB);
    System.out.println("El total del descuento (20%) es: "+desc);
    System.out.println("El total ganado es: "+suelT);
            
    }
}
