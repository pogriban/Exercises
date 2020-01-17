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
public class Polygon extends Shape{
    protected Point veritices[];
    @Override
    public void move(int dx, int dy){
        
    }
    @Override
    public double getPerimeter(){
        return dx*dy;
    }

    @Override
    public String toString() {
        return "Polygon{" + "veritices=" + veritices + '}';
    }
}
