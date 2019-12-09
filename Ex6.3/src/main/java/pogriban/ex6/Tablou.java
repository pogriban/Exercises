/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex6;

/**
 *
 * @author ThinkPad
 */
public class Tablou {

    public static void main(String args[]) {
        int a[] = {1, 2, 3};
        //a = new int[3];
//int b[][]=new int[3][3];     

        int b[][] = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        //b[][]= new int
        //a[0] = 1;
        //a[1] = 2;
        //a[2] = 3;

        int s = 0, s1 = 0, c = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            s += a[i];
        }
        for (int[] b1 : b) {
            for (int j = 0; j < b1.length; j++) {
                s1 += b1[j];
                c++;
            }
            //for (int i = 0; i < b.length; i++) {
            // for (int j = 0; j < b[i].length; j++) {
            //s1 += b[i][j];

        }
        //System.out.println("numarul de iteratii " + c);
        System.out.println("sunm tabloului unidimensional " + s);
        System.out.println("media tabloului unidimensional " + s / a.length);
        System.out.println("sunm tabloului bidimensional " + s1);
        System.out.println("media tabloului didimensional " + s1 / c);

    }

}
