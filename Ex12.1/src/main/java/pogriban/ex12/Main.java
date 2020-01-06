/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex12;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main (String args[]){
        String a="Let's go home, it's late already";
        String b="Let's go home, it's latE already";
        boolean q;
        System.out.println("Index 6 " + a.charAt(6));
        System.out.println("Index 10 " + a.charAt(10));
        System.out.println(a.contains("late"));
        //System.out.println(endswith(a));
        q=a.endsWith(" already");
        System.out.println(q);
        if (a.equals(b)){System.out.println(true);}
        else {System.out.println(false);}
        System.out.println(a.equalsIgnoreCase(b));
        String f="The quick brown fox jumps over the lazy dog";
        System.out.println(f.replace('d', 'f'));
        System.out.println(f.toLowerCase());
        String w="     Java Exercises       ";
        System.out.print(w.trim());
        System.out.println(":");
        
        
    }
    //swing

          //  fx.java
                    }
