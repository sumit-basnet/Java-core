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
public class ExceptionPropogation {
    public void calculate(int a, int b) throws ClassNotFoundException {
        System.out.println("Sum is "+(a+b));
        System.out.println("divide is "+(a/b)); //runtime exception
        
        Class c= Class.forName("com.itn.objects.Box"); //compile time  exception
        //  either i should this exception from within this method 
        // or this method should add throws EXCEPTION
        
    }
    
    public static void main(String[] args) {
        int num1=100, num2 = 0;
        ExceptionPropogation ep= new ExceptionPropogation();
        try{
        ep.calculate(num1,num2);
        }
        catch(ArithmeticException | ClassNotFoundException e){
            System.out.println(e);
        }
        //rules
        //1. we can throw and catch same exception
        //2. we can throw child exception and catch parent exception
        //3. but we can't throw parent exception and catch child  exception
        
        
            System.out.println("calculation finished");
    }
}
