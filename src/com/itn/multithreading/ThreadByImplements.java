/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.multithreading;

/**
 *
 * @author sumit
 */
public class ThreadByImplements implements Runnable {
    //runnable is the interface 
    // it only implements the run method 
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ ": "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
    public static void main(String[] args) {
        ThreadByImplements tbi= new ThreadByImplements();
        //we cannot start tbi directly  so we need to give thread as the arguement
        Thread t1= new Thread(tbi);
        t1.setName("Thread 1");
        t1.setPriority(1);
        t1.start();
        
        Thread t2= new Thread(tbi);
        t2.setName("Thread 2 ");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
 
}
