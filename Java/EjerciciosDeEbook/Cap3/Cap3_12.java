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
public class Cap3Doce {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    int presup,montKine,montGine,montTrauma,montPedia;
    System.out.println("Ingrese el monto presupuestado");
    presup=intro.nextInt();
    montKine=(presup*20)/100;
    montGine=(presup*25)/100;
    montTrauma=(presup*30)/100;
    montPedia=(presup*25)/100;
    System.out.println("El monto que recibira kinesiologia es: "+montKine);
    System.out.println("El monto que recibira ginecologia es: "+montGine);
    System.out.println("El monto que recibira traumatologia es: "+montTrauma);
    System.out.println("El monto que recibira pediatria es: "+montPedia);
    
    }
}
