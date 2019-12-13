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
public class Triangle {
    Point punct1 =new Point();
    Point punct2 =new Point();
    Point punct3 =new Point();
    double d1, d2, d3;
    void determinTriangele(){
    d1 =Math.sqrt(((punct2.x-punct1.x)*(punct2.x-punct1.x))+((punct2.y-punct1.y)*(punct2.y-punct1.y)));
    d2 =Math.sqrt(((punct3.x-punct2.x)*(punct3.x-punct2.x))+((punct3.y-punct2.y)*(punct3.y-punct2.y)));
    d3 =Math.sqrt(((punct1.x-punct3.x)*(punct1.x-punct3.x))+((punct1.y-punct3.y)*(punct1.y-punct3.y)));
    if((d1==d2)&&(d1!=d3)) {
            System.out.println("Triunghi isoscel ");}
    if ((d1==d2)&&(d1==d3)){
        System.out.println("Triunghi echilateral ");
         }
    if ((d1!=d2)&&(d1!=d3)){
        System.out.println("Triunghi X ");
         }
       
    }
    
}
