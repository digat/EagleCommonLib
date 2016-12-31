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
public class ExecutionReport extends Message implements Serializable{
    static final long serialVersionUID = 25L;
    private String orderID; 
    private String clOrdID;
    private String origClOrdID;
    private String execID;
    private String execType;
    private String ordStatus;
    private String account; 
    private String side;
    private double orderQty;
    private int ordType;
    private double price;
    private int timeInForce;
    private String tradingSessionID;
    private double leavesQty;
    private double cumQty;
    private double avgPx;
    private double lastPx;
    private double grossTradeAmt;
    private String transactTime; 
    private String settlDate;
    private String securityID; //seccode
    private String trdMatchID;
    private double minQty;
    private String text;
    private String ordRejReason;
    private int msgSeqNum;
    private int cxlRejResponseTo;
    private String cxlRejReason;
    private String tradeDate;

    public ExecutionReport(String msgKey) {
        super(msgKey);
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getClOrdID() {
        return clOrdID;
    }

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }

    public String getOrigClOrdID() {
        return origClOrdID;
    }

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
    }

    public String getExecID() {
        return execID;
    }

    public void setExecID(String execID) {
        this.execID = execID;
    }


    public String getExecType() {
        return execType;
    }

    public void setExecType(String execType) {
        this.execType = execType;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(double orderQty) {
        this.orderQty = orderQty;
    }

    public int getOrdType() {
        return ordType;
    }

    public void setOrdType(int ordType) {
        this.ordType = ordType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(int timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getTradingSessionID() {
        return tradingSessionID;
    }

    public void setTradingSessionID(String tradingSessionID) {
        this.tradingSessionID = tradingSessionID;
    }

    public double getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(double leavesQty) {
        this.leavesQty = leavesQty;
    }

    public double getCumQty() {
        return cumQty;
    }

    public void setCumQty(double cumQty) {
        this.cumQty = cumQty;
    }

    public double getAvgPx() {
        return avgPx;
    }

    public void setAvgPx(double avgPx) {
        this.avgPx = avgPx;
    }

    public double getLastPx() {
        return lastPx;
    }

    public void setLastPx(double lastPx) {
        this.lastPx = lastPx;
    }

    public double getGrossTradeAmt() {
        return grossTradeAmt;
    }

    public void setGrossTradeAmt(double grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }

    public String getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(String transactTime) {
        this.transactTime = transactTime;
    }

    public String getSettlDate() {
        return settlDate;
    }

    public void setSettlDate(String settlDate) {
        this.settlDate = settlDate;
    }

    public String getSecurityID() {
        return securityID;
    }

    public void setSecurityID(String securityID) {
        this.securityID = securityID;
    }

    public String getTrdMatchID() {
        return trdMatchID;
    }

    public void setTrdMatchID(String trdMatchID) {
        this.trdMatchID = trdMatchID;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOrdRejReason() {
        return ordRejReason;
    }

    public void setOrdRejReason(String ordRejReason) {
        this.ordRejReason = ordRejReason;
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

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    
}
