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
public class Cap3Siete {
    public static void main(String[]args){
    Scanner intro= new Scanner(System.in);
    int edad,puls;
    System.out.println("Ingrese su edad");
    edad=intro.nextInt();
    puls=(220-edad)/10;
    System.out.println("El numero de pulsaciones que debe tener es: "+puls+"por cada 10s de ejercicio");
    }
}
