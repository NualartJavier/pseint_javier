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
public class Cap3tres {
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    int edad,dias;
    System.out.println("Ingrese su edad");
    edad = intro.nextInt();
    dias= edad*365;
    System.out.println("La cantidad de dias vividos es: "+dias);
    }
}
