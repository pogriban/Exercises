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
public class Ex10_8 {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Introdu marimea patratului");
int a=sc.nextInt();
System.out.println("Introdu simbolul ");
char o =sc.next().charAt(0);
//squqreOfAsterisks(o);

squqreOfAsterisks(a, o);
       
    }


 static void squqreOfAsterisks(int w, char t){
    // char c='4';
 for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print(t);
            }

            System.out.println();
        }
}

 
}
