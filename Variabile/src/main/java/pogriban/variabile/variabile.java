/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad
 */
public class variabile {

    public static void main(String[] args) {
        int a = 10;
        double b = 20.3;
        float c = 3.14785f;
        boolean d = true;
        String name = "Eugen";
        String surname = "Pogriban";
        String message;
        long myLong = 12345678998989L;
        float myFloat =  23.2311231231f;
        System.out.println("My name is" + " " + name + " " + surname);
        System.out.println("integer " + a);
        System.out.println("double  " + b);
        System.out.println("Float  " + c);
        System.out.println("Bloolean " + d);
        System.out.println(" Long " + myLong);
        System.out.println("Float " + myFloat);
        int num = (int) myLong;
        System.out.println(num);
        double num1 = (float) myFloat;
        System.out.println(num1);
        int quantity = 13;
        double price = 11.1;
        double tax = 12.3;
        String th = "I want to buy 1 shirt!";
       System.out.println(th + " " + quantity);
       double total;
       total= price * quantity * tax;
       System.out.println("Total cost with tax is " + total);
    }

}
