package java_clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class CalculadoraFunciones {

    public static void main(String[] args) {
        menu();
    }

    public static void funcSuma(int a, int b) {
        int suma;
        suma = a + b;
        mostrar(suma);
    }

    public static void funcResta(int a, int b) {
        int resta;
        resta = a - b;
        mostrar(resta);
    }

    public static void funcDiv(float a, float b) {
        float div;
        div = a / b;
        mostrar(div);
    }

    public static void funcMult(int a, int b) {
        int mult;
        mult = a * b;
        mostrar(mult);
    }

    public static void mostrar(float res) {
        System.out.println("El resultado es: " + res);
    }

    public static void menu() {
        int opc;
        Scanner lectura = new Scanner(System.in);
        do {
            System.out.println("1.- SUMAR");
            System.out.println("2.- RESTAR");
            System.out.println("3.- MULTIPLICAR");
            System.out.println("4.- DIVIDIR");
            System.out.println("5.- SALIR");
            opc = lectura.nextInt();
            switch (opc) {
                case 1:
                    funcSuma(leer(), leer());
                    break;
                case 2:
                    funcResta(leer(), leer());
                    break;
                case 3:
                    funcMult(leer(), leer());
                    break;
                case 4:
                    funcDiv(leer(), leer());
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default: break;    
            }
        } while (opc != 5);
    }
}
