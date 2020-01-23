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
        veritices=new Point[3];
        veritices[0]=cornerOne;
        veritices[1]=cornerTwo;
        veritices[2]=cornerThree;
    }
    public boolean isIsosceles(){
       double l1= veritices[0].determineTo(veritices[1]);
       double l2= veritices[1].determineTo(veritices[2]);
       double l3= veritices[2].determineTo(veritices[0]);
       return l2==l3||l1==l2||l3==l1;
       
    }
    public boolean isEquilateral(){
        double l1= veritices[0].determineTo(veritices[1]);
       double l2= veritices[1].determineTo(veritices[2]);
       double l3= veritices[2].determineTo(veritices[0]);
       return l1==l2&&l2==l3;
    }
    public boolean isRight(){
       double l1= veritices[0].determineTo(veritices[1]);
       double l2= veritices[1].determineTo(veritices[2]);
       double l3= veritices[2].determineTo(veritices[0]);
       return veritices[0].getX()==veritices[1].getX()&&veritices[0].getY()==veritices[2].getY()
      || veritices[0].getY()==veritices[1].getY()&&veritices[1].getX()==veritices[2].getX()
      || veritices[0].getY()==veritices[2].getY()&&veritices[1].getX()==veritices[2].getX();
    }
    public double getSurface(){
        double l1= veritices[0].determineTo(veritices[1]);
       double l2= veritices[1].determineTo(veritices[2]);
       double l3= veritices[2].determineTo(veritices[0]);
        double perimeter=super.getPerimeter();
        double s=perimeter/2;
        return Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        
    }
}
