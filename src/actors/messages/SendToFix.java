/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import classes.Transaction;

/**
 *
 * @author Tareq
 */
public class SendToFix {
    private final Transaction transaction;
    private int numberOfTries = 0;

    public SendToFix(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[SendToFix] ")
                .append("[transaction] ")
                .append(transaction)
                .append("[numberOfTries] ")
                .append(numberOfTries);
        return sb.toString();
    }        
}
