/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Tareq
 */
public class SendingException extends Exception {

    public SendingException() {
        super();
    }

    public SendingException(String message) {
        super(message);
    }

    public SendingException(Throwable cause) {
        super(cause);
    }
    
}
