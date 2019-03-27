/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.datatypes;

/**
 *
 * @author sumit
 */
public class ImpilicitDemo {
    public static void main(String[] args) {
        int i;
        byte b=100;
        i=b;
        //implicit conversion form byte to int type
        System.out.println(b);
        System.out.println(i);
    }
    
}
