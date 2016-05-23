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
public class Cap4_4 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int sueldo = 0, grado, hrsE, hrs,isa,descIsa=0,afp,descAfp=0;
        System.out.println("Ingrese el grado al que pertenesca(1)(2)(3)");
        grado = intro.nextInt();
        switch (grado) {
            case 1:
                sueldo = 450000;
                break;
            case 2:
                sueldo = 550000;
                break;
            case 3:
                sueldo = 700000;
                break;
        }
        System.out.println("Ingrese cantidad de horas mensuales que realiza");
        hrs = intro.nextInt();
        hrsE = (hrs - 40);
        if (hrsE > 3) {
            if (hrsE > 7) {
                sueldo = sueldo + (3500 * hrsE);
            } else {
                sueldo = sueldo + (3000 * hrsE);
            }
        } else {
            sueldo = sueldo + (2000 * hrsE);
        }
        System.out.println("Ingrese la isapre a la que pertenesca(1)Colmena(2)Ban medica(3)Vida 3(4)Fonasa");
        isa=intro.nextInt();
        switch(isa){
            case 1: descIsa=(int)(sueldo*6.5)/100;break;
            case 2: descIsa=(int)(sueldo*7.3)/100;break;
            case 3: descIsa=(sueldo*7)/100;break;
            case 4: descIsa=(sueldo*7)/100;break;
        }
        System.out.println("Ingrese el AFP a la que pertenece (1)BanSantander(2)Geometrica SA(3)Cuprum(4)Provida");
        afp=intro.nextInt();
        switch(afp){
            case 1: descAfp=(int)(sueldo*12)/100;break;
            case 2: descAfp=(int)(sueldo*13.4)/100;break;
            case 3: descAfp=(int)(sueldo*12.3)/100;break;
            case 4: descAfp=(int)(sueldo*12.9)/100;break;
        }
        sueldo=(sueldo-descIsa-descAfp);
        System.out.println("Su sueldo es: "+sueldo);
    }
}
