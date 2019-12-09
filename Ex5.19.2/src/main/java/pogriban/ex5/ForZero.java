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
public class ForZero {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Introdu numarul ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
        }
        
        System.out.println("A fost introdus numarul 0 ");
    }

}
