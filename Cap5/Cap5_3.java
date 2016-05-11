/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeEbook;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class Cap5_3 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    Random rnd = new Random();
    int n1,n2,n3,n4,n5,n6,num,aciert=0;
    n1= (int)(rnd.nextDouble()*41+1);
    do{n2= (int)(rnd.nextDouble()*41+1);
    }while(n2==n1);
    do{n3= (int)(rnd.nextDouble()*41+1);
    }while(n3==n2 || n3==n1);
    do{n4= (int)(rnd.nextDouble()*41+1);
    }while(n4==n1 || n4==n2 || n4==n3);
    do{n5= (int)(rnd.nextDouble()*41+1);
    }while(n5==n1 || n5==n2 || n5==n3 || n5==n4);
    do{n6= (int)(rnd.nextDouble()*41+1);
    }while(n6==n1||n6==n2||n6==n3||n6==n4||n6==n5);
    for(int cont=1;cont<=6;cont++){
    System.out.println("Ingrese le numero n°"+cont);
    num=intro.nextInt();
    if(num==n1||num==n2||num==n3||num==n4||num==n5||num==n6){
        aciert++;
    }
    }
    System.out.println("Usted obtuvo "+aciert+" aciertos");
    if(aciert==6){
    System.out.println("Felicidades se acaba de ganar el loto, pozo acumulado 380 millones de pesos");
    }
    if(aciert == 5){
    System.out.println("Felicidades se gano la revancha, premio de 100 millones");
    }
    if(aciert==4){
    System.out.println("Felicidades se gano el desquite, premio de 10 millones");
    }
    if(aciert<4){System.out.println("Siga participando :D");}
    }
}
