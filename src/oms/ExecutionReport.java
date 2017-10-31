/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import com.Enums.ExecInst;
import com.Enums.ExecType;
import com.Enums.KwOrderType;
import com.Enums.OrdRejReason;
import com.Enums.OrdStatus;
import com.Enums.Side;
import com.Enums.TimeInForce;
import java.io.Serializable;
import java.lang.reflect.Field;


/**
 *
 * @author Tareq
 */
public class ExecutionReport extends Message implements Serializable {

    static final long serialVersionUID = 25L;

    private String orderID;
    private String clOrdID;
    private String origClOrdID;
    private String execID;
    private ExecType execType;
    private OrdStatus ordStatus;
    private String account;
    private Side side;
    private double orderQty;
    private KwOrderType ordType;
    private double price;
    private TimeInForce timeInForce;
    private String tradingSessionID;
    private double leavesQty;
    private double cumQty;
    private double avgPx;
    private double lastPx;
    private double lastQty;
    private double grossTradeAmt;
    private String transactTime;
    private String settlDate;
    private String securityID; //seccode 
    private String trdMatchID;
    private double minQty;
    private String text;
    private OrdRejReason ordRejReason;
    private int msgSeqNum;
    private int cxlRejResponseTo;
    private String cxlRejReason;
    private String tradeDate;
    private String expireDate;
    private String expireTime;
    private ExecInst execInst;
    private String marketId;
    private String fixRefMsg;

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

    public ExecType getExecType() {
        return execType;
    }

    public void setExecType(ExecType execType) {
        this.execType = execType;
    }

    public OrdStatus getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(OrdStatus ordStatus) {
        this.ordStatus = ordStatus;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(double orderQty) {
        this.orderQty = orderQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public KwOrderType getOrdType() {
        return ordType;
    }

    public void setOrdType(KwOrderType ordType) {
        this.ordType = ordType;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public OrdRejReason getOrdRejReason() {
        return ordRejReason;
    }

    public void setOrdRejReason(OrdRejReason ordRejReason) {
        this.ordRejReason = ordRejReason;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
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

    public void setExecInst(ExecInst execInst) {
        this.execInst = execInst;
    }

    public ExecInst getExecInst() {
        return execInst;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getFixRefMsg() {
        return fixRefMsg;
    }

    public void setFixRefMsg(String fixRefMsg) {
        this.fixRefMsg = fixRefMsg;
    }

    public double getLastQty() {
        return lastQty;
    }

    public void setLastQty(double lastQty) {
        this.lastQty = lastQty;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ExecutionReport] ");
        sb.append("[").append(execType.name()).append("] ");
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
