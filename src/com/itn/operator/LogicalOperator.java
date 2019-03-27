/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.operator;

/**
 *
 * @author sumit
 */
public class LogicalOperator {
   public static void main(String [] args){
    // & | !
    boolean b1=true;
    boolean b2=false;
       System.out.println("logical -and operator "+(b1 & b2));
       System.out.println("logcal -or operator "+(b1|b2));
       System.out.println("logical -not operation "+(!b1));
       System.out.println("logical -NOR operator "+(b1^b2));
       //error returns true if operand are odd valued
       
       //logical short circuit operator
       int a=10,b=20,c=30;
       if((a>b)&&(a<c++)){
           System.out.println("operation performed");
           // a>b returns false
           //for and operaton if one operand is false thenthe total outcome is evaluated as false
           //our left side is false so we wont reach our right side to evaluate c++ hence result is 30 not 31
       }System.out.println(c);
   }
    
}
