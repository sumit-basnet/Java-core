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
public class ExplicitDemo {
    public static void main(String[] args) {
        int i=100;
        float f=22.001f;
        byte b=21;
        double d=33.001;
        short s=3100;
        byte b2=(byte)s;
        System.out.println(s);
        System.out.println(b2);
        double g= (d*f)+(s*b)-(i/s);
        long l= (long)(d*f)+(s*b)-(i/s);
        System.out.println(l);
        System.out.println(g);
    }
 
}
