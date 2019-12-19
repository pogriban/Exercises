/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex8;

/**
 *
 * @author ThinkPad
 */
public class Main8_2 {
    public static void main (String args[]){
        Dog dog1 =new Dog();
        Dog dog2 =new Dog();
        dog1.age=1;
        dog2.age=2;
        int var1=10;
        int var2=11;
        System.out.println(dog1.age);
        System.out.println(dog2.age);
        System.out.println(var1);
        System.out.println(var2);
        var2=var1;
        dog1=dog2;
        System.out.println(dog1.age);
        System.out.println(dog2.age);
        System.out.println(var1);
        System.out.println(var2);
        var2=12;
        dog1.age=3;
        System.out.println(dog1.age);
        System.out.println(dog2.age);
        System.out.println(var1);
        System.out.println(var2);
                
    }
    
}
