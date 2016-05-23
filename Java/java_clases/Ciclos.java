/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;
/**
 *
 * @author juan
 */
public class Ciclos {
    public static void main(String[]args){
    int cont=0;
    do{
        cont++;
        System.out.print (cont +" ");
    }while(cont<9);
    
    System.out.println();
    cont=0;
    //mientras se cumpla la condicion iteracion
    while(cont<9){
       cont++;
       System.out.print(cont+" ");
    }
    //para un i=1 hasta que la conicion sea falsa
    System.out.println();
    for(int i =1;i<=9;i++){
        System.out.print(i+" ");
    }
    }
}
