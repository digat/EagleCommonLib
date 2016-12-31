/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import java.io.Serializable;

/**
 *
 * @author Tareq
 */
public abstract class Message implements Serializable {
    static final long serialVersionUID = 21L;
    private final String msgKey;    
    //public abstract Object getMessage();

    public Message(String msgKey) {
        this.msgKey = msgKey;
    }

    public String getMsgKey() {
        return msgKey;
    }

    
}
