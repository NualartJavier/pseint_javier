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
public class Cap3Diez {
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    int alRe,alApro,alSobre,alNot,porcR,porcA,porcS,porcN,alT;
    System.out.println("Ingrese la cantidad de alumnos reprobados");
    alRe=intro.nextInt();
    System.out.println("Ingrese la cantidad de alumnos aprobados");
    alApro=intro.nextInt();
    System.out.println("Ingrese la cantidad de alumnos sobresalientes");
    alSobre=intro.nextInt();
    alT=alRe+alApro;
    porcR=(alRe*100)/alT;
    porcA=(alApro*100)/alT;
    porcS=(alSobre*100)/alT;
    porcN=((alApro-alSobre)*100)/alT;
    System.out.println("porcentaje de alumnos reprobados "+porcR+"%");
    System.out.println("porcentaje de alumnos aprobados "+porcA+"%");
    System.out.println("porcentaje de alumnos notables "+porcN+"%");
    System.out.println("porcentaje de alumnos sobresalientes "+porcS+"%");
            
    }
}
