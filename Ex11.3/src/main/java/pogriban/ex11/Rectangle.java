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
public class Rectangle {
    private int length, width;
    Rectangle(){
        //width=length=0;
        System.out.println("Null "+length*width);
        
      
    }
    Rectangle(int latura){
        length=width=latura;
      System.out.println("Patrat "+length*width);  
    }
    Rectangle(int a, int b){
        length =a;
        width =b;
        System.out.println("Aria "+length*width);
    }
    public static void main(String args[]){
        Rectangle a=new Rectangle();
        Rectangle a1= new Rectangle(2);
        Rectangle a2=new Rectangle(2,3);
    }
}
