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
    private final long creationTime;

    public TimeBased() {
        creationTime = System.nanoTime();
    }
    public TimeBased(long creattionTime) {
        this.creationTime = creattionTime;
    }
    public int elapsedReadTime() {
        return (int) ((System.nanoTime() - creationTime) / 1000000);//MS
    }    

    public long getCreationTime() {
        return creationTime;
    }

}
