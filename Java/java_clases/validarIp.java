/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juan
 */
public class validarIp {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String array[]=new String [4];
        int valorEnt[]= new int [4];
        String ip;
        System.out.println("Ingrese la ip");
        ip = intro.next();
        Pattern pat = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher mat = pat.matcher(ip);
        if (mat.matches()) {
            System.out.println("La ip ingresada es correcta");
            split(ip,array,valorEnt);
            transform(valorEnt);
        }
    }
    public static void split(String ip, String array[],int valorEnt[]) {
        
        array = ip.split("\\.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Octeto numero " + (i + 1) + ": " + array[i]);
            valorEnt[i] =Integer.parseInt(array[i]);
        }
    }
    public static void transform(int valorEnt[]){
        for(int i=0;i<valorEnt.length;i++){
            System.out.println("Octeto "+(i+1)+" en binario es: "+ Integer.toBinaryString(valorEnt[i]));
        }
    }
}
