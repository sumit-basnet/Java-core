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
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a,b;
        //declaraing an array
        //initialization of array
        a=new int[4];
        b=new int[3];
        //new keyword  creates a memory location for 4 integers in case of array a
        // once created the size of a- array cannot be changed
        
        System.out.println(a[1]);
        //an array will be  initalzed with a default value
        //assgning a value to array elements
        
        System.out.println("enter value for first array element ");
        b[0]=12;
        b[1]=43;
        b[2]=55;
        //b[3]=32; 
                 // index 3 represent 4th element
                //in our array we only have 3 elements so there is not 4th element which violates access rules
               //and causes exception to be thrown
              //using for  loop to assign value for all array elemnts
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("enter array element "+(i+1));
            a[i]=sc.nextInt();
        }
        //we cannot use foreach loop  to assign a value for array element
       //though we can use it to access the array
       for(int i: a){
           System.out.print(i+"\t");
       }

    }
}
