/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;

import com.itn.objects.AccessModifier;

/**
 *
 * @author sumit
 */
public class AccessTestOutsidePackage {
    public static void main(String[] args) {
    AccessModifier at=new AccessModifier();
    //a class when being outside of a its pakage must be imported
    // from that class
    // a constructor should also be declared as ublic for this case
        System.out.println(at.toString());
        at.a=101;
//        at.b=102;// neither a sub-class nor within same  pakage 
//        at.c=103; //not in same pakage
//        at.d=104; //not accessible outside class
        
        System.out.println(at.toString());
    }
    
}
