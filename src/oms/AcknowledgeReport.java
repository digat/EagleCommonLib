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
public class AcknowledgeReport extends Message implements Serializable{
    static final long serialVersionUID = 22L;

    public AcknowledgeReport(String msgKey) {
        super(msgKey);
    }
}
