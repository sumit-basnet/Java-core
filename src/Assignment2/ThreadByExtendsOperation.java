/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author sumit
 */
public class ThreadByExtendsOperation extends Thread{
    //yesma chai sabai thread ko operation possible xa
   @Override
    public void run(){
       System.out.println("thread started : ");
       Thread.currentThread().setName("My thread... ");
       // yo chai thread ko name  ho 
       System.out.println("Thread : "+Thread.currentThread().getName());
       //yeslechai kun thread chalerako xa vane bujhauxa
    
   } 
    public static void main(String[] args) {
        ThreadByExtendsOperation t1= new ThreadByExtendsOperation();
        t1.start();
        //yesle chai naya thread start garxa yo thread class ko 
        //yo chai naya thread banera processor ma chalxa
        System.out.println("Thread : "+Thread.currentThread().getName());
        //yesle chai current thread ko name dine kaam gaarxa yesma chai thread ko name main hunxa
        
                
    }
}
