/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.test1;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class ZileNS {

    public static void main(String args[]) {
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        month = sc.nextLine();
        String result = "";
        switch (month.toUpperCase()) {
            case "LUNI":
                result += "Luni ";
            case "MARTI":
            case "MIERCURI":
                result += "Miercuri ";
            case "JOI":
            case "VINERI":
                result += "Vineri ";
                break;
            default:
                System.out.println("Nu avem cursuri.");
                break;
        }
        System.out.println(result);

    }
}
