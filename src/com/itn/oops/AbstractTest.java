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
public class AbstractTest extends AbstractDemo {
    public String desc;

    public AbstractTest(String key, int value,String desc) {
        super(key, value);
        this.desc=desc;
        
    }
    
    @Override
    public void get(){
        System.out.println("key is : "+key);
        System.out.println("value : "+value);
        System.out.println("Desc : "+desc);
    }
    
   
 

    @Override
    public void set() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       public static void main(String[] args) {
        AbstractDemo ad=new AbstractTest("score",23,"new score");
        System.out.println(ad.key);
        System.out.println(ad.value);
        ad.get();
        
        AbstractDemo  add= new AbstractTest("score 1",45,"very new score");
           System.out.println(add.key);
           System.out.println(add.value);
           add.get();
    }
}
