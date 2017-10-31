/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oms;

import com.Enums.Side;
import java.io.Serializable;
import java.lang.reflect.Field;

/**
 *
 * @author Tareq
 */
public class CancelOrder extends Message implements Serializable{
    static final long serialVersionUID = 23L;
    
    private String orderID; 
    private String origClOrdID; 
    private String secCode; 
    private Side side; 
    private String clOrdID;
    private int marketId;

    public CancelOrder(String msgKey) {
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

    public String getClOrdID() {
        return clOrdID;
    }

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[CancelOrder] ");
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
