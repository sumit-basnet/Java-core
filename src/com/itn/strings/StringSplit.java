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
public class StringSplit {
    public static void main(String[] args) {
        String s1= "one, two, , three, four, five";
        String delim=", ";
        //here the split operatio s performed on the basis of delim i.e delimeters
        String [] arr= s1.split(delim);
        for(String s : arr){
                System.out.println(s);
       }  
    }

}
