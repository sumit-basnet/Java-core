/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.strings;

/**
 *
 * @author sumit
 */
public class BufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer();
        sb1.append("java core programmng.");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        //        new size= 2n+2;
        sb1.insert(5, " is a ");
        System.out.println(sb1);
        
        sb1.reverse();
        System.out.println(sb1);
    }
 
}
