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
public class Triangle extends Polygon {
    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree){
        Point a=cornerOne;
        Point b=cornerTwo;
        Point c=cornerThree;
    }
    public double getSurface(){
        return a*b*c;
    }
}
