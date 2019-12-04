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
public class Luna {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti luna ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Liuna ianuarie ");
                break;
            case 2:
                System.out.println("Liuna februarie ");
                break;
            case 3:
                System.out.println("Liuna martie ");
                break;
            case 4:
                System.out.println("Liuna aprilie ");
                break;
            case 5:
                System.out.println("Liuna mai ");
                break;
            case 6:
                System.out.println("Liuna iunie ");
                break;
            case 7:
                System.out.println("Liuna iulie ");
                break;
            case 8:
                System.out.println("Liuna august ");
                break;
            case 9:
                System.out.println("Liuna septembrie ");
                break;
            case 10:
                System.out.println("Liuna octombrie ");
                break;
            case 11:
                System.out.println("Liuna noiembrie ");
                break;
            case 12:
                System.out.println("Liuna decembrie ");
                break;
            default:
                System.out.println("Nu este luna cu asa numar ");

        }
    }

}
