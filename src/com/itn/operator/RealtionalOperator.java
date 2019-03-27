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
public class RealtionalOperator {
    public static void  main(String [] args)
    {
        int a=10;
        int b=20;
        //realtional operator is used to compare between two operands
        System.out.println("first value is greater than second  "+( a>b));
        //result of relational opration is  the boolean value(true/false)
        System.out.println("first is less than second "+(a<b));
        System.out.println("first is eqals to seconnd"+(a==b));
        //only used to compare the values and primitive varables
        System.out.println("first is not equal to second"+(a!=b));
        System.out.println("first number s greater than or equals to second"+(a>=b));
        System.out.println("first is less than equals to second "+(a<=b));
    }
}
