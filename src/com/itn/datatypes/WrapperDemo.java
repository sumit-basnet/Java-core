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
public class WrapperDemo {
    public static void main(String[] args) {
        int i=10;
//        1. ie. no other functions are avilable  with premitive type
//      we use premitive type only to create variables
//      and store data of that type
        Integer a =new Integer(10);
        Integer b=i; // auto-boxing
        System.out.println(b.toString());
        System.out.println(b= Integer.parseInt("100"));
        a= Integer.valueOf("100");
        i=a;
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        

    }
}
