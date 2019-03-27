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
public class ThreadByImplementsOperation implements Runnable {
    //yesma chai runnable vane matra hunxa
    //tesaile override runnable  operation matra hunxa
    @Override
    public void run (){
        for(int i = 0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+" : "+i);
        try{
            Thread.sleep(1000);
            
        }catch(InterruptedException e){
            System.out.println(e); 
        }
      }
    }
    public static void main(String[] args) {
        ThreadByImplementsOperation tb = new ThreadByImplementsOperation();
//        hamile tb lai directly start gaarna sakdaenau so tb lai hamile  parameter jasari pass gareko xau
        Thread t1= new Thread(tb);
        t1.setPriority(1);
        t1.setName("thread 1");
        t1.start();
        
        Thread t2=new Thread(tb);
        t2.setName("thread 2");
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        
    }
}
