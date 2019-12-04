/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex5;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul ");
        int a =1;

        int c = 0, b = 0, sum = 0;
        while (a != 0) {

            a = sc.nextInt();
            c++;
            //b=a;
            sum = sum + a;
        }
        // System.out.println(a);
        System.out.println("Numarul de cifre" + c);
        System.out.println("Suma " + (sum-1));

    }

}
