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
public class Coordonate {
    int x, y;
    void aflaCoord(){
        if(x<0&&y<0)
            System.out.println("Cadran 3 ");
        if(x>0&&y>0)
            System.out.println("Cadran 1 ");
        if(x>0&&y<0)
            System.out.println("Cadran 4 ");
        if(x<0&&y>0)
            System.out.println("Cadran 2 ");
    }
}
