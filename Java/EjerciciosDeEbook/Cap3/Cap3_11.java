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
public class Cap3Once {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    double calPar,promTall,promTar,calExp,promF;
    System.out.println("Ingrese la nota de calificaciones parciales");
    calPar=intro.nextDouble();
    System.out.println("Ingrese la nota de promedio de talleres");
    promTall=intro.nextDouble();
    System.out.println("Ingrese la nota de promedio de tareas");
    promTar=intro.nextDouble();
    System.out.println("Ingrese la nota de exposicion del tema de investigacion");
    calExp=intro.nextDouble();
    promF=Math.round((calPar*0.5)+(promTall*0.25)+(promTar*0.15)+(calExp*0.1));
    System.out.println("Su calificacion final es: "+promF);
    
    }
}
