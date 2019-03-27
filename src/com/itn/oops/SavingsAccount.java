/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author sumit
 */
public class SavingsAccount extends Account {
   public double interest;
   public  String type;
   
   public double minBalance;  
   public double  withdrawlLimit;
   
   public  void openSavingAccount(){
       //create an bank account 
       createAccount(); //method inherited from Account Classs
       // add details  related to savingsAccount
       interest =4.00;
       type="Daily Savings";
       minBalance=1000;
       withdrawlLimit=10000;
       
   }
   // since we applied withdrawl related policies we have to overrde withdrawl method that suits our saving account 
   
   @Override
   public  void  withdrawl(double amount){
       if  (amount > withdrawlLimit && this.amount-amount<1000){
           System.out.println("withdrawl not possible ");
       }else{
           this.amount-= amount;
           System.out.println("Amount withdrawn : "+amount);
           System.out.println("New amount : "+this.amount);
       }
   }
}
