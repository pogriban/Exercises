/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex9;

/**
 *
 * @author ThinkPad
 */
public class Main9_2 {
    public static void main(String args[]){
        Acces a = new Acces();
        
       
        Acces.getCounter();
        a.count();
        Acces.counter++;
        System.out.println("Final "+Acces.counter);
    }
            
    
}
