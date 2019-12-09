/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex6;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class ArrCopy {
    public static void main(String args[])
    {
    //int a[]={1,2,3,4,5};
    int a[],b[];
   a =new int[4];
   //b =new int[];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<a.length;i++){
          System.out.println("Introdu numar ");
          a[i]= sc.nextInt();
        //   a[i]=c;
   }
   System.out.println("Sirul introdus ");
   for(int i=0;i<a.length;i++){
          System.out.print(" "+a[i]);
   }
   System.out.println("\n"+"Cite num din a ");
   int x=sc.nextInt();
   b=new int[x];
   //System.arraycopy(a, 0, b, 0, x);
    for (int i=0;i<x;i++)
        b[i]=a[i];
    //System.out.println("");
    System.out.println("Sirul b ");
    for (int i=0;i<b.length;i++)
        System.out.print(" "+b[i]);
    }
    
}
