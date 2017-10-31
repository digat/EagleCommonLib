/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import java.io.Serializable;

/**
 *
 * @author madfooatcom
 */
public class TestRequest extends Message implements Serializable{
    static final long serialVersionUID = 999L;

    public TestRequest(String msgKey) {
        super(msgKey);
    }
    
}
