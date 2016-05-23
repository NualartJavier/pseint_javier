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
public class TallerTutoria2 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    char abc[10] ={'h','o','l','a'};
        for (int i = 0; i <abc.length; i++) {
            System.out.println("Ingrese la letra "+abc);
            abc[i]=intro.next().charAt(0);
        }
        for (int i = 0; i <abc.length; i++) {
            System.out.print(abc[i]+" ");
        }
    }
}
