/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex15;

import java.util.Arrays;

/**
 *
 * @author ThinkPad
 */
public abstract class Polygon extends Shape{
    protected Point veritices[];
    @Override
    public void move(double dx, double dy){
        for(Point point: veritices){
            point.move(dx, dy);
        }
        
    }
    @Override
    public double getPerimeter(){
        
   double perimeter=0.0;
       for (int i=0; i<veritices.length-2; i++){
           double distance=veritices[i].determineTo(veritices[i+1]);
        perimeter+=perimeter;
    }
       perimeter+=veritices[veritices.length-1].determineTo(veritices[0]);
       return perimeter;
    }
       
    

    @Override
    public String toString() {
        return "Polygon{" + "veritices=" + Arrays.toString(veritices) + '}';
    }

   
}
