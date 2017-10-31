/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author madfooatcom
 */
public class OracleApiException extends Exception {

    public OracleApiException() {
        super("Oracle Connection is null...");
    }

    public OracleApiException(String message) {
        super(message);
    }

    public OracleApiException(Throwable cause) {
        super(cause);
    }
    
}

