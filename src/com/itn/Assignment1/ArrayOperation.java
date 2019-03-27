/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Assignment1;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class ArrayOperation {
    public static void main(String[] args) {
            
    
    Integer [] A;
    A= new Integer[10];
    Scanner sc= new Scanner(System.in);
    int sum=0;
    System.out.println("enter the elements ");
    for(int i=0;i<10;i++){
        A[i]= sc.nextInt();
        sum=sum+A[i];
    }
    int avg=sum/10;
    System.out.println("the average value is  "+(avg));
    int max=A[0],min=A[0];
    
    for(int i=1;i<10;i++){
        if (A[i]>max){
            max=A[i];
        }
    }
    System.out.println("the maximum value is "+max);
   
    for(int i=1;i<10;i++){
        if (A[i]<min){
            min=A[i];
        }
    }
        System.out.println("the minimum value is  "+min);
    
    
    
 }
}
