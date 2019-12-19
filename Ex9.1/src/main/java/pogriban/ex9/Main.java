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
public class Main {
    public static void main (String args[]){
        Constante b=new Constante();
        //pentru ca sa avem acces la variabila a prin obiect
        //clasa Constante poate fi public sau default
        
        //System.out.println(b.a);//   .a variabila refetinta
        //System.out.println(b.a1);//  .a1 variabila refetinta
        //System.out.println(b.a3);//  .a3 variabila refetinta
        //System.out.println(b.a4);//  .a4 variabila refetinta
        
        //fiind metoga main stica si variabila a trebuie sa fie static
        System.out.println(Constante.a);//   acces prin nume de Class
        System.out.println(Constante.a1);//  acces prin nume de Class
        System.out.println(Constante.a3);//  acces prin nume de Class
        System.out.println(Constante.a4);//  acces prin nume de Class
       
    }
}
