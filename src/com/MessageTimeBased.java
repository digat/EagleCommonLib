/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Tareq
 * @param <T>
 */
public class MessageTimeBased<T> {

    private final T msgContent;
    private final long creattionTime;

    public MessageTimeBased(T msgContent) {
        this.msgContent = msgContent;
        creattionTime = System.nanoTime();
    }

    public int elapsedReadTime() {
        return (int) ((System.nanoTime() - creattionTime) / 1000000);//MS
    }

    public T getMsgContent() {
        return msgContent;
    }

}
