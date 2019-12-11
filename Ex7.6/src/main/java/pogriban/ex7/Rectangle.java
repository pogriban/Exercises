/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex7;

/**
 *
 * @author ThinkPad
 */
public class Rectangle {
    int length=0;
    int width=0;
    void calcPerim(){
    int perim=2* length+ 2* width;
    System.out.println("Perimetru "+ perim);
}
}
