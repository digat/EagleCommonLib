/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import io.netty.channel.Channel;

/**
 *
 * @author Tareq
 */
public class ResponseWithError {
    private final Throwable error;
    private final Channel channel;
    private final String id;
    private final String opStatus;
    private final String orginalMessage;
    public ResponseWithError(Throwable error, Channel channel, String id, String opStatus) {
        this.error = error;
        this.channel = channel;
        this.id = id;
        this.opStatus = opStatus;
        this.orginalMessage = null;
    }    
    public ResponseWithError(Throwable error, Channel channel, String id, String opStatus, String orginalMessage) {
        this.error = error;
        this.channel = channel;
        this.id = id;
        this.opStatus = opStatus;
        this.orginalMessage = orginalMessage;
    }

    public Throwable getError() {
        return error;
    }

    public Channel getChannel() {
        return channel;
    }

    public String getId() {
        return id;
    }

    public String getOpStatus() {
        return opStatus;
    }

    public String getOrginalMessage() {
        return orginalMessage;
    }
    
    @Override
    public String toString() {
        return "[ResponseWithError]: [id]" +id+" [opStatus] "+opStatus+" [error] "+error.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
