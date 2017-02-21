/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import com.Enums.OrdStatus;
import com.Enums.StateRep;
import java.io.Serializable;

/**
 *
 * @author Tareq
 */
public class StateReport extends Message implements Serializable{
    static final long serialVersionUID = 50L;
    private StateRep stateRep;
    private String orderID; 
    private String clOrdID;
    private String origClOrdID;
    private String marketId;
    private OrdStatus ordStatus;
    private int msgSeqNum;
    private int cxlRejResponseTo;
    private String cxlRejReason; 
    private String transactTime; 
    private String fixRefMsg;
    private String text;
            
    public StateReport(String msgKey) {
        super(msgKey);
    }

    public StateRep getStateRep() {
        return stateRep;
    }

    public void setStateRep(StateRep stateRep) {
        this.stateRep = stateRep;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrigClOrdID() {
        return origClOrdID;
    }

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public OrdStatus getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(OrdStatus ordStatus) {
        this.ordStatus = ordStatus;
    }

    public int getMsgSeqNum() {
        return msgSeqNum;
    }

    public void setMsgSeqNum(int msgSeqNum) {
        this.msgSeqNum = msgSeqNum;
    }

    public int getCxlRejResponseTo() {
        return cxlRejResponseTo;
    }

    public void setCxlRejResponseTo(int cxlRejResponseTo) {
        this.cxlRejResponseTo = cxlRejResponseTo;
    }

    public String getCxlRejReason() {
        return cxlRejReason;
    }

    public void setCxlRejReason(String cxlRejReason) {
        this.cxlRejReason = cxlRejReason;
    }

    public String getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(String transactTime) {
        this.transactTime = transactTime;
    }

    public String getFixRefMsg() {
        return fixRefMsg;
    }

    public void setFixRefMsg(String fixRefMsg) {
        this.fixRefMsg = fixRefMsg;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getClOrdID() {
        return clOrdID;
    }

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    
}
