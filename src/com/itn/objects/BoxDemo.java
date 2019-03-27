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
public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        //instanciating bozobject by new keyword using default constructor
        b1.showBox();
        //displays the defaultvalues for instance variable
        System.out.println();
        //assign values for instance variable of object b1
        //instance variables are created only when obects are being created in heap memory
        //indiudial objects have their own set of instance variable
        b1.l=12;
        b1.b=8;
        b1.h=5;
        b1.showVolume();
        b1.showBox();
        b1.openBox();
        
        // when we call a non static methodwe use a referennce of a object
        //so it could perform some action upon that object and it is  a part of class design
        //from within the non-static method the we are able to access instance of variables of an object
        //which is  used to access that method
        
        System.out.println();
        Box b2= new Box();
        b2.l=20;
        b2.b=30;
        b2.h=10;
        b2.showVolume();
        b2.showBox();
        b2.openBox();
    }
 
}
