/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex11;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class Date {
 static   int day, month, year;
    Date (int d, int m, int y){
 Scanner sc=new Scanner(System.in);
  System.out.println("Introdu data ");
  d=sc.nextInt();
  System.out.println("Introdu luna ");
  m=sc.nextInt();
  System.out.println("Introdu anul ");
  y=sc.nextInt();
  day=d;
   month=m;
   year=y;
   
  }
    public void displayDate(){
       System.out.println("data introdusa "+day+"/"+month+"/"+year); 
    }
   public static void main(String args[]){
      // Scanner sc=new Scanner(System.in);
       
      System.out.println("data introdusa "+day+"/"+month+"/"+year);
       Date q=new Date(1, 2, 3);
       q.displayDate();
   } 
}