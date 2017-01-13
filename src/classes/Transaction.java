/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.Enums.TransactionType;
import com.google.common.collect.Multimap;
import exceptions.SendingException;
import java.util.List;

/**
 *
 * @author Tareq
 */
public class Transaction extends TimeBased{
    private TransactionType transactionType;
    private List<String> orderXmlParams; //newLinkedList
    private Multimap<String,Data> dbResult;
    private SendingException sendingException = null;

    public Transaction() {
        super();
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public List<String> getOrderXmlParams() {
        return orderXmlParams;
    }

    public void setOrderXmlParams(List<String> orderXmlParams) {
        this.orderXmlParams = orderXmlParams;
    }

    public Multimap<String, Data> getDbResult() {
        return dbResult;
    }

    public void setDbResult(Multimap<String, Data> dbResult) {
        this.dbResult = dbResult;
    }

    public SendingException getSendingException() {
        return sendingException;
    }

    public void setSendingException(SendingException sendingException) {
        this.sendingException = sendingException;
    }
    
}
