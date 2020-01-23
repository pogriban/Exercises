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
public class CounterOurTask extends AbstactTask implements Task{
    public int i=0;

    public CounterOurTask(String id, LocalDateTime createdAt, LocalDateTime executedAt) {
        super(id, createdAt, executedAt);
    }
    @Override
    public void execute(){
       
        
        i++;
        System.out.println("Counter "+i);
    }
    
}
