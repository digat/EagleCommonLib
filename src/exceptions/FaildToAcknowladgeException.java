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
public class FaildToAcknowladgeException extends Exception {

    public FaildToAcknowladgeException() {
        super("Faild To Acknowladge from FIX handler, thus Rejected by OMS");
    }
    
}