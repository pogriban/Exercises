/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex7;

/**
 *
 * @author ThinkPad
 */
public class Circle {

    int radius;
    double area;

    public Circle() {
        this.area = 0.0d;
    }
    void calcAria(){
    area  = 3.14 * radius * radius;

    System.out.println ("Aria "+ area);
    }
}
