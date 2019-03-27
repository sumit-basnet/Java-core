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
public interface AudioPlayer {
    //memory of fixed size;
    public  static final long  MEMORY  = 100000000000L;
    // by default  variables are publc static final ie. constant
    int  NO_OF_TRACKS = 1000000;
    
    // methods are by default public abstract 
    public void play();
    public void pause();
    public void stop();
    public void forward();
    public void rewind();
    
    // allows default and static method with method implementation
    public default void powerOn(){
        System.out.println("power On");
    }
    
    public default void powerOff(){
        System.out.println("Powered Off");
    }
    
}
