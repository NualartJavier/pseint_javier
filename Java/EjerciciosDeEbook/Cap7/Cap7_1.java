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
public class Cap7_1 {
    public static void main(String[]args){
    int []ventas = new int [30];
    ingresar(ventas);
    System.out.println("El dia que obtuvo mayor cantidad de ventas fue :"+(mayor(ventas)+1));
    System.out.println("La cantidad de ventas durante el mes fue de: "+(total(ventas)));
    bajo(ventas);
    System.out.println("La remuneracion que el empleado recibe es de :"+(remu(ventas)));
    }
    public static void ingresar (int []ventas){
    Scanner intro = new Scanner(System.in);
        for (int i = 0; i <ventas.length; i++) {
            System.out.println("Ingrese la cantidad de ventas para el dia "+(i+1));
            ventas[i]=intro.nextInt();
        }
    }
    public static int mayor(int []ventas){
        int mayor=0,dia=0;
        for (int i = 0; i <ventas.length; i++) {
            if(ventas[i]>mayor){
            mayor=ventas[i];
            dia=i;
            }
        }
        return dia;    
    }
    public static int total(int []ventas){
    int suma=0;
        for (int i = 0; i <ventas.length; i++) {
            suma=suma+ventas[i];
        }
        return suma;
    }
    public static void bajo (int []ventas){
        System.out.println("Los dias que tubieron ventas bajo $10000 fueron: ");
        for (int i = 0; i <ventas.length; i++) {
            if(ventas[i]<10000){
            System.out.println("Dia "+(i+1)+"\t");
            }
        }
    }
    public static int remu(int []ventas){
    int suma=0,remu;
        for (int i = 0; i <ventas.length; i++) {
            suma=suma+ventas[i];
        }
        remu=suma/100;
        return remu;
    }
}
