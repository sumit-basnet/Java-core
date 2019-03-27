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
public class AccessTestSubClass extends AccessModifier {
    // AccessTestSubClass winn inherit public and protected members
    //fromAccessModifier class
    public static void main(String[] args) {
//        AccessModifier at= new AccessModifier();// this is not inheritance 
        AccessTestSubClass at= new AccessTestSubClass();
        System.out.println(at.toString());
        at.a=101;
        at.b=102;// b is accessble through inheritance only 
        System.out.println(at.toString());
        
    }
    
}
