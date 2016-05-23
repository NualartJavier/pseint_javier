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
public class SelectSort {

    public static void main(String[] args) {
        int a[] = {12, 1, 44, 2345, 223, -2234, 34, 22};
        for (int i = 0; i < a.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minimo]) {
                    minimo = j;
                }
            }
            int aux = a[i];
            a[i] = a[minimo];
            a[minimo] = aux;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
