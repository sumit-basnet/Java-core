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
public class StringOperation {
    public static void main(String[] args) {
        String[] A;
        A=new String[5];
        System.out.println("enter the names ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            A[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++){
        System.out.print(A[i]+" ");
    }
  }
}
