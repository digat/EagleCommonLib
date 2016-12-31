package oms;

import com.Enums.KwOrderType;
import com.Enums.Side;
import com.Enums.TimeInForce;
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tareq
 */
public class CreateNewOrder extends Message implements Serializable{
    static final long serialVersionUID = 24L;
    private Side side; 
    private String secCode;
    private KwOrderType orderType; 
    private TimeInForce timeInForce;
    private boolean isAllorNon; 
    private String account; 
    private double price; 
    private double orderQty; 
    private double minQty;
    private Date expireTime; 
    private Date expireDate;
    private String clOrdID;

    public CreateNewOrder(String msgKey) {
        super(msgKey);
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
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
}
