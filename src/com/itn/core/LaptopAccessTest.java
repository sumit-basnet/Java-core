/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;
import Assignment2.Laptop;
/**
 *
 * @author sumit
 */
public class LaptopAccessTest extends Laptop {
    public static void main(String[] args) {
        Laptop L2=new Laptop();
//        L2.name="acer"; // error occurs
        L2.model="triton";
//      L2.price=270000.00; //error occurs as the variable  is protected 
        LaptopAccessTest L3= new LaptopAccessTest();
//        L3.name="acer";
        L3.model="triton";
        L3.price=300000.00;
        System.out.println(L2.toString());
        System.out.println(L3.toString());
        
     
    }
   
}
