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
public class Cap6_1 {
    public static void main(String[]args){
    final int N=10;
    float prom;
    int sumD=0;
    Scanner intro = new Scanner(System.in);
    int matri[][]= new int [N][N];
    for(int j=0;j<N;j++){
        int sum=0;
       for(int i=0;i<N;i++){
       do{System.out.println("Ingrese el numero para la fila "+j+", columna "+i);
       matri[j][i]=intro.nextInt();
       }while(matri[j][i]<0||matri[j][i]>250);
       sum=sum+matri[j][i];
       if(i==j){
       sumD=sumD+matri[j][i];
       }
       }
       prom=(int)sum/N;
       System.out.println("El promedio para la fila "+j+" es"+prom);
    }
    System.out.println("La suma de la diagonal es: "+sumD);
    }
}
