/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

/**
 *
 * @author Tareq
 */
public class FeedbackStateMessage {
    private final String clOrdID; 
    private final String marketId; 
    private String errorText;

    public FeedbackStateMessage(String clOrdID, String marketId) {
        this.clOrdID = clOrdID;
        this.marketId = marketId;
    }

    public FeedbackStateMessage(String clOrdID, String marketId, String message) {
        this.clOrdID = clOrdID;
        this.marketId = marketId;
        this.errorText = message;
    }

    public String getClOrdID() {
        return clOrdID;
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
    
}
