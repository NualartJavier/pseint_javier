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
public class Cap3Ocho {
    public static void main(String[]args){
    Scanner intro= new Scanner(System.in);
    int salOld,salNew;
    System.out.println("Ingrese su salario anterior");
    salOld=intro.nextInt();
    salNew=salOld+(salOld*10)/100;
    System.out.println("Su nuevo salario es "+salNew);
    }
}
