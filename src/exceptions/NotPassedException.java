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
public class NotPassedException extends Exception {

    public NotPassedException() {
        super();
    }

    public NotPassedException(String message) {
        super(message);
    }

    public NotPassedException(Throwable cause) {
        super(cause);
    }
    
}
