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
public class Cap3Nueve {
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    int prom,time,timeT=0;
    for(int i=1;i<=7;i++){
    System.out.println("Ingrese el tiempo del dia "+i);
            time=intro.nextInt();
            timeT=time+timeT;
    }
    prom=(timeT)/7;
    System.out.println("El promedio de los tiempos en la semana es: "+prom);
    }
}
