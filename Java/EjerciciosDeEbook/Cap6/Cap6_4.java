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
public class Cap6_4 {
    public static void main(String[]args){
    Scanner intro = new Scanner(System.in);
    int mes[]= new int[30];
    int sum=0,max=0,dia=0;
    int prom;
        for (int i = 0; i < mes.length; i++) {
            do{System.out.println("Ingrese el monto total de ventas del dia "+(i+1));
            mes[i]=intro.nextInt();
            }while(mes[i]<0);
            if(i<15){
            sum=sum+mes[i];
            }
            if(mes[i]>max){
            max=mes[i];
            dia=i;
            }
        }
      prom=(int) sum/15;   
     System.out.println("El promedio de ventas de los primeros 15 dias es: $"+prom);
     System.out.println("El dia que logro mayor venta fue : dia "+(dia+1));
     System.out.println("Los dias en que se registraron ventas mayores a $345000 son :");
        for (int i = 0; i <mes.length; i++) {
            if(mes[i]>345000){
            System.out.println("Dia "+(i+1));
            }
        }
    }
}
