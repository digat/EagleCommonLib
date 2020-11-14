/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author digat
 */
public class ParssingNullException extends Exception {

    public ParssingNullException() {
        super();
    }

    public ParssingNullException(String message) {
        super(message);
    }

    public ParssingNullException(Throwable cause) {
        super(cause);
    }
    
}
