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
public class Cap3Catorce {
    public static void main(String[]args){
    Scanner intro=new Scanner(System.in);
    int cant1,cant2,cant3,total,porc1,porc2,porc3;
    System.out.println("Ingresar cantidad amigo n°1");
    cant1=intro.nextInt();
    System.out.println("Ingresar cantidad amigo n°2");
    cant2=intro.nextInt();
    System.out.println("Ingresar cantidad amigo n°3");
    cant3=intro.nextInt();
    total=cant1+cant2+cant3;
    porc1=(cant1*100)/total;
    porc2=(cant2*100)/total;
    porc3=(cant3*100)/total;
    System.out.println("Porcentajes de cada amigo");
    System.out.println("amigo n°1: "+porc1+"%");
    System.out.println("amigo n°2: "+porc2+"%");
    System.out.println("amigo n°3: "+porc3+"%");
    }
}
