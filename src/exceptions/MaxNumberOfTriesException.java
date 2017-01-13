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
public class MaxNumberOfTriesException extends Exception {

    public MaxNumberOfTriesException() {
        super("Transaction reach max number of tries to be sent to Fix handler, thus Rejected by OMS");
    }
    
}
