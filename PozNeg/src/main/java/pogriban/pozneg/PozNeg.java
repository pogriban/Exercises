/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner();

/**
 *
 * @author ThinkPad
 */
public class PozNeg {
    public static void main (String args [])
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("Introdu numarul");
    int a=sc.nextInt();
    if (a>=0)
        System.out.println("Numarul "+a+" este pozitiv");
    else 
    System.out.println("Numarul "+a+" este negativ");
    }
    
}
