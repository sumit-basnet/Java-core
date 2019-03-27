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
public class AbcBank {
    public static void main(String[] args) {
        SavingsAccount ac1= new SavingsAccount();
        ac1.openSavingAccount();
        //fill account details
        ac1.deposite(10000);
        ac1.viewAccount();
        //show account details
        
        SavingsAccount ac2 = new SavingsAccount();
        ac2.createAccount();
        ac2.deposite(5000);
        
        Account ac3= new SavingsAccount();// yesma  ac3 is the object of the SavingAccount tara Ac3 ma content chai Account class
        // ko hunxa so as yo child calss ko object ho so yesle overriden method lai call gaarxa
        ac3.createAccount();
        ac3.deposite(1000);
        
        Account ac4 = new Account();
        ac4.createAccount();
        ac4.deposite(1200);
        
        ac1.withdrawl(8000);
        ac2.withdrawl(12000);
        
        ac3.withdrawl(500);// this calls overidden method in child  class
        ac4.withdrawl(15000);// this calls  method in parent class
        // both are refrences of account class(ac3 and ac4) 
        //but they decide which method to call only at run time when they are assigned an object 
        //if they are assigned child object they call overridden method of child class or else they will
        // call parent class method
        
    }
}
