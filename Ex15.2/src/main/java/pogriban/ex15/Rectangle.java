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
public class Rectangle extends Polygon {
    public Rectangle(Point topRightCorner, int width, int height){
        Point a=topRightCorner;
        width =2;
        height=2;
        
    }
    public double getPerimeter (){
        return 2*width+2*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + '}';
    }
    
}