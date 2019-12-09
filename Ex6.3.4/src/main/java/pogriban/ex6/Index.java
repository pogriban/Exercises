/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex6;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Index {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        //int a=sc.nextInt();
        System.out.println("Introduceti dimensiunea tabloului ");
        int a = sc.nextInt();
        int[] arr;
        int r = 0;
        arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Introduceti numarul  " + (i + 1));
            //System.out.println("a[" +i "]" + a[i]);
            arr[i] = sc.nextInt();
        }

        System.out.println("Situl introdus");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Introdu nuamrul cautat ");
        int b = sc.nextInt();
        System.out.println("Indexul ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                r++;
                System.out.print(" " + i);
            }
// if (arr[i] != b) break;
        } if(r==0)
        System.out.println("asa numar nu este in sir  ");

    }

    //for (int i=0; i<arr.length;i++)
    //4System.out.println(" " +arr[i] );
}
