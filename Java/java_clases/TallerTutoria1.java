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
public class TallerTutoria1 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    System.out.println("Ingrese un numero para realizar convercion");
    long decimal=intro.nextLong();
    long aux=decimal;
    String binario="";
    
    while(aux>0){
    binario=aux%2+binario;
    aux/=2;
    
    }
    System.out.println("El numero "+decimal+" en binario es "+binario);
    }
}
