/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import java.lang.reflect.Field;
import oms.Message;

/**
 *
 * @author Tareq
 */
public class FeedbackStateMessage extends Message{
    private final String clOrdID; 
    private final String origClOrdID;
    private final String marketId; 
    private final char option;
    private String errorText;

    public FeedbackStateMessage(String clOrdID, String origClOrdID, String marketId, char option) {
        super("");
        this.clOrdID = clOrdID;
        this.origClOrdID = origClOrdID;
        this.marketId = marketId;
        this.option = option;
    }

    public FeedbackStateMessage(String clOrdID, String origClOrdID, String marketId, char option, String message) {
        this(clOrdID, origClOrdID, marketId, option);
        this.errorText = message;
    }

    public String getClOrdID() {
        return clOrdID;
    }

    public String getOrigClOrdID() {
        return origClOrdID;
    }

    public String getMarketId() {
        return marketId;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public char getOption() {
        return option;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[FeedbackStateMessage] ");
        for (Field field : this.getClass().getDeclaredFields()) {
            //field.setAccessible(true); // if you want to modify private fields
            try {
                sb.append("[").append(field.getName()).append("] ");
                sb.append(field.get(this));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                sb.append("null");
            }

        }
        return sb.toString();
    }    
    
    
}
