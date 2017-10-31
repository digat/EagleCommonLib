/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import classes.Functions;
import classes.TimeBased;
import com.Enums.TransactionType;
import io.netty.channel.Channel;
import java.util.Map;

/**
 *
 * @author Tareq
 */
public class TransactionMessage extends TimeBased{
    private final Map<String, String> result;
    private final TransactionType transactionType;
    private final String clorderIdGenrated;
    private final Channel channel;
     private final String id;

    public TransactionMessage(Map<String, String> result, TransactionType transactionType, Channel channel, String id) {
        super();
        this.result = result;
        this.transactionType = transactionType;
        clorderIdGenrated = Functions.generateId();
        this.channel = channel;
        this.id = id;
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

    public Channel getChannel() {
        return channel;
    }

    public String getId() {
        return id;
    }


    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionMessage ")
                .append("[id] ")
                .append(id)
                .append("[clorderIdGenrated] ")
                .append(clorderIdGenrated)
                .append("[transactionType] ")
                .append(transactionType.name())
                .append("[xml] ")
                .append(result);
        return sb.toString();
    }
}
