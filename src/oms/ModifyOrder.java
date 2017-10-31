/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import com.Enums.KwOrderType;
import com.Enums.Side;
import com.Enums.TimeInForce;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

/**
 *
 * @author Tareq
 */
public class ModifyOrder extends Message implements Serializable{
    static final long serialVersionUID = 26L;
    
    private String orderID;
    private String origClOrdID;
    private  String secCode;
    private  Side side;
    private  KwOrderType orderType;
    private  TimeInForce timeInForce;
    private  boolean isAllorNon;
    private  String account;
    private  double price;
    private  double orderQty;
    private  double minQty;
    private  Date expireTime;
    private  Date expireDate;
    private  String clOrdID;
    private int marketId;
    
    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }
    
    public ModifyOrder(String msgKey) {
        super(msgKey);
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

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public KwOrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(KwOrderType orderType) {
        this.orderType = orderType;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public boolean isIsAllorNon() {
        return isAllorNon;
    }

    public void setIsAllorNon(boolean isAllorNon) {
        this.isAllorNon = isAllorNon;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(double orderQty) {
        this.orderQty = orderQty;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getClOrdID() {
        return clOrdID;
    }

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ModifyOrder] ");
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
