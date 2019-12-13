/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex7;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class Main7_9 {
    public static void main(String args[]){
      Triangle virf=new Triangle();
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduceti coordonatele X1Y1 ");
      virf.punct1.x=sc.nextInt();
      virf.punct1.y=sc.nextInt();
      System.out.println("Coordonatele x1 "+virf.punct1.x+" y1 "+virf.punct1.y);
      System.out.println("Introduceti coordonatele X2Y2 ");
      virf.punct2.x=sc.nextInt();
      virf.punct2.y=sc.nextInt();
      System.out.println("Coordonatele x2 "+virf.punct2.x+" y2 "+virf.punct2.y);
      System.out.println("Introduceti coordonatele X3Y3 ");
      virf.punct3.x=sc.nextInt();
      virf.punct3.y=sc.nextInt();
      System.out.println("Coordonatele x3 "+virf.punct3.x+" y3 "+virf.punct3.y);
      virf.determinTriangele();
      if(virf.punct1.x==virf.punct2.x)
          System.out.println("Avem triunghi drept ");
      else System.out.println("Nu avem triunghi drept ");
      System.out.println(" "+virf.d1);
     System.out.println(" "+virf.d2);
      System.out.println(" "+virf.d3);
      
    }
    
}
