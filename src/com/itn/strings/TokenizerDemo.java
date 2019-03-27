/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.strings;

import java.util.StringTokenizer;

/**
 *
 * @author sumit
 */
public class TokenizerDemo {
    public static void main(String[] args) {
        String s1= "one, two, three, , , four, five";
        StringTokenizer st = new StringTokenizer(s1);
        String delim=", ";
        // this is the process where the spilit is done on the basis of tokens ass the blank space 
        //is not regarded as the token
        
        while (st.hasMoreTokens()){
                 System.out.println(st.nextToken(delim));
        }   
    }

}
