import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ThinkPad
 */
public class ZiInvers {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("Inrodu ziua ");
        String day = sc.nextLine();
        // String day = sc.nextLine().to.LowerCase();
        switch (day) {
            case "duminica":
            case "simbata":
                System.out.println("zi de odihna ");
                break;
            case "vineri":
                System.out.println("vineri");
                break;
            case "joi":
            case "miercuri":
                System.out.println("miercuri, vineri");
                break;
                case "marti":
            case "luni":
                System.out.println("luni,miercuri, vineri");
                break;
            default:
                System.out.println(" incorect");
    }
    }
    
}
