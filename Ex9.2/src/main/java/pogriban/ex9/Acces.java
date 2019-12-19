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
public class Acces {

     static int counter;

    static void count() {
        counter=0;
        counter++;
        System.out.println("Count "+counter);
    }

     static void getCounter() {
        System.out.println(" c "+counter);

    }

}
