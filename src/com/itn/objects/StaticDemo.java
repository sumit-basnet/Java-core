/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

/**
 *
 * @author sumit
 */
public class StaticDemo {
 static{
     System.out.println("Static block 1..");
     
 }   
 
    public static void main(String[] args) {
        System.out.println("main method started..");
    }
    
    static{
        System.out.println("Static block 2..");
    }
}
