/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.ExceptionHandling;

/**
 *
 * @author sumit
 */
public class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        super();
        
    }
    public  InsufficientFundException(String message){
        super(message);
    }
    
}
