/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex16;

import java.time.LocalDateTime;

/**
 *
 * @author ThinkPad
 */
public class Main16_2 {
    public static void main(String args[]){
        //AbstactTask abs= new AbstactTask();
        //System.out.println("abs "+abs);
        
        RandomOutTask random=new RandomOutTask("",LocalDateTime.now(),LocalDateTime.now());
        random.execute();
        OutTask tas = new OutTask("",LocalDateTime.now(),LocalDateTime.now());
        tas.execute("Mesajul ca parametru");
        CounterOurTask ourTask=new CounterOurTask("",LocalDateTime.now(),LocalDateTime.now());
        ourTask.execute();
        int count=tas.iii+ourTask.i+random.ii;
        System.out.println("execute() was executed : "+count+" times");
        
        //time.setCreatedAt(LocalDateTime.MAX);
    }
    
}
