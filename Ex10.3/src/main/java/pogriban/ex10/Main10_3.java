/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex10;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Main10_3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Itroduceti 1 pentru celsius si 2 pentru Farengeit ");
        int a = sc.nextInt();
        
        switch (a) {
            case 1: {

                System.out.println(celsius(1));
                break;
            }
            case 2: {
                System.out.println(farengeit(1));
                break;
            }
            default:
                break;
        }
    }

    static double celsius(double cel) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti temperaura F ");
        float f = sc.nextFloat();
        cel = (5 * (f - 32)) / 9;
        return cel;

    }

    static double farengeit(double far) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti temperaura C ");
        float c = sc.nextFloat();
        // f=34.2;
        far = (5 * (c - 32)) / 9;
        return far;

    }

}
