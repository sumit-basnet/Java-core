/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.operator;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class ArithmeticOperator {
    public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter first number");
        num1=sc.nextInt(); //single  equals is an assignment operator
                               // double equals to realtional operator
        System.out.println("enter second number");
        num2= sc.nextInt();
        
        System.out.println("the sum is " +(num1+num2)); // incae hamle parenthesis narakheeko vaye tyo 2 ota humber concatenate hunxa 
        System.out.println("the difference is "+ (num1-num2));
        System.out.println("the product is "+(num1*num2));
        System.out.println("the divson is "+(num1/num2));
        System.out.println("the remainder is "+(num1%num2));// modulo operator
        
    }
}
