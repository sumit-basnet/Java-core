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
public class CustomException {
    static int fund =900;
    public static void withdrawl(int amount) throws  Exception {
     if(fund>amount){
         fund-=amount;
         System.out.println("withdrawl Successful ");
     }else{
         throw new InsufficientFundException("Fund is not Sufficient for Withdrawl");
     }   
    }
    
    public static void main(String[] args) {
    int amount =1000;
    try{
    withdrawl(amount);
    }
    catch(Exception e){
        System.out.println(e);
    }
  }
}
