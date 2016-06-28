/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author juan
 */
public class FuncionEj1 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    String correo;    
    System.out.println("Ingrese su correo");
    correo=intro.next();
    Pattern pat = Pattern.compile("[a-z]{1,1}\\.{1,1}[a-z]+[0-9]{2,2}@ufromail{1,1}\\.{1,1}cl{1,1}");
    Matcher mat = pat.matcher(correo);
    if (mat.matches()) {
         System.out.println("Es ufromail");
     }else{System.out.println("No es ufromail");}
    
    }
}
    