/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.Enums.TransactionType;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import exceptions.SendingException;
import java.util.Map;

/**
 *
 * @author Tareq
 */
public class Transaction extends TimeBased {

    private TransactionType transactionType;
    private final Map<String, String> parameters;
    private SendingException sendingException = null;

    public Transaction(long time, Map<String, String> orderXmlParams, Multimap<String, Data> dbResult) {
        super(time);
        parameters = Maps.newHashMap();
        if (orderXmlParams != null) {
            parameters.putAll(orderXmlParams);
        }
        parameters.putAll(dbResult.entries().stream().findFirst().get().getValue().getValues());
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public SendingException getSendingException() {
        return sendingException;
    }

    public void setSendingException(SendingException sendingException) {
        this.sendingException = sendingException;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Transaction] ")
                .append("[parameters] ")
                .append(parameters)
                .append("[SendingException] ")
                .append(sendingException != null ? sendingException.getMessage() : "")
                .append("[transactionType] ")
                .append(transactionType.name());
        return sb.toString();
    }
}
