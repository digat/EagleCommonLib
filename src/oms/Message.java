/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import com.fasterxml.uuid.Generators;
import java.io.Serializable;

/**
 *
 * @author Tareq
 */
public abstract class Message implements Serializable {
    static final long serialVersionUID = 21L;
    private final String msgKey;    
    private final String key;
    //public abstract Object getMessage();

    public Message(String msgKey) {
        this.msgKey = msgKey;
        key = Generators.randomBasedGenerator().generate().toString();
    }

    public String getMsgKey() {
        return msgKey;
    }

    public String getKey() {
        return key;
    }

    
}
