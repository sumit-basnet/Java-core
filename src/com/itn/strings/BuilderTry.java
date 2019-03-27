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
public class BuilderTry {
    public static void main(String[] args) {
        //creating string-builder object
        StringBuilder sb1= new StringBuilder();
        //default string-builder object
        String s1= "Nepal";
        StringBuilder sb2=new StringBuilder(s1);
        
        System.out.println("Length of sb1 : "+sb1.capacity());
        System.out.println("length of sb2 : "+sb2.capacity());
        
        sb2.append(" is country");
        System.out.println(sb2); //this shows that sb1 is mutuable
        System.out.println(sb2.capacity());
        sb2.append(" of many mountains ");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        // new size= 2n+2 where n is word size
        
        sb2.setLength(100);
        System.out.println("last a appeared in : "+sb2.lastIndexOf("a"));
    }
}
