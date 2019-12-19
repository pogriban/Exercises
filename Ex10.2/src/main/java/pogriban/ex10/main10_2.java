/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex10;

/**
 *
 * @author ThinkPad
 */
public class main10_2 {

    public static void main(String args[]) {
        int seidLength = 3;
        int length = 2;
        int width = 3;
        System.out.println("Aria dreptunghi " + calculateArea(length, width));
        System.out.println("Aria patrat " + calculateArea(seidLength));
        System.out.println("Perimetru dreptunghi " + calculatePerimeter(length, width));
        System.out.println("Perimetru patrat " + calculatePerimeter(seidLength));

    }

    static double calculateArea(int length, int width) {
        double area;
        area = length * width;
        return area;

    }

    static int calculateArea(int seidLength) {
        int area;
        area = seidLength * seidLength;
        return area;
    }

    static double calculatePerimeter(int length, int width) {
        double perimeter;
        perimeter = (length + width) * 2;
        return perimeter;
    }

    static int calculatePerimeter(int seidLength) {
        int perimeter;
        perimeter = seidLength * 4;
        return perimeter;
    }

}
