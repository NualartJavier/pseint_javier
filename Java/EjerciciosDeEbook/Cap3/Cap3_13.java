package EjerciciosDeEbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class Cap3Trece {
    public static void main(String[]args){
    Scanner intro= new Scanner(System.in);
    int costV,ganV,imp,costoT;
    System.out.println("Ingrese el costo del vehiculo");
    costV=intro.nextInt();
    ganV=(costV*8)/100;
    imp=(costV*3)/100;
    costoT=costV+ganV+(imp*2);
    System.out.println("----------------");
    System.out.println("Boleta");
    System.out.println("----------------");
    System.out.println("Costos adicionales");
    System.out.println("-Ganancia al vendedor(8%): "+ganV);
    System.out.println("-Impuestos locales(3%): "+imp);
    System.out.println("-Impuestos estatales(3%): "+imp);
    System.out.println("Costo del vehiculo total: "+costoT);
    }
}
