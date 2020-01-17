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
public class Circle {
    private Point point;
    private int radius;
    public Circle(Point point, int radius){
        this.point=point;
        this.radius=radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void move(int dx, int dy){}
    public double getSurface(){
        return 2*Math.PI*radius;
    }
    public double getPerimeter(){
        return Math.PI*Math.sqrt(radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "point=" + point + ", radius=" + radius + '}';
    }
    
}
