/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex7;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Main {

    public static void main(String args[]) {

        Rectangle aria = new Rectangle();//aria obiect instanta
        {
            System.out.println("Introduceti lungimea");
            Scanner sc = new Scanner(System.in);
            aria.length = sc.nextInt();
            System.out.println("Introduceti latimea");
            aria.width = sc.nextInt();
            System.out.println("Introduceti 1 pentru arie, 2 pentru perimetru ");
            aria.option = sc.nextInt();
            if (aria.option == 1) {
                aria.calcArea();
            }

            if (aria.option == 2) {
                aria.calcPerim();
            }

        }
    }
}
