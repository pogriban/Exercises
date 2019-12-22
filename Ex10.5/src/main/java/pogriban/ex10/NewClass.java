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
public class NewClass {

    public static void main(String args[]) {

        System.out.println(integerPower(2, 4));


    } 

    static int integerPower(int b, int exp) {
        int c=1;
        int i=0;
        //int ba =2;
        //for (int i = 0; i < exp; i++) {
        //c*=b;
        //}
        while(i++<exp){
            c*=b;
        }
        return c;
    }
    
}
