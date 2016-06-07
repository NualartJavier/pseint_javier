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
public class Funciones {
    public static void main(String[]args){
    int opcion;
    Scanner intro = new Scanner(System.in);
    menu();
    System.out.println("Ingrese opcion del menu");
    opcion = intro.nextInt();
    System.out.println("La opcion seleccionada es "+opcion);
    }
    
    public static void menu(){
    System.out.println("MENU");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division ");
    System.out.println("5. Salir");
    }
}
