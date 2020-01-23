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
public class AbstactTask {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime executedAt;
public AbstactTask(String id, LocalDateTime createdAt, LocalDateTime executedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.executedAt = executedAt;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(LocalDateTime executedAt) {
        this.executedAt = executedAt;
    }

    @Override
    public String toString() {
        return "AbstactTask{" + "id=" + id + ", createdAt=" + createdAt + ", executedAt=" + executedAt + '}';
    }
    
}
