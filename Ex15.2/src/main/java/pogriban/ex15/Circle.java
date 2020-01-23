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
public class Circle extends Shape{
    private Point center;
    private int radius;
    public Circle(Point point, int radius){
        this.center=point;
        this.radius=radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    @Override
    public void move(double dx, double dy){
        //center.setX(center.getX()+dx);
        //center.setY(center.getY()+dy);
        center.move(dx, dy);
        
    }
    @Override
    public double getSurface(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public double getPerimeter(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
}
