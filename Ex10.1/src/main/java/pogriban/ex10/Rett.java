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
public class Rett {
   static boolean isPositive(int numberToCheck){
    boolean result;
        if(numberToCheck>=0) {
            result =true;
        }
        else {
            result=false;
        }
        return result;
        // sau   return numberToCheck>=0;
    } 
}
        