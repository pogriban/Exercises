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

    int length;
    int width;
    int option=0;

    void calcArea() {
        int area = 0;
        area = length * width;
        System.out.println("Aria " + area);
    }

    void calcPerim() {
        int perim = 0;
        perim = 2 * length + 2 * width;
        System.out.println("Perimetru " + perim);
    }
}
