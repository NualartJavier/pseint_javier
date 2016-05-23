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
public class Cap6_5 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    int dim;
    System.out.println("Ingrese la cantidad de numeros");
    dim=intro.nextInt();
    int array[]=new int [dim];
        for (int i = 1; i <array.length; i++) {
            array[i]=i+1;
            System.out.println(array[i]);
            for (int j = 1; j <array.length; j++) {
                
            }
        }    
    }
}
