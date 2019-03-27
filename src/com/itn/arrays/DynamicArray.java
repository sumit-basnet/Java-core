/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.arrays;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class DynamicArray {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        // creating and initializing an array with given size during runtime
        System.out.println("enter size of an array");
        n =sc.nextInt();
        
        int [] dyna = new int[n];
        //array of size n is created at run time
        for(int i = 0;i<n;i++){
        System.out.print("dyna["+i+"]: ");
        dyna[i]=sc.nextInt();
    }
        
        
    }
}
