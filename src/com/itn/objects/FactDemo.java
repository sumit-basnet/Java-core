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
public class FactDemo {
    public static int factorial(int i ){
        if(i==1){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }
    public static int[] sum (int[] abc, int[] xyz){
        int [] sum= new int[5];
        for(int i =0 ;i<5;i++){
            sum[i]=abc[i]+xyz[i];
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("engter number to calculate factorial: ");
        int i= sc.nextInt();
        int fact=FactDemo.factorial(i);
        System.out.println("factoralvalue is : "+fact);
        
       int [] a={1,1,3,4,5};
       int [] b={1,2,4,5,6};
      // int[] add;
       int[] add=sum(a,b);
       for (int j=0;j<5;j++){
               System.out.println("sum is  : "+add[j]);
       }    
       
    }
}
