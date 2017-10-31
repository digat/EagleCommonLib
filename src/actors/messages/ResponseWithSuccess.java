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
public class ResponseWithSuccess {
    private final String result;
    private final Channel channel;
    private final String id;

    public ResponseWithSuccess(String result, Channel channel, String id) {
        this.result = result;
        this.channel = channel;
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public Channel getChannel() {
        return channel;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "[ResponseWithSuccess]: [id]" +id+" [result] "+result; 
    }    
}
