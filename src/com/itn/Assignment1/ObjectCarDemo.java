/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Assignment1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author sumit
 */
public class ObjectCarDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
            NoSuchMethodException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
        //by type one mathod that is just a normal methpd
        ObjectCar c1=new ObjectCar();
        c1.sn=1;
        c1.name="tata";
        c1.model="sumo";
        c1.type="Suv";
        c1.display();
        // aaba name ani aaru  kura haru harek ko  lagi programmer le rakhna aalxi lagpaxi yesto gaarne ho :D
        ObjectCar c2= new ObjectCar();
        c2.input();
        c2.display();
        
        //2. by nexy type as meantioned is the example i.e CreatingObjects.java
        Class c=Class.forName("com.itn.Assignment1.ObjectCar");
        //yesma hamile c vaneko class ko nai object or simply hamile yesar ni bujhna sakxau ki Class c le "com.itn.----" tesko class
        //lai copy gareko
        //Class c vaneko class ko nai class ho
        // throws ClassNotFoundException yesto exception halnu paarxa as yedi class vetena vane  program ma error na aayera exception 
        //ma jaaos vanera
        
        //now aaba chai object of class banaune  
        
        ObjectCar c3= (ObjectCar) c.newInstance();
        //InstantiationException, IllegalAccessException yesto exception halnu paarxa same as above
        // here =(ObjectCar) vanera chai objectko type casting gareko ho as c.instance kunai pani object banauna sakxa jun ObjectCar 
        //sanga milna pani sakxa and namilna ni sakxa
        c3.input();
        c3.display();
        
        //now 3. ma chai ali naya  paara le banaune ho this pani sir le  garanunu vako jasto nai ho 
        //using constructor class
        
        Constructor c4=ObjectCar.class.getDeclaredConstructor();
        //yesma  chai hamile Constructor c4 ma ObjectCar ko constructor banayeko hooou ani getDeclaredConstructor() le chai
        //tyoe ObjectCar ma vako constructor pathaa vaneko ho as (); empty xa kinaki the used constructor in ObjectCar is default contructor
        //IllegalAccessException, NoSuchMethodException yesto throw falxa error handling gaarna lai 
        //java.lang.reflect.Constructor yo chai ekdum powerful tool ho
        ObjectCar c5=(ObjectCar) c4.newInstance();
        //yesle chai c4 ko constructor bata object banayeko ho ani c5 vaneko chai variable this concept is same as object concept ho
        //NoSuchMethodException, IllegalArgumentException, InvocationTargetException yesto throw falxa
        
        
        c5.input();
        c5.display();
        
        /* aaba chai cloning gaarne */
        
        // for this ObjectCar ma declaration ma public class ObjectCar implements Cloneable{ } thpane
        // aab its ready to be cloned
         
        ObjectCar cc = (ObjectCar) c1.clone();
        //InvocationTargetException, CloneNotSupportedException
        cc.sn=111;
        cc.display();
        
    }
}
