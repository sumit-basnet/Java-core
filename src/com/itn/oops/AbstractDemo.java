/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author sumit
 */
public abstract class AbstractDemo {
    public String  key;
    public int value;
    
    public AbstractDemo(String key, int value){
        this.key=key;
        this.value=value;
    }
    
    public void get(){
        System.out.println("key is : "+this.key);
        System.out.println("value is : "+this.value);
    }
    
    public abstract void set();
}
