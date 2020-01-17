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
public class Square extends Rectangle {
    public Square(Point topRigthCorner, int sideLength){
        Point a=topRigthCorner;
        sideLength=2;
    }

    @Override
    public String toString() {
        return "Square{" + '}';
    }
    
}
