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
public class NotRecivedReport extends Message implements Serializable{
    static final long serialVersionUID = 100L;

    public NotRecivedReport(String msgKey) {
        super(msgKey);
    }
}
