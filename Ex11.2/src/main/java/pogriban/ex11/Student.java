/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex11;

/**
 *
 * @author ThinkPad
 */
public class Student {
    private String name;
    Student(){
    name="Unknown";
    }
    Student(String n){
        name=n;
       // this("Unknown");
        
    }
    void printStudent(){
        System.out.println(name);
    }
    public static void main(String args[]){
        Student a=new Student();
        Student a1=new Student("IIon");
        a.printStudent();
        a1.printStudent();
    }
}
