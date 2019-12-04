/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class ConvertorTemp {

    /**
     *
     * @param args
     */
    public static void main (String[] args)
    {
       Scanner sc = new Scanner (System.in);
        System.out.println("Introdu a ");
       int a = sc.nextInt();
       System.out.println("a este " + a);
    float c, f;
    
    System.out.println("Introdu temperatura in C ");
    float b = sc.nextFloat();
    c = ( 9 * b + ( 32 * 5)) / 5;
    System.out.println("Temperatura in F este " + c);
    System.out.println("Introdu temperatura in F ");
    float n = sc.nextFloat();
    f = ( 5 *( n - 32 ))/9;
     System.out.println("Temperatura in F este " + f);
    
    
    }
    
}
