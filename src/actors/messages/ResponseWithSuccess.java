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

    public ResponseWithSuccess(String result, Channel channel) {
        this.result = result;
        this.channel = channel;
    }

    public String getResult() {
        return result;
    }

    public Channel getChannel() {
        return channel;
    }
}
