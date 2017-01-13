/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Tareq
 */
public abstract class TimeBased {
    private final long creattionTime;

    public TimeBased() {
        creattionTime = System.nanoTime();
    }
    public TimeBased(long creattionTime) {
        this.creattionTime = creattionTime;
    }
    public int elapsedReadTime() {
        return (int) ((System.nanoTime() - creattionTime) / 1000000);//MS
    }    
}
