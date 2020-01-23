/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex16;

/**
 *
 * @author ThinkPad
 */
public  class Circle implements IMovable{
    private Point center;
    private int radius;
    
    public Circle(Point point, int radius) {
        this.center = point;
        this.radius = radius;
    }

    @Override
    public void moveUp(int distance) {
        center.setY(center.getY()+distance);
        
        }

    @Override
    public void moveDown(int distance) {
        center.setY(center.getY()-distance);
        
          }

    @Override
    public void moveLeft(int distance) {
       center.setX(center.getX()-distance);  
    }

    @Override
    public void moveRight(int distance) {
         center.setX(center.getX()+distance);
    }

    @Override
    public String toString() {
        return "Circle{" + "point=" + center + ", radius=" + radius + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
