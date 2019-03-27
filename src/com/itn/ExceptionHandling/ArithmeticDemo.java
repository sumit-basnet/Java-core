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
public class ArithmeticDemo {
    public static void main(String[] args) {
        //divide by zero exception
        int a= 10,b=0;
       int result=0;
        try{
         result =a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        System.out.println("Result is "+ result);
        
    }
}
