/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_clases;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juan
 */
public class TallerDeEntrada2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random rnd = new Random();
        int p1, p2, p3, p4, p5, resp, resp1=0, resp2=0, resp3=0, al;

        p1 = (int) rnd.nextDouble() * 5 + 1;
        do {
            p2 = (int) rnd.nextDouble() * 5 + 1;
        } while (p1 == p2);
        do {
            p3 = (int) rnd.nextDouble() * 5 + 1;
        } while (p3 == p1 || p3 == p2);
        switch (p1) {
            case 1:
                resp1 = 'd';
                break;
            case 2:
                resp1 = 'b';
                break;
            case 3:
                resp1 = 'e';
                break;
            case 4:
                resp1 = 'a';
                break;
            case 5:
                resp1 = 'c';
                break;
        }
        switch (p2) {
            case 1:
                resp2 = 'd';
                break;
            case 2:
                resp2 = 'b';
                break;
            case 3:
                resp2 = 'e';
                break;
            case 4:
                resp2 = 'a';
                break;
            case 5:
                resp2 = 'c';
                break;
        }
        switch (p3) {
            case 1:
                resp3 = 'd';
                break;
            case 2:
                resp3 = 'b';
                break;
            case 3:
                resp3 = 'e';
                break;
            case 4:
                resp3 = 'a';
                break;
            case 5:
                resp3 = 'c';
                break;
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("Alumno n°");
            System.out.println("Pregunta n°" + i);
            System.out.println("(a) alternativa 1");
            System.out.println("(b) alternativa 2");
            System.out.println("(c) alternativa 3");
            System.out.println("(d) alternativa 4");
            System.out.println("(e) alternativa 5");
            System.out.println("Ingrese la alternativa ");
            al = intro.next().charAt(0);
            switch (al) {
                case 'a':
                    if (al == resp1) {System.out.println("Respuesta correcta");
                    };break;
                case 'b':  if(al==resp1){System.out.println("Respuesta correcta");};break;
                case 'c': if(al==resp1){System.out.println("Respuesta correcta");};break;
                case 'd': if(al==resp1){System.out.println("Respuesta correcta");};break;
                case 'e': if(al==resp1){System.out.println("Respuesta correcta");};break;
            }

        }
    }
}
