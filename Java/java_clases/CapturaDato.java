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
public class CapturaDato {
    public static void main(String []args){
    Scanner intro = new Scanner(System.in);//Instanciamos la clase Scanner
    String usuario="";
    System.out.println("Ingrese su nombre");
    usuario = intro.nextLine();//nextLine captura una cadena de caracteres que ingresa el usuario
    System.out.println("Hola "+usuario);
    intro.close();//Se cierra la clase Scanner
    }
}
