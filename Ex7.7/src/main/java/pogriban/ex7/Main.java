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
        Tablou calcule=new Tablou();
        
    calcule.items=new int[]{1,2,3,4,5,6,7,8,9,8};
    calcule.suma();
    calcule.media();
    calcule.numPar();
    calcule.lung();
        
    }
    
}
