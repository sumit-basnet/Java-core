/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author sumit
 */
public class CreatingObjcts {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
        //creating object using default constructor
        Book b1=new Book();
        b1.sn=1001;
        b1.title="ramayan";
        b1.author="balmiki";
        b1.publisher="Gita press";
        b1.price=500;
        //2. USING newInstance() method of Class class
        Class c=Class.forName("com.itn.objects.Book");
         Book b2=(Book)c.newInstance();
         b2.sn=1002;
           
         //3.USING Constructor class
         Constructor c1= Book.class.getDeclaredConstructor();
         Book b3=(Book) c1.newInstance();
         b3.sn=10001;
         
         Book b4 =(Book) b1.clone();
         b4.sn=1004;
         b1.showBook();
         b2.showBook();
         b3.showBook();
         b4.showBook();
         
    
    }
}
