

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String ... args){
     Student student =  new Student();
     student.name = "Ion" ;
     student.roll_on =2;
     //System.out.println("Name is :" + student.name);
     // System.out.println("Roll nr is :" + student.roll_on);
      student.printStudent();
    }
    
}
