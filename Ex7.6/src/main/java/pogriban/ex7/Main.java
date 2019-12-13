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
public class Main {
    public static void main(String args[]){
       /* Rectangle drept=new Rectangle();
        Circle cerc=new Circle();//creem obiect(instanta) aria
        cerc.radius=3;
        cerc.calcAria();
        drept.length=2;
        drept.width=3;
        drept.calcPerim();
*/
       Shape shapeObject=new Shape();
       shapeObject.cerc.radius=3;
       shapeObject.cerc.calcAria();
       shapeObject.rectangle.length=2;
       shapeObject.rectangle.width=3;
       shapeObject.rectangle.calcPerim();
}

    
}
