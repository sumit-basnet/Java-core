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
public class Box {
    // instance variables
    int l,b,h;
    //class variables 
    static String brand="ABC Manufactures";
    // behaviours or methods
    public void showVolume (){
        System.out.println("the volume is : "+ (l*b*h));
    }
    public  void openBox(){
        System.out.println("Box Openend ");
    }
    
    
    public void showBox(){
        System.out.println("Box details: ");
        System.out.println("length :"+l);
        System.out.println("breadth :"+b);
        System.out.println("height: "+h);
        System.out.println("company: "+brand);
    }

}
