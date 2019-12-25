/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex11;

/**
 *
 * @author ThinkPad
 */
public class Main11_1 {
   private static int count;
   Main11_1(){
   count++;
   }
   void printCount(){
       System.out.println("De "+count+" ori");
     
   }
   public static void main(String args[]){
       new Main11_1();
        new Main11_1();
         new Main11_1();
          new Main11_1();
           new Main11_1();
            new Main11_1();
            
       Main11_1 a=new Main11_1();
       //System.out.println(a.printCount());
       a.printCount();
       
   }
}
