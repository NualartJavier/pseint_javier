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
public class Cap5_5 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int cantNot, cantNotA = 0, cantNotR = 0,prom;
        double notMax = 1.0, notMin = 6.0, not, sumNot = 0;
        System.out.println("Ingrese la cantidad de notas");
        cantNot = intro.nextInt();
        for (int i = 1; i <= cantNot; i++) {
            System.out.println("Ingrese la nota n°" + i);
            not = intro.nextDouble();
            sumNot = not + sumNot;
            if (not >= 4.0) {
                cantNotA++;
            } else {
                cantNotR++;
            }
            if(not>notMax){notMax=not;
            }
            if(not<notMin){notMin=not;
            }
        }
        prom=(int)sumNot/cantNot;
        System.out.println("El promedio es: "+prom);
        System.out.println("Cantidad de notas aprobadas: "+cantNotA);
        System.out.println("Cantidad de notas reprobadas: "+cantNotR);
        System.out.println("La nota mas alta es: "+notMax);
        System.out.println("La nota mas baja es: "+notMin);
        if(prom>4.0 && cantNotR<cantNot/2){
            System.out.println("El alumno aprobo la asignatura");
        }else{System.out.println("El alumno reprobo la asignatura");
        }
        
    }
}
