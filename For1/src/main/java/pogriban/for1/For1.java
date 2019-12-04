/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner

();

/**
 *
 * @author ThinkPad
 */
public class For1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul ");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i < a; i++) {
            b++;
            System.out.println(b);
        }

        b = a;
        for (int ij = 0; ij < a - 1; ij++) {

            --b;
            System.out.println(b);
        }
    }

}
