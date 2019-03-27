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
public class AccessModifier {
    public int a;
    protected int b;
    int c;
    //default if not mentoned any other access specifier
    private int d;
    
    public AccessModifier(){
        //constructor of class
        //default constuctor
        a=10;
        b=11;
        c=12;
        d=13;
        //assigning owr own default values through default constructor
        //otherwise it would take a jvm provided default values
        //which is 0 for integer numbers, o.o for floating,String null;
    }
    //every class in java has an implicit parent class Object which has a method toString we redefine by overridng in this class
    @Override
    public String toString(){
        return "a= "+a+", b= "+b+", c= "+c+", d= "+d;
    }
    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        System.out.println(am.toString());
        am.a=20;
        am.a=30;
        am.c=40;
        am.d=50;
        // all private, default, protected and public mombers are accessible within a class
        System.out.println(am.toString());
    }
}
