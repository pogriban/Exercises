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
public class RandomOutTask extends AbstactTask implements Task{
    public int ii=0;

    public RandomOutTask(String id, LocalDateTime createdAt, LocalDateTime executedAt) {
        super(id, createdAt, executedAt);
    }

    
    public void execute(){
        //AbstactTask time=new AbstactTask();
        //LocalDateTime r=time.setCreatedAt(LocalDateTime.MAX);
        ii++;
        int ran=(int)(Math.random()*100);
        System.out.println("Random numberis is: "+ran+" time "+super.getCreatedAt());
        
    }
    
}
