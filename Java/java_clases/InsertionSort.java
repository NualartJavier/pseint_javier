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
public class InsertionSort {

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 11, 5, 1, 13, 1, 55, 33, 22, 311};
        int p, j, aux;
        for (p = 1; p < num.length; p++) {
            aux = num[p];
            j = p - 1;
            while ((j >= 0) && (aux < num[j])) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = aux;
        }
        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
