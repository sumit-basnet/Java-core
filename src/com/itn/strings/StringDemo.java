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
public class StringDemo {
    public static void main(String[] args) {
        String s1= "Nepal";
        String s2="Nepal";
        // the lterals are not duplicated as the s2 and  s3 point to the same literls
        String s3= new String("Nepal");
        //here the s2 is created in literls space where s3 s created in object space
        System.out.println("S1 and S2 are equal : "+(s1==s2));
        System.out.println("S2 and S3 are equal : "+(s2==s3));
        //equals-to operator compares strng object
        // so we should not use == operator to compare string value
        //as the s2 and s3 are of different object 
        
        System.out.println("S1 and S2 are equal : "+(s1.equals(s2)));
        System.out.println("S2 and S3 are equal : "+(s2.equals(s3)));
        //equals method is used to compare values of string object 
        
        byte [] vals={97,98,99};
        String s4 =new  String (vals);
        System.out.println(s4);
        
        char[] chars={'A','B','C'};
        String s5= new String (chars);
        System.out.println(s5.concat(s4));
        System.out.println(s5);
        //it doesnot modify the original string but makes the new string 
        // string is immutable so the original content of string is not modified
        //the concat method returns a new string object instead of modifying original string object
        
        
    }
}
