/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex15;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String args []){
        Person p=new Person("Ion", "Chisinau");
        Student s=new Student("Ana", "Balti", "C", 2000, 2345.8);
        System.out.println(p);
        System.out.println(s);
    }
    
}
