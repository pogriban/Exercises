/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex15;

/**
 *
 * @author ThinkPad
 */
public class Main {
        public static void main(String args[]){
Point p=new Point(5,5);
Rectangle rectangle=new Rectangle(p, 2, 3);
            System.out.println("Rectamgle "+rectangle);
                    System.out.println("Perimeter "+rectangle.getPerimeter());
System.out.println("Surface "+rectangle.getSurface());
   // rectangle.move(1, 15);
}
}
