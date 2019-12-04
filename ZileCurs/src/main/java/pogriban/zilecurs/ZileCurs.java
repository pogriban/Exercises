/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class ZileCurs {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inrodu ziua ");
        String day = sc.nextLine();
        // String day = sc.nextLine().to.LowerCase();
        switch (day) {
            case "duminica":
                System.out.println("MON, WED, FRI");
                break;
            case "TUE":
                System.out.println("WED, FRI");
                break;
            case "WED":
                System.out.println("WED, FRI");
                break;
            case "THU":
                System.out.println("FRI");
                break;
            case "FRI":
                System.out.println("FRI");
                break;
            default:
                System.out.println(" Week END");
        }

    }
}
