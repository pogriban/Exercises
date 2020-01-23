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
        Point topLeftCorner=new Point(topRightCorner.getX()-width, topRightCorner.getY());
        Point bottomLeftCorner=new Point(topLeftCorner.getX(), topLeftCorner.getY()-height);
        Point bottomRightCorner=new Point(bottomLeftCorner.getX()+width, bottomLeftCorner.getY()); 
        veritices =new Point[4];
        veritices[0]=topRightCorner;
        veritices[1]=topLeftCorner;
        veritices[2]=bottomLeftCorner;
        veritices[3]=bottomRightCorner;
        
    }
    @Override
    public double getPerimeter (){
        return super.getPerimeter();
    }
    @Override
    public double getSurface(){
        double width=veritices[1].determineTo(veritices[0]);
        double height=veritices[0].determineTo(veritices[3]);
        return width*height;
        
    }

    
}
