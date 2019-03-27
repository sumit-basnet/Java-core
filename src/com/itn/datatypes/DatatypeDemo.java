/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.datatypes;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class DatatypeDemo {
   public static void main(String[] args){
   //declaring local variables
   byte b1; // variable declaration
   //declared localvarable  should be iitialized before using it 
   b1=100; // variablr b is nitialized with literal value=100;
   byte b2=0b01010101;//variable declaration and ntializaton
   //byte type variable initialized with binary value;
   System.out.println("enter value fro b3 in bnary sequence :");
   byte b3;
   Scanner sc=new Scanner(System.in);
   //b3=sc.nextByte();// input as a regular numeric value
   b3=sc.nextByte(2); // here 2 means the value is of base 2 i.e binary input
   System.out.println(b3);
   
   short s1= 32767;
   int i=2_147_481_299;//integer is default literal;
   //underscore is allowed for  representing comma;
   long l1= 2_918_989_981_001_381_101L;
   float f= 19.57f; // doubles default literal;
   //float tyoe varable f is assigned with float literal 19.57f;
   float f1=10000000.1000000f;
       System.out.println(f1);
   double d=18.55; //default  is a double literal for floating point numbers
   char c1='a';
   char c2=98; //acsii equivalent
   char c3='\u2345';
   char c4='\u2321';
   System.out.println((int)c1);// number form char
   
   System.out.println(c2); // char form number
   System.out.println(c3);
   System.out.println(c4);
   boolean bool =true;
   }
}
