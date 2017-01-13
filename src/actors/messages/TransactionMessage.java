/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import classes.Functions;
import classes.TimeBased;
import com.Enums.TransactionType;
import java.util.Map;

/**
 *
 * @author Tareq
 */
public class TransactionMessage extends TimeBased{
    private final Map<String, String> result;
    private final TransactionType transactionType;
    private final String clorderIdGenrated;

    public TransactionMessage(Map<String, String> result, TransactionType transactionType) {
        super();
        this.result = result;
        this.transactionType = transactionType;
        clorderIdGenrated = Functions.generateId();
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public String getClorderIdGenrated() {
        return clorderIdGenrated;
    }

    public Map<String, String> getResult() {
        return result;
    }
}
