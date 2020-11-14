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
public class OracleApiResturnNullException extends Exception {

    public OracleApiResturnNullException(String apiName) {
        super("Oracle Api Call return null ! : "+apiName);
    }
    
    public OracleApiResturnNullException(Throwable cause) {
        super(cause);
    }
    
}

