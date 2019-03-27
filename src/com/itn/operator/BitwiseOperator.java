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
public class BitwiseOperator {
 public static void main(String [] args){
     int a=101;
     int b=85;
     //bitwise logical operation
     System.out.println("bitwse logical -AND operation "+(a&b));
     System.out.println("bitwise logical-OR operation " +(~a));
     //shift operator 
     System.out.println("bitwise left-shift operation of "+a+" is "+(a<<1));
     System.out.println("bitwise right-shift operation of "+a+" is "+(a>>1));
     System.out.println("bitwise left-shift 2-bit and update operand operation of "+a+" is "+(a<<=2));
     System.out.println("bitwise rght-shift 2-bit and operand  operation of "+a+" is "+(a>>=2));
 }   
}
