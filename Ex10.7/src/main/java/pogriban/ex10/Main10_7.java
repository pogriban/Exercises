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
public class Main10_7 {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Introdu marimea patratului");
int a=sc.nextInt();
squqreOfAsterisks(a);
       
    }


 static void squqreOfAsterisks(int w){
 for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
}
}
