/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class MethodDemo {
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter firstnumber: ");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("the sum  is : "+(a+b));
    }
    
    public int sum(int a, int b ){
        return a+b;
    }
    // third is same as second  method AS THEY BOTH HAVE SAME SIGNATURE
    // 1.they both have same name
    // 2. they both same no. of paramters of same type
    // they have different return type but it doesnot change f its signature
    // so both methods are considered same method which java won't allow
//    public void sum(int x , int y){
//        System.out.println("the sum is : "+(x+y));
//    }
    public void sum(double a,double b){
        System.out.println("the sum is  : "+(a+b));
    }
    
    // same method name used for different methods( that differs in signature)
    //is considered method overloading 
    public static void main(String[] args) {
        MethodDemo md=new MethodDemo();
        md.sum();
        // no parameter method called
       int sum= md.sum(10,20);
        // sum method with two integer parameter called
        System.out.println("sum is "+ sum);
        md.sum(12.00,14.00);
        //calls sum method  with double parameters
        
    }
}
