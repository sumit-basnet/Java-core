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
public class ThreadByExtends extends Thread{
    @Override
    public void run (){
        System.out.println("thread Started...");
        Thread.currentThread().setName("my thread..");
        System.out.println("Thread: "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ThreadByExtends t1=new ThreadByExtends();
        t1.start(); //starts a noew thread of this thread class
        //the run method method of this thread-class is copied onto newly create thread and run by processor
        //as aseperate thread
        System.out.println("Thread: "+Thread.currentThread().getName());
        //shows this thread is main thread

    }
}
