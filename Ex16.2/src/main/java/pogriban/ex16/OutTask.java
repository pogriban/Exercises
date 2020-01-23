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
public class OutTask extends AbstactTask{

    
    
    public int iii=0;

    public OutTask(String id, LocalDateTime createdAt, LocalDateTime executedAt) {
        super(id, createdAt, executedAt);
    }

    
    public void execute(String id1){
        iii++;
        System.out.println(id1);
            
        }
        
    }
    
