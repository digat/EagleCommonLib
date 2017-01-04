/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors.messages;

import io.netty.channel.Channel;
import java.io.Serializable;

/**
 *
 * @author Tareq
 */
public class ResponseWithError {
    private final Throwable error;
    private final Channel channel;

    public ResponseWithError(Throwable error, Channel channel) {
        this.error = error;
        this.channel = channel;
    }

    public Throwable getError() {
        return error;
    }

    
}
